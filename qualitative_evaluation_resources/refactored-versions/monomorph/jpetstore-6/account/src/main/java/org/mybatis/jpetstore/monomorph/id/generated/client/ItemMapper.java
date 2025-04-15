package org.mybatis.jpetstore.monomorph.id.generated.client;

import org.mybatis.jpetstore.monomorph.id.shared.client.AbstractRefactoredClient;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.IDMapper;
import org.mybatis.jpetstore.monomorph.id.shared.RefactoredObjectID;
// gRPC imports
import org.mybatis.jpetstore.monomorph.id.generated.proto.itemmapper.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class ItemMapper extends AbstractRefactoredClient {

    // TARGET_SERVICE_ID is the unique ID for the ItemMapper service
    private static final String TARGET_SERVICE_ID = "catalog";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel; // Channel for RPC calls
    private ItemMapperServiceGrpc.ItemMapperServiceBlockingStub businessStub; // Use this stub for RPC calls

    /** constructor. */
    public ItemMapper() {
        super();
    }

    /** Private constructor used by the fromID factory. */
    private ItemMapper(RefactoredObjectID existingId) {
        super(existingId); // Use the base constructor for existing IDs
    }

    // --- Implementation of Abstract Methods ---

    @Override
    protected void performRpcSetup() throws Exception {
        // Use the static TARGET_SERVICE_ID to find the endpoint for business logic calls
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort()).usePlaintext().build();
        this.businessStub = ItemMapperServiceGrpc.newBlockingStub(businessChannel);
    }

    @Override
    protected RefactoredObjectID performRemoteCreateAndGetId(String clientId) throws Exception {
        performRpcSetup();

        CreateObjectRequest createRequest = CreateObjectRequest.newBuilder()
            .setClientID(clientId)
            .setConstructorArgs(ConstructorArgs.newBuilder().build())
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
            } catch (InterruptedException e) { }
        }
    }

    /** Factory method for creating proxy from an EXISTING ID. */
    @Override
    public static ItemMapper fromID(RefactoredObjectID existingId) {
        return new ItemMapper(existingId);
    }

    // --- Implementation of the ItemMapper interface methods ---

    /**
     * Gets the inventory quantity.
     *
     * @param itemId the item id
     * @return the inventory quantity
     */
    public int getInventoryQuantity(String itemId) {
        GetInventoryQuantityRequest request = GetInventoryQuantityRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .setItemId(itemId)
            .build();

        GetInventoryQuantityResponse response = this.businessStub.getInventoryQuantity(request);
        return response.getQuantity();
    }

    /**
     * Updates the inventory quantity.
     *
     * @param param the map with parameters
     */
    public void updateInventoryQuantity(Map<String, Object> param) {
        UpdateInventoryQuantityRequest.Builder requestBuilder = UpdateInventoryQuantityRequest.newBuilder()
            .setRefactoredObjectID(this.objectId);

        // Convert the Map to proto map format
        for (Map.Entry<String, Object> entry : param.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            MapValue.Builder mapValueBuilder = MapValue.newBuilder();

            if (value instanceof String) {
                mapValueBuilder.setStringValue((String) value);
            } else if (value instanceof Integer) {
                mapValueBuilder.setIntValue((Integer) value);
            } else if (value instanceof Boolean) {
                mapValueBuilder.setBoolValue((Boolean) value);
            } else if (value instanceof Double) {
                mapValueBuilder.setDoubleValue((Double) value);
            } else {
                // For simplicity, convert other types to string
                mapValueBuilder.setStringValue(value.toString());
            }

            requestBuilder.putParams(key, mapValueBuilder.build());
        }

        this.businessStub.updateInventoryQuantity(requestBuilder.build());
    }

    /**
     * Gets the item.
     *
     * @param itemId the item id
     * @return the item
     */
    public Item getItem(String itemId) {
        GetItemRequest request = GetItemRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .setItemId(itemId)
            .build();

        GetItemResponse response = this.businessStub.getItem(request);

        // Convert RefactoredObjectID to Item
        return (Item) IDMapper.fromID(response.getItem());
    }

    /**
     * Gets the item list by product.
     *
     * @param productId the product id
     * @return the item list by product
     */
    public List<Item> getItemListByProduct(String productId) {
        // This method is not exposed through gRPC
        throw new UnsupportedOperationException("Method getItemListByProduct is not available in this client implementation");
    }
}
