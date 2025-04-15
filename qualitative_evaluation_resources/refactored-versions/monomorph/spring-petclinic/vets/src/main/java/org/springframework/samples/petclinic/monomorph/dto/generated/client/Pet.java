package org.springframework.samples.petclinic.monomorph.dto.generated.client;

// gRPC imports
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pet.*;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pettype.PetTypeDTO;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.visit.VisitDTO;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.samples.petclinic.monomorph.id.generated.helpers.ServiceRegistry;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**:
 * Auto-generated DTO gRPC client
 * {@link Pet} and {@link PetDTO}.
 */
public class Pet extends NamedEntity {
    private PetDTO dtoInstance;

    // Default constructor
    public Pet() {
        super();
        this.dtoInstance = PetDTO.newBuilder().build();
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize gRPC setup", e);
        }
    }

    // Constructor that matches the original Pet class
    public Pet(String name) {
        super(name);
        this.dtoInstance = PetDTO.newBuilder().setName(name).build();
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize gRPC setup", e);
        }
    }

    // Private constructor that takes a PetDTO
    private Pet(PetDTO dtoInstance) {
        super();
        this.dtoInstance = dtoInstance;
        if (dtoInstance.getName() != null && !dtoInstance.getName().isEmpty()) {
            setName(dtoInstance.getName());
        }
        if (dtoInstance.getId() != 0) {
            setId(dtoInstance.getId());
        }
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize gRPC setup", e);
        }
    }

    // mapping methods
    public PetDTO toDTO() {
        PetDTO.Builder builder = PetDTO.newBuilder()
            .setId(getId())
            .setName(getName());

        if (getBirthDate() != null) {
            builder.setBirthDate(getBirthDate().toString());
        }

        if (getType() != null) {
            builder.setType(getType().toDTO());
        }

        if (getVisits() != null) {
            for (Visit visit : getVisits()) {
                builder.addVisits(visit.toDTO());
            }
        }

        return builder.build();
    }

    public static Pet fromDTO(PetDTO dtoInstance) {
        return new Pet(dtoInstance);
    }

    // implementation of the gRPC exposed methods

    // TARGET_SERVICE_ID is the unique ID for the ClassA service, provided by the tool
    private static final String TARGET_SERVICE_ID = "customers";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel; // Channel for RPC calls
    private PetServiceGrpc.PetServiceBlockingStub businessStub; // Use this stub for RPC calls

    // Helper methods for gRPC
    protected void performRpcSetup() throws Exception {
        // Use the static TARGET_SERVICE_ID to find the endpoint for business logic calls
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort()).usePlaintext().build();
        this.businessStub = PetServiceGrpc.newBlockingStub(businessChannel);
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
    public void addVisit(Visit visit) {
        AddVisitRequest request = AddVisitRequest.newBuilder()
            .setPet(this.toDTO())
            .setVisit(visit.toDTO())
            .build();

        AddVisitResponse response = businessStub.addVisit(request);

        // Update local state with the response
        this.dtoInstance = response.getUpdatedPet();

        // Make sure our visits collection is updated
        if (getVisits() == null) {
            Set<Visit> visits = new LinkedHashSet<>();
            visits.add(visit);
            // No need to setVisits as the response will include the updated Pet
        } else {
            getVisits().add(visit);
        }
    }
    // --- END OF gRPC METHOD IMPLEMENTATIONS ---

    // Implement all other getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---
    public void setBirthDate(LocalDate birthDate) {
        PetDTO.Builder builder = PetDTO.newBuilder(dtoInstance);
        if (birthDate != null) {
            builder.setBirthDate(birthDate.toString());
        } else {
            builder.clearBirthDate();
        }
        this.dtoInstance = builder.build();
    }

    public LocalDate getBirthDate() {
        String birthDateStr = dtoInstance.getBirthDate();
        return birthDateStr != null && !birthDateStr.isEmpty() ? LocalDate.parse(birthDateStr) : null;
    }

    public PetType getType() {
        return dtoInstance.hasType() ? PetType.fromDTO(dtoInstance.getType()) : null;
    }

    public void setType(PetType type) {
        PetDTO.Builder builder = PetDTO.newBuilder(dtoInstance);
        if (type != null) {
            builder.setType(type.toDTO());
        } else {
            builder.clearType();
        }
        this.dtoInstance = builder.build();
    }

    public Collection<Visit> getVisits() {
        List<VisitDTO> visitDTOs = dtoInstance.getVisitsList();
        if (visitDTOs == null || visitDTOs.isEmpty()) {
            return new LinkedHashSet<>();
        }

        return visitDTOs.stream()
            .map(Visit::fromDTO)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private void setVisits(Collection<Visit> visits) {
        PetDTO.Builder builder = PetDTO.newBuilder(dtoInstance);
        builder.clearVisits();

        if (visits != null && !visits.isEmpty()) {
            for (Visit visit : visits) {
                builder.addVisits(visit.toDTO());
            }
        }

        this.dtoInstance = builder.build();
    }
    // --- END OF DTO GETTERS AND SETTERS ---
}
