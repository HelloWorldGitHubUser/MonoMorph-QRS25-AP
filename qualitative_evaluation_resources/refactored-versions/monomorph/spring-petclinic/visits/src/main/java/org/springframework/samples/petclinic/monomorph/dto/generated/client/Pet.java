package org.springframework.samples.petclinic.monomorph.dto.generated.client;

// gRPC imports
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pet.*;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pettype.PetTypeDTO;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.visit.VisitDTO;
import org.springframework.samples.petclinic.monomorph.dto.generated.server.VisitMapper;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.samples.petclinic.monomorph.id.generated.helpers.ServiceRegistry;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Auto-generated DTO gRPC client
 * {@link Pet} and {@link PetDTO}.
 */
public class Pet {
    private PetDTO dtoInstance;

    // Default constructor
    public Pet() {
        this.dtoInstance = PetDTO.newBuilder().build();
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up RPC client", e);
        }
    }

    // Private constructor from DTO
    private Pet(PetDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up RPC client", e);
        }
    }

    // mapping methods
    public PetDTO toDTO() {
        return this.dtoInstance;
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
        this.businessStub = PetServiceGrpc.newBlockingStub(this.businessChannel);
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
     * Implementation of addVisit method that calls the remote gRPC service
     */
    public void addVisit(org.springframework.samples.petclinic.monomorph.dto.generated.client.Visit visit) {
        // Convert Visit to VisitDTO
        VisitDTO visitDTO = VisitMapper.INSTANCE.toDTO(visit);

        // Create request with current pet DTO and visit DTO
        AddVisitRequest request = AddVisitRequest.newBuilder()
            .setPet(this.dtoInstance)
            .setVisit(visitDTO)
            .build();

        // Call remote service
        AddVisitResponse response = this.businessStub.addVisit(request);

        // Update local DTO with the updated pet from response
        this.dtoInstance = response.getUpdatedPet();
    }

    // --- END OF gRPC METHOD IMPLEMENTATIONS ---

    // Implement all other getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---

    public Integer getId() {
        return dtoInstance.getId();
    }

    public void setId(Integer id) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setId(id)
            .build();
    }

    public String getName() {
        return dtoInstance.getName();
    }

    public void setName(String name) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setName(name)
            .build();
    }

    public LocalDate getBirthDate() {
        if (dtoInstance.getBirthDate() == null || dtoInstance.getBirthDate().isEmpty()) {
            return null;
        }
        return LocalDate.parse(dtoInstance.getBirthDate(), DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public void setBirthDate(LocalDate birthDate) {
        String birthDateStr = birthDate != null ? birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE) : "";
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setBirthDate(birthDateStr)
            .build();
    }

    public PetType getType() {
        if (!dtoInstance.hasType()) {
            return null;
        }
        return PetType.fromDTO(dtoInstance.getType());
    }

    public void setType(PetType type) {
        PetTypeDTO typeDTO = type != null ? type.toDTO() : null;

        PetDTO.Builder builder = this.dtoInstance.toBuilder();
        if (typeDTO != null) {
            builder.setType(typeDTO);
        } else {
            builder.clearType();
        }

        this.dtoInstance = builder.build();
    }

    public Collection<org.springframework.samples.petclinic.monomorph.dto.generated.client.Visit> getVisits() {
        return dtoInstance.getVisitsList().stream()
            .map(visitDTO -> VisitMapper.INSTANCE.fromDTO(visitDTO))
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    // This setter isn't in the original class but could be useful
    public void setVisits(Set<org.springframework.samples.petclinic.monomorph.dto.generated.client.Visit> visits) {
        PetDTO.Builder builder = this.dtoInstance.toBuilder();
        builder.clearVisits();

        if (visits != null) {
            for (org.springframework.samples.petclinic.monomorph.dto.generated.client.Visit visit : visits) {
                builder.addVisits(VisitMapper.INSTANCE.toDTO(visit));
            }
        }

        this.dtoInstance = builder.build();
    }

    // --- END OF DTO GETTERS AND SETTERS ---
}
