package com.coveros.training.monomorph.id.generated.client;

import com.coveros.training.monomorph.id.shared.client.AbstractRefactoredClient;
import com.coveros.training.monomorph.id.generated.helpers.ServiceRegistry;
import com.coveros.training.monomorph.id.shared.RefactoredObjectID;
// gRPC imports
import com.coveros.training.monomorph.id.generated.proto.checkutils.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class CheckUtils extends AbstractRefactoredClient {

    // TARGET_SERVICE_ID is the unique ID for the CheckUtils service
    private static final String TARGET_SERVICE_ID = "authentication";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel; // Channel for RPC calls
    private CheckUtilsServiceGrpc.CheckUtilsServiceBlockingStub businessStub; // Use this stub for RPC calls

    /** Private constructor to hide the implicit public one, matching original class. */
    private CheckUtils() {
        super();
    }

    /** Private constructor used by the fromID factory. */
    private CheckUtils(RefactoredObjectID existingId) {
        super(existingId); // Use the base constructor for existing IDs
    }

    // --- Implementation of Abstract Methods ---

    @Override
    protected void performRpcSetup() throws Exception {
        // Use the static TARGET_SERVICE_ID to find the endpoint for business logic calls
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort()).usePlaintext().build();
        this.businessStub = CheckUtilsServiceGrpc.newBlockingStub(businessChannel);
    }

    @Override
    protected RefactoredObjectID performRemoteCreateAndGetId(String clientId) throws Exception {
        performRpcSetup();

        // Create request for the createObject RPC
        CreateObjectRequest createRequest = CreateObjectRequest.newBuilder()
            .setClientID(clientId)
            .setConstructorArgs(ConstructorArgs.newBuilder().build()) // Empty constructor args
            .build();

        RefactoredObjectID createResponseProto = this.businessStub.createObject(createRequest);

        return createResponseProto;
    }

    @Override
    protected void performSubclassRpcCleanup() {
        if (this.businessChannel != null && !this.businessChannel.isShutdown()) {
            try {
                this.businessChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
                if (!this.businessChannel.isTerminated()) { this.businessChannel.shutdownNow(); }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /** Factory method for creating proxy from an EXISTING ID. */
    public static CheckUtils fromID(RefactoredObjectID existingId) {
        return new CheckUtils(existingId);
    }

    // --- Implementation of the service methods ---

    /**
     * Makes sure the input value is a valid string of length 1 or greater
     *
     * @param values the strings to check
     * @throws IllegalArgumentException if the string is null or empty
     */
    public static void StringMustNotBeNullOrEmpty(java.lang.String... values) {
        // Create a new instance for the RPC call
        CheckUtils instance = new CheckUtils();

        try {
            // Build the request with the refactored object ID and values
            StringMustNotBeNullOrEmptyRequest request = StringMustNotBeNullOrEmptyRequest.newBuilder()
                .setRefactoredObjectID(instance.objectId)
                .addAllValues(Arrays.asList(values))
                .build();

            // Make the RPC call
            instance.businessStub.stringMustNotBeNullOrEmpty(request);

        } catch (StatusRuntimeException e) {
            // Translate gRPC exceptions to match the original behavior
            throw new IllegalArgumentException("string must not be null or empty at this point", e);
        } finally {
            instance.cleanup();
        }
    }

    /**
     * Asserts that the integer value received is 1 or above.
     *
     * @param parameter a value to check for being positive
     * @throws IllegalArgumentException if the input isn't a positive integer
     */
    public static void IntParameterMustBePositive(long parameter) {
        // Create a new instance for the RPC call
        CheckUtils instance = new CheckUtils();

        try {
            // Build the request with the refactored object ID and parameter
            IntParameterMustBePositiveRequest request = IntParameterMustBePositiveRequest.newBuilder()
                .setRefactoredObjectID(instance.objectId)
                .setParameter(parameter)
                .build();

            // Make the RPC call
            instance.businessStub.intParameterMustBePositive(request);

        } catch (StatusRuntimeException e) {
            // Translate gRPC exceptions to match the original behavior
            throw new IllegalArgumentException("int value must be 1 or above.", e);
        } finally {
            instance.cleanup();
        }
    }
}