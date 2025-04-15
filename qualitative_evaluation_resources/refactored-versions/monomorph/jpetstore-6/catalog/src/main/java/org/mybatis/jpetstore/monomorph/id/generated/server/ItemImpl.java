package org.mybatis.jpetstore.monomorph.id.generated.server;

import io.grpc.stub.StreamObserver;
import org.mybatis.jpetstore.monomorph.id.generated.proto.item.*;
import org.mybatis.jpetstore.monomorph.id.shared.server.LeaseManager;
import org.mybatis.jpetstore.monomorph.id.shared.server.ServerObjectManager;
import org.mybatis.jpetstore.monomorph.id.shared.RefactoredObjectID;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ClassIdRegistry;
import org.mybatis.jpetstore.domain.Item;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

/**
 * gRPC Service implementation for Item.
 * - Handles gRPC requests for Item API.
 * - Creates transient Item instances.
 * - Interacts with LeaseManager for instance registration/retrieval.
 * - Calls business methods on retrieved Item instances.
 */
public class ItemImpl extends ItemServiceGrpc.ItemServiceImplBase implements ServerObjectManager<Item> {

    private final LeaseManager leaseManager;
    private final String serviceId;

    // Static identifier for the class type managed by this service
    public static final String CLASS_ID = ClassIdRegistry.getClassId("Item");

    public ItemImpl(LeaseManager leaseManager) {
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
            Item newInstance = new Item(); // Using default constructor as Item doesn't have a parameterized constructor

            // 3. Generate a RefactoredObjectID ID
            RefactoredObjectID responseProto = toID(newInstance, clientId);

            // 4. Send the response
            responseObserver.onNext(responseProto);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    // --- Start of ServerObjectManager method implementations ---
    @Override
    public RefactoredObjectID toID(Item instance, String clientId) {
        // Validate if id instance exists
        String instanceId = leaseManager.findInstanceIdForInstance(instance);
        if (instanceId == null) {
            // Generate a new unique instance ID
            instanceId = UUID.randomUUID().toString();
        }
        // Register with LeaseManager
        boolean registered = leaseManager.registerInstanceAndGrantLease(instanceId, CLASS_ID, instance, clientId);
        if (!registered) {
            throw new RuntimeException("Failed to register new instance ID: " + instanceId);
        }
        // Build RefactoredObjectID
        RefactoredObjectID responseProto = RefactoredObjectID.newBuilder()
            .setInstanceID(instanceId)
            .setClassID(CLASS_ID)
            .setServiceID(this.serviceId)
            .build();
        return responseProto;
    }

    @Override
    public Item fromID(RefactoredObjectID id) {
        // Validate the class ID
        if (id.getClassID() == null || !id.getClassID().equals(CLASS_ID)) {
            throw new IllegalArgumentException("class ID mismatch: expected " + CLASS_ID + ", got " + id.getClassID());
        }
        // Retrieve the instance from LeaseManager
        Item instance = (Item) leaseManager.getInstance(id.getInstanceID());
        if (instance == null) {
            throw new IllegalArgumentException("No instance found for ID: " + id.getInstanceID());
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

    // --- Implementing methods from the proto file ---

    @Override
    public void getItemId(GetItemIdRequest request, StreamObserver<GetItemIdResponse> responseObserver) {
        try {
            // Get the instance from the RefactoredObjectID
            RefactoredObjectID refId = request.getRefactoredObjectID();
            Item item = fromID(refId);

            // Call the business method
            String itemId = item.getItemId();

            // Build and send response
            GetItemIdResponse response = GetItemIdResponse.newBuilder()
                .setItemId(itemId != null ? itemId : "")
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void getListPrice(GetListPriceRequest request, StreamObserver<GetListPriceResponse> responseObserver) {
        try {
            // Get the instance from the RefactoredObjectID
            RefactoredObjectID refId = request.getRefactoredObjectID();
            Item item = fromID(refId);

            // Call the business method
            BigDecimal listPrice = item.getListPrice();

            // Build and send response
            GetListPriceResponse response = GetListPriceResponse.newBuilder()
                .setListPrice(listPrice != null ? listPrice.doubleValue() : 0.0)
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void setQuantity(SetQuantityRequest request, StreamObserver<SetQuantityResponse> responseObserver) {
        try {
            // Get the instance from the RefactoredObjectID
            RefactoredObjectID refId = request.getRefactoredObjectID();
            Item item = fromID(refId);

            // Call the business method
            item.setQuantity(request.getQuantity());

            // Build and send response (empty in this case)
            SetQuantityResponse response = SetQuantityResponse.newBuilder().build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
}
