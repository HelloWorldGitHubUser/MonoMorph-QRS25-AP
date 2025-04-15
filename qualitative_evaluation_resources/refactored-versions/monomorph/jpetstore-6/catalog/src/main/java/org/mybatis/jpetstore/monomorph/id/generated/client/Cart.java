package org.mybatis.jpetstore.monomorph.id.generated.client;

import org.mybatis.jpetstore.monomorph.id.shared.client.AbstractRefactoredClient;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.id.shared.RefactoredObjectID;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.IDMapper;
import org.mybatis.jpetstore.monomorph.id.generated.proto.cart.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Cart extends AbstractRefactoredClient implements Serializable {

    private static final long serialVersionUID = 8329559983943337176L;
    private static final String TARGET_SERVICE_ID = "order";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel;
    private CartServiceGrpc.CartServiceBlockingStub businessStub;

    /** Default constructor (original class has a no-arg constructor) */
    public Cart() {
        super();
    }

    /** Private constructor used by the fromID factory. */
    private Cart(RefactoredObjectID existingId) {
        super(existingId);
    }

    // --- Implementation of Abstract Methods ---

    @Override
    protected void performRpcSetup() throws Exception {
        // Use the static TARGET_SERVICE_ID to find the endpoint for business logic calls
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort()).usePlaintext().build();
        this.businessStub = CartServiceGrpc.newBlockingStub(businessChannel);
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
                if (!this.businessChannel.isTerminated()) {
                    this.businessChannel.shutdownNow();
                }
            } catch (InterruptedException e) {
                // Ignore interrupted exception
            }
        }
    }

    /** Factory method for creating proxy from an EXISTING ID. */
    @Override
    public static Cart fromID(RefactoredObjectID existingId) {
        return new Cart(existingId);
    }

    // --- Implementation of the original Cart methods ---

    public Iterator<CartItem> getCartItems() {
        return getCartItemList().iterator();
    }

    public List<CartItem> getCartItemList() {
        GetAllCartItemsRequest request = GetAllCartItemsRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .build();

        GetAllCartItemsResponse response = this.businessStub.getAllCartItems(request);

        List<CartItem> items = new ArrayList<>();
        response.getCartItemsList().forEach(cartItemDto ->
            items.add(CartItem.fromDTO(cartItemDto))
        );

        return items;
    }

    public int getNumberOfItems() {
        return getCartItemList().size();
    }

    public Iterator<CartItem> getAllCartItems() {
        GetAllCartItemsRequest request = GetAllCartItemsRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .build();

        GetAllCartItemsResponse response = this.businessStub.getAllCartItems(request);

        List<CartItem> items = new ArrayList<>();
        response.getCartItemsList().forEach(cartItemDto ->
            items.add(CartItem.fromDTO(cartItemDto))
        );

        return items.iterator();
    }

    public boolean containsItemId(String itemId) {
        ContainsItemIdRequest request = ContainsItemIdRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .setItemId(itemId)
            .build();

        ContainsItemIdResponse response = this.businessStub.containsItemId(request);
        return response.getContains();
    }

    public void addItem(org.mybatis.jpetstore.monomorph.id.generated.client.Item item, boolean isInStock) {
        RefactoredObjectID itemId = IDMapper.toID(item);

        AddItemRequest request = AddItemRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .setItem(itemId)
            .setIsInStock(isInStock)
            .build();

        this.businessStub.addItem(request);
    }

    public org.mybatis.jpetstore.monomorph.id.generated.client.Item removeItemById(String itemId) {
        RemoveItemByIdRequest request = RemoveItemByIdRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .setItemId(itemId)
            .build();

        RemoveItemByIdResponse response = this.businessStub.removeItemById(request);

        if (response.hasItem()) {
            return (org.mybatis.jpetstore.monomorph.id.generated.client.Item) IDMapper.fromID(response.getItem());
        } else {
            return null;
        }
    }

    public void incrementQuantityByItemId(String itemId) {
        IncrementQuantityByItemIdRequest request = IncrementQuantityByItemIdRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .setItemId(itemId)
            .build();

        this.businessStub.incrementQuantityByItemId(request);
    }

    public void setQuantityByItemId(String itemId, int quantity) {
        SetQuantityByItemIdRequest request = SetQuantityByItemIdRequest.newBuilder()
            .setRefactoredObjectID(this.objectId)
            .setItemId(itemId)
            .setQuantity(quantity)
            .build();

        this.businessStub.setQuantityByItemId(request);
    }

    public BigDecimal getSubTotal() {
        List<CartItem> cartItems = getCartItemList();
        BigDecimal subTotal = BigDecimal.ZERO;

        for (CartItem cartItem : cartItems) {
            BigDecimal listPrice = cartItem.getItem().getListPrice();
            BigDecimal quantity = new BigDecimal(cartItem.getQuantity());
            subTotal = subTotal.add(listPrice.multiply(quantity));
        }

        return subTotal;
    }
}