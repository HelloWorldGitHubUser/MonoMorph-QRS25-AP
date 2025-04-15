package org.springframework.samples.petclinic.monomorph.dto.generated.server;

import io.grpc.stub.StreamObserver;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pet.*;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pettype.PetTypeDTO;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.visit.VisitDTO;

import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.monomorph.dto.generated.client.Visit;
import org.springframework.samples.petclinic.monomorph.dto.generated.server.PetTypeMapper;

/
 * gRPC Service implementation for Pet.
 * - Handles gRPC requests for Pet API.
 * - Interacts with Mapper for switching between DTO and Pet instances.
 */

public class PetImpl extends PetServiceGrpc.PetServiceImplBase {

    /
     * Implementation of the AddVisit RPC method.
     * Maps DTOs to domain objects, calls the addVisit method,
     * and returns the updated Pet as DTO.
     *
     * @param request The AddVisitRequest containing the pet and visit DTOs
     * @param responseObserver The observer for sending the response
     */
    @Override
    public void addVisit(AddVisitRequest request, StreamObserver<AddVisitResponse> responseObserver) {
        // Retrieve the DTOs from the request
        PetDTO petDto = request.getPet();
        VisitDTO visitDto = request.getVisit();

        // Map the Pet DTO to the domain object
        Pet pet = PetMapper.INSTANCE.fromDTO(petDto);

        // Map the Visit DTO to the domain client object
        Visit visitClient = Visit.fromDTO(visitDto);

        // Call the business logic method
        pet.addVisit(visitClient);

        // Map the updated Pet back to DTO
        PetDTO updatedPetDto = PetMapper.INSTANCE.toDTO(pet);

        // Build the response
        AddVisitResponse response = AddVisitResponse.newBuilder()
                .setUpdatedPet(updatedPetDto)
                .build();

        // Send the response
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
