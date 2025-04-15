package org.mybatis.jpetstore.monomorph.id.generated.server;

import io.grpc.stub.StreamObserver;
import org.mybatis.jpetstore.monomorph.id.generated.proto.itemmapper.*;
import org.mybatis.jpetstore.monomorph.id.generated.proto.itemmapper.ItemMapperServiceGrpc.ItemMapperServiceImplBase;
import org.mybatis.jpetstore.monomorph.id.shared.server.LeaseManager;
import org.mybatis.jpetstore.monomorph.id.shared.server.ServerObjectManager;
import org.mybatis.jpetstore.monomorph.id.shared.RefactoredObjectID;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ClassIdRegistry;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.IDMapper;
import org.mybatis.jpetstore.mapper.ItemMapper;
import org.mybatis.jpetstore.domain.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * gRPC Service implementation for ItemMapper.
 * - Handles gRPC requests for ItemMapper API.
 * - Creates transient ItemMapper instances.
 * - Interacts with LeaseManager for instance registration/retrieval.
 * - Calls business methods on retrieved ItemMapper instances.
 */
public class ItemMapperImpl extends ItemMapperServiceImplBase implements ServerObjectManager<ItemMapper> {

    private final LeaseManager leaseManager;
    private final String serviceId;

    // Static identifier for the class type managed by this service
    public static final String CLASS_ID = ClassIdRegistry.getClassId("ItemMapper");

    public ItemMapperImpl(LeaseManager leaseManager) {
        this.leaseManager = Objects.requireNonNull(leaseManager);
        this.serviceId = Objects.requireNonNull(ServiceRegistry.getServiceId());
    }

    // --- createObject gRPC Method Implementation ---

    @Override
    public void createObject(CreateObjectRequest request, StreamObserver<RefactoredObjectID> responseObserver) {
        try {
            // 1. Extract args & client ID
            String clientId = request.getClientID();

            // 2. For ItemMapper, we need to get the actual implementation instance
            // This would normally be provided by a dependency injection container or factory
            // Since ItemMapper is an interface, we need to get its implementation
            ItemMapper newInstance = getItemMapperImplementation();

            // 3. Generate a RefactoredObjectID
            RefactoredObjectID responseProto = toID(newInstance, clientId);

            // 4. Send the response
            responseObserver.onNext(responseProto);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    // Helper method to get the ItemMapper implementation
    // This would be replaced with the actual way to obtain the implementation
    private ItemMapper getItemMapperImplementation() {
        // This is a placeholder - in a real application, this would come from
        // Spring context, MyBatis session, or other dependency injection mechanism
        return null; // Replace with actual implementation
    }

    // --- Start of ServerObjectManager method implementations ---
    @Override
    public RefactoredObjectID toID(ItemMapper instance, String clientId) {
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
    public ItemMapper fromID(RefactoredObjectID id) {
        // Validate the class ID
        if (id.getClassID() == null || !id.getClassID().equals(CLASS_ID)) {
            throw new IllegalArgumentException("class ID mismatch: expected " + CLASS_ID + ", got " + id.getClassID());
        }
        // Retrieve the instance from LeaseManager
        // Note: The LeaseManager.getInstance() method should return the correct type based on the class ID
        ItemMapper instance = (ItemMapper) leaseManager.getInstance(id.getInstanceID());
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
    public void getInventoryQuantity(GetInventoryQuantityRequest request,
                                      StreamObserver<GetInventoryQuantityResponse> responseObserver) {
        try {
            // Get the ItemMapper instance using the provided ID
            RefactoredObjectID objectId = request.getRefactoredObjectID();
            ItemMapper itemMapper = fromID(objectId);

            // Call the actual method on the ItemMapper instance
            int quantity = itemMapper.getInventoryQuantity(request.getItemId());

            // Build and send the response
            GetInventoryQuantityResponse response = GetInventoryQuantityResponse.newBuilder()
                .setQuantity(quantity)
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void updateInventoryQuantity(UpdateInventoryQuantityRequest request,
                                        StreamObserver<UpdateInventoryQuantityResponse> responseObserver) {
        try {
            // Get the ItemMapper instance using the provided ID
            RefactoredObjectID objectId = request.getRefactoredObjectID();
            ItemMapper itemMapper = fromID(objectId);

            // Convert the map from proto format to Java Map
            Map<String, Object> paramMap = new HashMap<>();
            for (Map.Entry<String, MapValue> entry : request.getParamsMap().entrySet()) {
                String key = entry.getKey();
                MapValue value = entry.getValue();

                // Convert the MapValue to an appropriate Java Object
                Object javaValue;
                switch (value.getValueCase()) {
                    case STRING_VALUE:
                        javaValue = value.getStringValue();
                        break;
                    case INT_VALUE:
                        javaValue = value.getIntValue();
                        break;
                    case BOOL_VALUE:
                        javaValue = value.getBoolValue();
                        break;
                    case DOUBLE_VALUE:
                        javaValue = value.getDoubleValue();
                        break;
                    default:
                        javaValue = null;
                }
                paramMap.put(key, javaValue);
            }

            // Call the actual method on the ItemMapper instance
            itemMapper.updateInventoryQuantity(paramMap);

            // Build and send the response
            UpdateInventoryQuantityResponse response = UpdateInventoryQuantityResponse.newBuilder().build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void getItem(GetItemRequest request, StreamObserver<GetItemResponse> responseObserver) {
        try {
            // Get the ItemMapper instance using the provided ID
            RefactoredObjectID objectId = request.getRefactoredObjectID();
            ItemMapper itemMapper = fromID(objectId);

            // Call the actual method on the ItemMapper instance
            Item item = itemMapper.getItem(request.getItemId());

            // Convert the Item object to a RefactoredObjectID
            RefactoredObjectID itemId = IDMapper.toID(item);

            // Build and send the response
            GetItemResponse response = GetItemResponse.newBuilder()
                .setItem(itemId)
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
}
