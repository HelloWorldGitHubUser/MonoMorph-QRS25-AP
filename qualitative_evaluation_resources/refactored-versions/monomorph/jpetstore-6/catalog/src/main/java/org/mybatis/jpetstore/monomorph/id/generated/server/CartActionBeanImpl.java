package org.mybatis.jpetstore.monomorph.id.generated.server;

import io.grpc.stub.StreamObserver;
import org.mybatis.jpetstore.monomorph.id.generated.client.Cart;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ClassIdRegistry;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.IDMapper;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.id.generated.proto.cartactionbean.*;
import org.mybatis.jpetstore.monomorph.id.shared.RefactoredObjectID;
import org.mybatis.jpetstore.monomorph.id.shared.server.LeaseManager;
import org.mybatis.jpetstore.monomorph.id.shared.server.ServerObjectManager;
import org.mybatis.jpetstore.web.actions.CartActionBean;

import java.util.Objects;
import java.util.UUID;

/**
 * gRPC Service implementation for CartActionBean.
 * - Handles gRPC requests for CartActionBean API.
 * - Creates transient CartActionBean instances.
 * - Interacts with LeaseManager for instance registration/retrieval.
 * - Calls business methods on retrieved CartActionBean instances.
 */
public class CartActionBeanImpl extends CartActionBeanServiceGrpc.CartActionBeanServiceImplBase implements ServerObjectManager<CartActionBean> {
    private final LeaseManager leaseManager;
    private final String serviceId;

    // Static identifier for the class type managed by this service
    public static final String CLASS_ID = ClassIdRegistry.getClassId("CartActionBean");

    public CartActionBeanImpl(LeaseManager leaseManager) {
        this.leaseManager = Objects.requireNonNull(leaseManager);
        this.serviceId = ServiceRegistry.getServiceId();
    }

    // --- createObject gRPC Method Implementation ---

    @Override
    public void createObject(CreateObjectRequest request, StreamObserver<RefactoredObjectID> responseObserver) {
        try {
            // 1. Extract args & client ID
            String clientId = request.getClientID();
            ConstructorArgs args = request.getConstructorArgs();

            // 2. Create the transient instance
            CartActionBean newInstance = new CartActionBean();

            // 3. Generate a RefactoredObjectID
            String instanceId = UUID.randomUUID().toString();

            // 4. Register with LeaseManager
            boolean registered = leaseManager.registerInstanceAndGrantLease(instanceId, CLASS_ID, newInstance, clientId);
            if (!registered) {
                throw new RuntimeException("Failed to register new instance ID: " + instanceId);
            }

            // 5. Build and send the response
            RefactoredObjectID responseProto = RefactoredObjectID.newBuilder()
                .setInstanceID(instanceId)
                .setClassID(CLASS_ID)
                .setServiceID(this.serviceId)
                .build();

            responseObserver.onNext(responseProto);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    // --- ServerObjectManager method implementations ---

    @Override
    public RefactoredObjectID toID(CartActionBean instance) {
        // Validate if id instance exists
        String instanceId = leaseManager.findInstanceIdForInstance(instance);
        if (instanceId == null) {
            // Generate a new unique instance ID
            instanceId = UUID.randomUUID().toString();
            // Register with LeaseManager - Note: We need client ID but it's not available here
            // Using a placeholder. In a real implementation, we might handle this differently.
            boolean registered = leaseManager.registerInstanceAndGrantLease(
                instanceId, CLASS_ID, instance, "system");
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
    public CartActionBean fromID(RefactoredObjectID id) {
        // Validate the class ID
        if (id.getClassID() == null || !id.getClassID().equals(CLASS_ID)) {
            throw new IllegalArgumentException("class ID mismatch: expected " + CLASS_ID + ", got " + id.getClassID());
        }
        // Retrieve the instance from LeaseManager
        CartActionBean instance = (CartActionBean) leaseManager.getInstance(id.getInstanceID());
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

    // --- Implementing gRPC methods defined in the proto file ---

    /**
     * Implementation of the getCart RPC method
     */
    @Override
    public void getCart(GetCartRequest request, StreamObserver<GetCartResponse> responseObserver) {
        try {
            // 1. Retrieve the CartActionBean instance using the refactored object ID
            RefactoredObjectID refObjectId = request.getRefactoredObjectID();
            CartActionBean instance = fromID(refObjectId);

            // 2. Call the business method
            org.mybatis.jpetstore.domain.Cart originalCart = instance.getCart();

            // 3. Convert the original cart to a Cart proxy/client
            Cart cartProxy = (Cart) IDMapper.fromID(IDMapper.toID(originalCart));

            // 4. Create and return response
            RefactoredObjectID cartId = IDMapper.toID(cartProxy);
            GetCartResponse response = GetCartResponse.newBuilder()
                .setCartID(cartId)
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    /**
     * Implementation of the clear RPC method
     */
    @Override
    public void clear(ClearRequest request, StreamObserver<ClearResponse> responseObserver) {
        try {
            // 1. Retrieve the CartActionBean instance using the refactored object ID
            RefactoredObjectID refObjectId = request.getRefactoredObjectID();
            CartActionBean instance = fromID(refObjectId);

            // 2. Call the business method
            instance.clear();

            // 3. Create and return empty response
            ClearResponse response = ClearResponse.newBuilder().build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
}