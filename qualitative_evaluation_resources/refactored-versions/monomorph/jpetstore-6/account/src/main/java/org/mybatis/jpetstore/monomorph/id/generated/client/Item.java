package org.mybatis.jpetstore.monomorph.id.generated.client;

import org.mybatis.jpetstore.monomorph.id.shared.client.AbstractRefactoredClient;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.id.shared.RefactoredObjectID;
// gRPC imports
import org.mybatis.jpetstore.monomorph.id.generated.proto.item.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

public class Item extends AbstractRefactoredClient {

    // TARGET_SERVICE_ID is the unique ID for the Item service
    private static final String TARGET_SERVICE_ID = "catalog";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel; // Channel for RPC calls
    private ItemServiceGrpc.ItemServiceBlockingStub businessStub; // Use this stub for RPC calls

    // Fields that mirror the original Item class
    private String itemId;
    private String productId;
    private BigDecimal listPrice;
    private BigDecimal unitCost;
    private int supplierId;
    private String status;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private org.mybatis.jpetstore.domain.Product product;
    private int quantity;

    /** Default constructor. */
    public Item() {
        super();
    }

    /** Private constructor used by the fromID factory. */
    private Item(RefactoredObjectID existingId) {
        super(existingId); // Use the base constructor for existing IDs
    }

    // --- Implementation of Abstract Methods ---

    @Override
    protected void performRpcSetup() throws Exception {
        // Use the static TARGET_SERVICE_ID to find the endpoint for business logic calls
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort()).usePlaintext().build();
        this.businessStub = ItemServiceGrpc.newBlockingStub(businessChannel);
    }

    @Override
    protected RefactoredObjectID performRemoteCreateAndGetId(String clientId) throws Exception {
        performRpcSetup();

        // Create a request for the createObject RPC
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
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /** Factory method for creating proxy from an EXISTING ID. */
    @Override
    public static Item fromID(RefactoredObjectID existingId) {
        return new Item(existingId);
    }

    // --- Implementation of the methods defined in the proto file ---

    /**
     * Gets the item id.
     *
     * @return the item id
     */
    public String getItemId() {
        try {
            ensureRpcSetup();

            GetItemIdRequest request = GetItemIdRequest.newBuilder()
                .setRefactoredObjectID(this.objectId)
                .build();

            GetItemIdResponse response = this.businessStub.getItemId(request);
            return response.getItemId();
        } catch (Exception e) {
            throw new RuntimeException("Error calling getItemId remote method", e);
        }
    }

    /**
     * Gets the list price.
     *
     * @return the list price
     */
    public BigDecimal getListPrice() {
        try {
            ensureRpcSetup();

            GetListPriceRequest request = GetListPriceRequest.newBuilder()
                .setRefactoredObjectID(this.objectId)
                .build();

            GetListPriceResponse response = this.businessStub.getListPrice(request);
            return BigDecimal.valueOf(response.getListPrice());
        } catch (Exception e) {
            throw new RuntimeException("Error calling getListPrice remote method", e);
        }
    }

    /**
     * Sets the quantity.
     *
     * @param quantity the new quantity
     */
    public void setQuantity(int quantity) {
        try {
            ensureRpcSetup();

            SetQuantityRequest request = SetQuantityRequest.newBuilder()
                .setRefactoredObjectID(this.objectId)
                .setQuantity(quantity)
                .build();

            this.businessStub.setQuantity(request);
        } catch (Exception e) {
            throw new RuntimeException("Error calling setQuantity remote method", e);
        }
    }

    // --- Additional methods from the original Item class that were not in the proto file ---
    // These methods will use local fields since they're not exposed as RPC methods

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId != null ? itemId.trim() : null;
    }

    public int getQuantity() {
        return quantity;
    }

    public org.mybatis.jpetstore.domain.Product getProduct() {
        return product;
    }

    public void setProduct(org.mybatis.jpetstore.domain.Product product) {
        this.product = product;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    @Override
    public String toString() {
        try {
            return ((("(" + getItemId()) + ")-") + getProduct().getProductId()) + ")";
        } catch (Exception e) {
            return "Item (ID unavailable)";
        }
    }
}