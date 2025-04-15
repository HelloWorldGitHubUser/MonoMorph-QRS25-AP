package org.mybatis.jpetstore.monomorph.id.generated.client;

import org.mybatis.jpetstore.monomorph.id.shared.client.AbstractRefactoredClient;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.id.shared.RefactoredObjectID;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.IDMapper;
import org.mybatis.jpetstore.domain.Cart;

// gRPC imports
import org.mybatis.jpetstore.monomorph.id.generated.proto.cartactionbean.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class CartActionBean extends AbstractRefactoredClient {

    // TARGET_SERVICE_ID is the unique ID for the CartActionBean service
    private static final String TARGET_SERVICE_ID = "catalog";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel; // Channel for RPC calls
    private CartActionBeanServiceGrpc.CartActionBeanServiceBlockingStub businessStub; // Use this stub for RPC calls

    /** Default constructor. */
    public CartActionBean() {
        super(); // Initialize the client ID and object ID
    }

    /** Private constructor used by the fromID factory. */
    private CartActionBean(RefactoredObjectID existingId) {
        super(existingId); // Use the base constructor for existing IDs
    }

    // --- Implementation of Abstract Methods ---

    @Override
    protected void performRpcSetup() throws Exception {
        // Use the static TARGET_SERVICE_ID to find the endpoint for business logic calls
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort())
                .usePlaintext()
                .build();
        this.businessStub = CartActionBeanServiceGrpc.newBlockingStub(businessChannel);
    }

    @Override
    protected RefactoredObjectID performRemoteCreateAndGetId(String clientId) throws Exception {
        performRpcSetup();

        // Create the RPC "createObject" request
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
                if (!this.businessChannel.isTerminated()) {
                    this.businessChannel.shutdownNow();
                }
            } catch (InterruptedException e) {
                // Handling interruption
            }
        }
    }

    /** Factory method for creating proxy from an EXISTING ID. */
    public static CartActionBean fromID(RefactoredObjectID existingId) {
        return new CartActionBean(existingId);
    }

    // --- Implementation of the CartActionBean methods ---

    /**
     * Gets the cart.
     *
     * @return the cart
     */
    public Cart getCart() {
        try {
            ensureRpcSetup();

            // Create the request with the object ID
            GetCartRequest request = GetCartRequest.newBuilder()
                    .setRefactoredObjectID(this.objectId)
                    .build();

            // Make the RPC call
            GetCartResponse response = this.businessStub.getCart(request);

            // Map the returned Cart ID to an actual Cart object
            return (Cart) IDMapper.fromID(response.getCartID());
        } catch (Exception e) {
            throw new RuntimeException("Error getting cart", e);
        }
    }

    /**
     * Clear the cart.
     */
    public void clear() {
        try {
            ensureRpcSetup();

            // Create the request with the object ID
            ClearRequest request = ClearRequest.newBuilder()
                    .setRefactoredObjectID(this.objectId)
                    .build();

            // Make the RPC call - no response to process
            this.businessStub.clear(request);
        } catch (Exception e) {
            throw new RuntimeException("Error clearing cart", e);
        }
    }
}