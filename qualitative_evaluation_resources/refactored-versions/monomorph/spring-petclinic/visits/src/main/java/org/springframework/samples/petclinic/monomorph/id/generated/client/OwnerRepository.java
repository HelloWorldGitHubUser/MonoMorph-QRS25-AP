package org.springframework.samples.petclinic.monomorph.id.generated.client;

import org.springframework.samples.petclinic.monomorph.id.shared.client.AbstractRefactoredClient;
import org.springframework.samples.petclinic.monomorph.id.generated.helpers.ServiceRegistry;
import org.springframework.samples.petclinic.monomorph.id.shared.RefactoredObjectID;

// gRPC imports
import org.springframework.samples.petclinic.monomorph.id.generated.proto.ownerrepository.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

// DTO imports
import org.springframework.samples.petclinic.monomorph.dto.generated.client.Owner;
import org.springframework.samples.petclinic.monomorph.dto.generated.client.PetType;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.owner.OwnerDTO;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pettype.PetTypeDTO;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class OwnerRepository extends AbstractRefactoredClient {

    // TARGET_SERVICE_ID is the unique ID for the service, provided by the tool
    private static final String TARGET_SERVICE_ID = "customers";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel; // Channel for RPC calls
    private OwnerRepositoryServiceGrpc.OwnerRepositoryServiceBlockingStub businessStub; // Use this stub for RPC calls

    /** Default constructor. */
    public OwnerRepository() {
        super();
    }

    /** Private constructor used by the fromID factory. */
    private OwnerRepository(RefactoredObjectID existingId) {
        super(existingId); // Use the base constructor for existing IDs
    }

    // --- Implementation of Abstract Methods ---

    @Override
    protected void performRpcSetup() throws Exception {
        // Use the static TARGET_SERVICE_ID to find the endpoint for business logic calls
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort()).usePlaintext().build();
        this.businessStub = OwnerRepositoryServiceGrpc.newBlockingStub(businessChannel);
    }

    @Override
    protected RefactoredObjectID performRemoteCreateAndGetId(String clientId) throws Exception {
        performRpcSetup();
        // Create the RPC request for creating the object
        ConstructorArgs constructorArgs = ConstructorArgs.newBuilder().build();
        CreateObjectRequest createRequest = CreateObjectRequest.newBuilder()
            .setClientID(clientId)
            .setConstructorArgs(constructorArgs)
            .build();

        RefactoredObjectID createResponseProto = this.businessStub.createObject(createRequest);

        return createResponseProto;
    }

    @Override
    protected void performSubclassRpcCleanup() {
        if (this.businessChannel != null && !this.businessChannel.isShutdown()) {
            try {
                this.businessChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
                if (!this.businessChannel.isTerminated()) {
                    this.businessChannel.shutdownNow();
                }
            } catch (InterruptedException e) {
                // Ignore interruption
            }
        }
    }

    /** Factory method for creating proxy from an EXISTING ID. */
    @Override
    public static OwnerRepository fromID(RefactoredObjectID existingId) {
        return new OwnerRepository(existingId);
    }

    // --- Implementation of Repository Methods ---

    /**
     * Retrieve all PetTypes from the data store.
     *
     * @return a Collection of PetTypes.
     */
    public List<PetType> findPetTypes() {
        verifyInitialized();

        // Create the request message
        FindPetTypesRequest request = FindPetTypesRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .build();

        // Make the RPC call
        FindPetTypesResponse response = this.businessStub.findPetTypes(request);

        // Convert the response DTOs to client objects
        List<PetType> result = new ArrayList<>();
        for (PetTypeDTO petTypeDTO : response.getPetTypesList()) {
            result.add(PetType.fromDTO(petTypeDTO));
        }

        return result;
    }

    /**
     * Save an Owner to the data store, either inserting or updating it.
     *
     * @param owner the Owner to save
     */
    public void save(Owner owner) {
        verifyInitialized();

        // Convert Owner to OwnerDTO
        OwnerDTO ownerDTO = owner.toDTO();

        // Create the request message
        SaveRequest request = SaveRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .setOwner(ownerDTO)
            .build();

        // Make the RPC call
        this.businessStub.save(request);
    }

    /**
     * Retrieve an Owner from the data store by id.
     *
     * @param id the id to search for
     * @return the Owner if found
     */
    public Owner findById(Integer id) {
        verifyInitialized();

        // Create the request message
        FindByIdRequest request = FindByIdRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .setId(id)
            .build();

        // Make the RPC call
        FindByIdResponse response = this.businessStub.findById(request);

        // Convert the response DTO to a client object
        if (response.hasOwner()) {
            return Owner.fromDTO(response.getOwner());
        }

        return null;
    }
}
