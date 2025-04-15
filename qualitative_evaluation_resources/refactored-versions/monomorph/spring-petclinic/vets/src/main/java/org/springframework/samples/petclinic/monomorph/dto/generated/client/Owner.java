package org.springframework.samples.petclinic.monomorph.dto.generated.client;

// gRPC imports
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.owner.*;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pet.PetDTO;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.visit.VisitDTO;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.samples.petclinic.monomorph.id.generated.helpers.ServiceRegistry;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Auto-generated DTO gRPC client
 * {@link Owner} and {@link OwnerDTO}.
 */
public class Owner {
    private OwnerDTO dtoInstance;

    // Default constructor
    public Owner() {
        this.dtoInstance = OwnerDTO.newBuilder().build();
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up RPC connection", e);
        }
    }

    // Constructor with DTO instance
    public Owner(OwnerDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up RPC connection", e);
        }
    }

    // Constructor matching the original Owner class
    // Note: Using setters to ensure business logic is maintained
    public Owner(String firstName, String lastName, String address, String city, String telephone) {
        this.dtoInstance = OwnerDTO.newBuilder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAddress(address)
                .setCity(city)
                .setTelephone(telephone)
                .setNew(true)
                .build();
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up RPC connection", e);
        }
    }

    // mapping methods
    public OwnerDTO toDTO() {
        return this.dtoInstance;
    }

    public static Owner fromDTO(OwnerDTO dtoInstance) {
        return new Owner(dtoInstance);
    }

    // implementation of the gRPC exposed methods

    // TARGET_SERVICE_ID is the unique ID for the ClassA service, provided by the tool
    private static final String TARGET_SERVICE_ID = "customers";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel; // Channel for RPC calls
    private OwnerServiceGrpc.OwnerServiceBlockingStub businessStub; // Use this stub for RPC calls

    // Helper methods for gRPC
    protected void performRpcSetup() throws Exception {
        // Use the static TARGET_SERVICE_ID to find the endpoint for business logic calls
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort()).usePlaintext().build();
        this.businessStub = OwnerServiceGrpc.newBlockingStub(businessChannel);
    }

    protected void performSubclassRpcCleanup() {
        // ... shutdown logic for businessChannel ...
         if (this.businessChannel != null && !this.businessChannel.isShutdown()) {
             try {
                 this.businessChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
                  if (!this.businessChannel.isTerminated()) { this.businessChannel.shutdownNow(); }
             } catch (InterruptedException e) {  }
         }
    }

    // Implement required methods for gRPC calls here
    // --- START OF gRPC METHOD IMPLEMENTATIONS ---

    /**
     * Return the Pet with the given name, or null if none found for this Owner.
     *
     * @param name to test
     * @return a pet if pet name is already in use
     */
    public Pet getPet(String name) {
        GetPetByNameRequest request = GetPetByNameRequest.newBuilder()
                .setOwner(this.dtoInstance)
                .setName(name)
                .build();

        GetPetResponse response = businessStub.getPetByName(request);

        if (response.hasPet()) {
            return Pet.fromDTO(response.getPet());
        }

        return null;
    }

    /**
     * Return the Pet with the given id, or null if none found for this Owner.
     *
     * @param id to test
     * @return a pet if pet id is already in use
     */
    public Pet getPet(Integer id) {
        GetPetByIdRequest request = GetPetByIdRequest.newBuilder()
                .setOwner(this.dtoInstance)
                .setId(id)
                .build();

        GetPetResponse response = businessStub.getPetById(request);

        if (response.hasPet()) {
            return Pet.fromDTO(response.getPet());
        }

        return null;
    }

    /**
     * Return the Pet with the given name, or null if none found for this Owner.
     *
     * @param name to test
     * @param ignoreNew flag
     * @return a pet if pet name is already in use
     */
    public Pet getPet(String name, boolean ignoreNew) {
        GetPetByNameWithIgnoreFlagRequest request = GetPetByNameWithIgnoreFlagRequest.newBuilder()
                .setOwner(this.dtoInstance)
                .setName(name)
                .setIgnoreNew(ignoreNew)
                .build();

        GetPetResponse response = businessStub.getPetByNameWithIgnoreFlag(request);

        if (response.hasPet()) {
            return Pet.fromDTO(response.getPet());
        }

        return null;
    }

    /**
     * Adds the given {@link Visit} to the {@link Pet} with the given identifier.
     *
     * @param petId the identifier of the {@link Pet}, must not be {@literal null}.
     * @param visit the visit to add, must not be {@literal null}.
     */
    public Owner addVisit(Integer petId, Visit visit) {
        Assert.notNull(petId, "Pet identifier must not be null!");
        Assert.notNull(visit, "Visit must not be null!");

        AddVisitRequest request = AddVisitRequest.newBuilder()
                .setOwner(this.dtoInstance)
                .setPetId(petId)
                .setVisit(visit.toDTO())
                .build();

        AddVisitResponse response = businessStub.addVisit(request);

        // Update this owner's DTO with the response
        this.dtoInstance = response.getOwner();

        return this;
    }

    // Local method (not part of gRPC service but needed for compatibility)
    public void addPet(Pet pet) {
        if (pet.isNew()) {
            // Create a new DTO builder with all existing values
            OwnerDTO.Builder builder = this.dtoInstance.toBuilder();

            // Add the new pet to the list
            builder.addPets(pet.toDTO());

            // Update the DTO instance
            this.dtoInstance = builder.build();
        }
    }

    // Local method (not part of gRPC service but needed for compatibility)
    public List<Pet> getPets() {
        List<Pet> pets = new ArrayList<>();

        for (PetDTO petDTO : this.dtoInstance.getPetsList()) {
            pets.add(Pet.fromDTO(petDTO));
        }

        return pets;
    }

    // --- END OF gRPC METHOD IMPLEMENTATIONS ---

    // Implement all other getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---

    public Integer getId() {
        return this.dtoInstance.getId();
    }

    public void setId(Integer id) {
        this.dtoInstance = this.dtoInstance.toBuilder().setId(id).build();
    }

    public boolean isNew() {
        return this.dtoInstance.getNew();
    }

    public void setNew(boolean isNew) {
        this.dtoInstance = this.dtoInstance.toBuilder().setNew(isNew).build();
    }

    public String getLastName() {
        return this.dtoInstance.getLastName();
    }

    public void setLastName(String lastName) {
        this.dtoInstance = this.dtoInstance.toBuilder().setLastName(lastName).build();
    }

    public String getFirstName() {
        return this.dtoInstance.getFirstName();
    }

    public void setFirstName(String firstName) {
        this.dtoInstance = this.dtoInstance.toBuilder().setFirstName(firstName).build();
    }

    public String getAddress() {
        return this.dtoInstance.getAddress();
    }

    public void setAddress(String address) {
        this.dtoInstance = this.dtoInstance.toBuilder().setAddress(address).build();
    }

    public String getCity() {
        return this.dtoInstance.getCity();
    }

    public void setCity(String city) {
        this.dtoInstance = this.dtoInstance.toBuilder().setCity(city).build();
    }

    public String getTelephone() {
        return this.dtoInstance.getTelephone();
    }

    public void setTelephone(String telephone) {
        this.dtoInstance = this.dtoInstance.toBuilder().setTelephone(telephone).build();
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + getId() +
                ", new=" + isNew() +
                ", lastName='