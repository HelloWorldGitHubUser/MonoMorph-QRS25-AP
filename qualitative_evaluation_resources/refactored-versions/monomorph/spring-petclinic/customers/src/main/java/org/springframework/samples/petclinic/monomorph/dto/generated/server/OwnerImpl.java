package org.springframework.samples.petclinic.monomorph.dto.generated.server;

import io.grpc.stub.StreamObserver;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.owner.*;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pet.PetDTO;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.visit.VisitDTO;
import org.springframework.samples.petclinic.monomorph.dto.generated.client.Visit;

import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.monomorph.dto.generated.server.PetMapper;

/**
 * gRPC Service implementation for Owner.
 * - Handles gRPC requests for Owner API.
 * - Interacts with Mapper for switching between DTO and Owner instances.
 */
public class OwnerImpl extends OwnerServiceGrpc.OwnerServiceImplBase {

    @Override
    public void getPetByName(GetPetByNameRequest request, StreamObserver<GetPetResponse> responseObserver) {
        // Extract the DTO and parameters from the request
        OwnerDTO ownerDTO = request.getOwner();
        String petName = request.getName();

        // Map the DTO to the domain object
        Owner owner = OwnerMapper.INSTANCE.fromDTO(ownerDTO);

        // Call the domain method
        Pet pet = owner.getPet(petName);

        // Prepare the response
        GetPetResponse.Builder responseBuilder = GetPetResponse.newBuilder();

        // If a pet was found, convert it to DTO
        if (pet != null) {
            PetDTO petDTO = PetMapper.INSTANCE.toDTO(pet);
            responseBuilder.setPet(petDTO);
        }

        // Send the response
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getPetById(GetPetByIdRequest request, StreamObserver<GetPetResponse> responseObserver) {
        // Extract the DTO and parameters from the request
        OwnerDTO ownerDTO = request.getOwner();
        int petId = request.getId();

        // Map the DTO to the domain object
        Owner owner = OwnerMapper.INSTANCE.fromDTO(ownerDTO);

        // Call the domain method
        Pet pet = owner.getPet(petId);

        // Prepare the response
        GetPetResponse.Builder responseBuilder = GetPetResponse.newBuilder();

        // If a pet was found, convert it to DTO
        if (pet != null) {
            PetDTO petDTO = PetMapper.INSTANCE.toDTO(pet);
            responseBuilder.setPet(petDTO);
        }

        // Send the response
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getPetByNameWithIgnoreFlag(GetPetByNameWithIgnoreFlagRequest request,
                                          StreamObserver<GetPetResponse> responseObserver) {
        // Extract the DTO and parameters from the request
        OwnerDTO ownerDTO = request.getOwner();
        String petName = request.getName();
        boolean ignoreNew = request.getIgnoreNew();

        // Map the DTO to the domain object
        Owner owner = OwnerMapper.INSTANCE.fromDTO(ownerDTO);

        // Call the domain method
        Pet pet = owner.getPet(petName, ignoreNew);

        // Prepare the response
        GetPetResponse.Builder responseBuilder = GetPetResponse.newBuilder();

        // If a pet was found, convert it to DTO
        if (pet != null) {
            PetDTO petDTO = PetMapper.INSTANCE.toDTO(pet);
            responseBuilder.setPet(petDTO);
        }

        // Send the response
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void addVisit(AddVisitRequest request, StreamObserver<AddVisitResponse> responseObserver) {
        // Extract the DTO and parameters from the request
        OwnerDTO ownerDTO = request.getOwner();
        int petId = request.getPetId();
        VisitDTO visitDTO = request.getVisit();

        // Map the DTOs to domain objects
        Owner owner = OwnerMapper.INSTANCE.fromDTO(ownerDTO);

        // Convert VisitDTO to Visit client proxy
        Visit visit = Visit.fromDTO(visitDTO);

        // Call the domain method
        owner.addVisit(petId, visit);

        // Since the Owner object is modified, map it back to DTO
        OwnerDTO updatedOwnerDTO = OwnerMapper.INSTANCE.toDTO(owner);

        // Prepare and send the response
        AddVisitResponse response = AddVisitResponse.newBuilder()
                .setOwner(updatedOwnerDTO)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
