package org.springframework.samples.petclinic.monomorph.id.generated.server;

import io.grpc.stub.StreamObserver;
import org.springframework.samples.petclinic.monomorph.id.generated.proto.ownerrepository.*;
import org.springframework.samples.petclinic.monomorph.id.shared.server.LeaseManager;
import org.springframework.samples.petclinic.monomorph.id.shared.server.ServerObjectManager;
import org.springframework.samples.petclinic.monomorph.id.shared.RefactoredObjectID;
import org.springframework.samples.petclinic.monomorph.id.generated.helpers.ServiceRegistry;
import org.springframework.samples.petclinic.monomorph.id.generated.helpers.ClassIdRegistry;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.PetType;
import org.springframework.samples.petclinic.monomorph.dto.generated.server.OwnerMapper;
import org.springframework.samples.petclinic.monomorph.dto.generated.server.PetTypeMapper;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.owner.OwnerDTO;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pettype.PetTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * gRPC Service implementation for OwnerRepository.
 * - Handles gRPC requests for OwnerRepository API.
 * - Creates transient OwnerRepository instances.
 * - Interacts with LeaseManager for instance registration/retrieval.
 * - Calls business methods on retrieved OwnerRepository instances.
 */
public class OwnerRepositoryImpl extends OwnerRepositoryServiceGrpc.OwnerRepositoryServiceImplBase implements ServerObjectManager<OwnerRepository> {

    private final LeaseManager leaseManager;
    private final String serviceId;

    @Autowired
    private ApplicationContext applicationContext;

    // Static identifier for the class type managed by this service
    public static final String CLASS_ID = ClassIdRegistry.getClassId("OwnerRepository");

    public OwnerRepositoryImpl(LeaseManager leaseManager) {
        this.leaseManager = Objects.requireNonNull(leaseManager);
        this.serviceId = ServiceRegistry.getServiceId();
    }

    // --- createObject gRPC Method Implementation ---

    @Override
    public void createObject(CreateObjectRequest request, StreamObserver<RefactoredObjectID> responseObserver) {
        try {
            // 1. Extract args & client ID
            String clientId = request.getClientID();
            // ConstructorArgs is empty for this interface

            // 2. OwnerRepository is an interface, so we get the Spring-managed instance
            OwnerRepository newInstance = applicationContext.getBean(OwnerRepository.class);

            // 3. Generate a RefactoredObjectID
            RefactoredObjectID responseProto = toID(newInstance);

            // 4. Send the response
            responseObserver.onNext(responseProto);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    // --- Start of ServerObjectManager method implementations ---

    @Override
    public RefactoredObjectID toID(OwnerRepository instance) {
        // Validate if id instance exists
        String instanceId = leaseManager.findInstanceIdForInstance(instance);
        if (instanceId == null) {
            // Generate a new unique instance ID
            instanceId = UUID.randomUUID().toString();

            // Register with LeaseManager - assuming clientId is available in this context
            // If not available, may need to be passed as a parameter
            boolean registered = leaseManager.registerInstanceAndGrantLease(
                instanceId, CLASS_ID, instance, "default-client-id");
            if (!registered) {
                throw new RuntimeException("Failed to register new instance ID: " + instanceId);
            }
        }

        // Build RefactoredObjectID
        return RefactoredObjectID.newBuilder()
            .setInstanceID(instanceId)
            .setClassID(CLASS_ID)
            .setServiceID(this.serviceId)
            .build();
    }

    @Override
    public OwnerRepository fromID(RefactoredObjectID id) {
        // Validate the class ID
        if (id.getClassID() == null || !id.getClassID().equals(CLASS_ID)) {
            throw new IllegalArgumentException("class ID mismatch: expected " + CLASS_ID + ", got " + id.getClassID());
        }

        // Retrieve the instance from LeaseManager
        OwnerRepository instance = (OwnerRepository) leaseManager.getInstance(id.getInstanceID());
        if (instance == null) {
            throw new IllegalArgumentException("No instance found for ID: " + id);
        }
        return instance;
    }

    @Override
    public String getManagedClassId() {
        return CLASS_ID;
    }

    @Override
    public String getServiceId() {
        return serviceId;
    }
    // --- End of ServerObjectManager method implementations ---

    // --- Implementation of gRPC methods defined in the proto file ---

    @Override
    public void findPetTypes(FindPetTypesRequest request, StreamObserver<FindPetTypesResponse> responseObserver) {
        try {
            // 1. Get the OwnerRepository instance
            OwnerRepository repository = fromID(request.getRefactoredObjectID());

            // 2. Call the business method
            List<PetType> petTypes = repository.findPetTypes();

            // 3. Map to DTOs
            List<PetTypeDTO> petTypeDTOs = petTypes.stream()
                .map(petType -> PetTypeMapper.INSTANCE.toDTO(petType))
                .collect(Collectors.toList());

            // 4. Build and send the response
            FindPetTypesResponse response = FindPetTypesResponse.newBuilder()
                .addAllPetTypes(petTypeDTOs)
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void save(SaveRequest request, StreamObserver<SaveResponse> responseObserver) {
        try {
            // 1. Get the OwnerRepository instance
            OwnerRepository repository = fromID(request.getRefactoredObjectID());

            // 2. Convert DTO to domain object
            Owner owner = OwnerMapper.INSTANCE.fromDTO(request.getOwner());

            // 3. Call the business method
            repository.save(owner);

            // 4. Build and send the response (empty for void methods)
            SaveResponse response = SaveResponse.newBuilder().build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void findById(FindByIdRequest request, StreamObserver<FindByIdResponse> responseObserver) {
        try {
            // 1. Get the OwnerRepository instance
            OwnerRepository repository = fromID(request.getRefactoredObjectID());

            // 2. Call the business method
            Owner owner = repository.findById(request.getId());

            // 3. Convert domain object to DTO
            OwnerDTO ownerDTO = OwnerMapper.INSTANCE.toDTO(owner);

            // 4. Build and send the response
            FindByIdResponse response = FindByIdResponse.newBuilder()
                .setOwner(ownerDTO)
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
}
