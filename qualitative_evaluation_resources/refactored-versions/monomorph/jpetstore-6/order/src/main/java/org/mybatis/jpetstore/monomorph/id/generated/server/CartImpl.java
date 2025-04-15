public class CartImpl extends CartServiceGrpc.CartServiceImplBase implements ServerObjectManager<Cart> {

    private final LeaseManager leaseManager;
    private final String serviceId;

    // Static identifier for the class type managed by this service
    public static final String CLASS_ID = ClassIdRegistry.getClassId("Cart");

    public CartImpl(LeaseManager leaseManager) {
        this.leaseManager = Objects.requireNonNull(leaseManager);
        this.serviceId = ServiceRegistry.getServiceId();
    }

    // --- createObject gRPC Method Implementation ---

    @Override
    public void createObject(CreateObjectRequest request, StreamObserver<RefactoredObjectID> responseObserver) {
        try {
            // 1. Extract args & client ID
            String clientId = request.getClientID();
            // For Cart, no constructor args are needed as it has a default constructor

            // 2. Create the transient instance
            Cart newInstance = new Cart();

            // 3- Generate a RefactoredObjectID ID
            String instanceId = UUID.randomUUID().toString();
            boolean registered = leaseManager.registerInstanceAndGrantLease(instanceId, CLASS_ID, newInstance, clientId);
            if (!registered) {
                throw new RuntimeException("Failed to register new instance ID: " + instanceId);
            }

            // Build RefactoredObjectID
            RefactoredObjectID responseProto = RefactoredObjectID.newBuilder()
                .setInstanceID(instanceId)
                .setClassID(CLASS_ID)
                .setServiceID(this.serviceId)
                .build();

            // 4. Send the response
            responseObserver.onNext(responseProto);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    // --- Start of ServerObjectManager method implementations ---
    @Override
    public RefactoredObjectID toID(Cart instance) {
        // Validate if id instance exists
        String instanceId = leaseManager.findInstanceIdForInstance(instance);
        if (instanceId == null) {
            // Generate a new unique instance ID
            instanceId = UUID.randomUUID().toString();
            // Register with LeaseManager - using empty clientId as this is an internal call
            boolean registered = leaseManager.registerInstanceAndGrantLease(instanceId, CLASS_ID, instance, "");
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
    public Cart fromID(RefactoredObjectID id) {
        // Validate the class ID
        if (id.getClassID() == null || !id.getClassID().equals(CLASS_ID)) {
            throw new IllegalArgumentException("class ID mismatch: expected " + CLASS_ID + ", got " + id.getClassID());
        }
        // Retrieve the instance from LeaseManager
        Cart instance = (Cart) leaseManager.getInstance(id.getInstanceID());
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

    // --- Implementation of gRPC methods from proto file ---

    @Override
    public void containsItemId(ContainsItemIdRequest request, StreamObserver<ContainsItemIdResponse> responseObserver) {
        try {
            // Retrieve the Cart instance
            Cart instance = fromID(request.getRefactoredObjectID());

            // Call the business method
            boolean contains = instance.containsItemId(request.getItemId());

            // Build and send response
            ContainsItemIdResponse response = ContainsItemIdResponse.newBuilder()
                .setContains(contains)
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void incrementQuantityByItemId(IncrementQuantityByItemIdRequest request,
            StreamObserver<EmptyResponse> responseObserver) {
        try {
            // Retrieve the Cart instance
            Cart instance = fromID(request.getRefactoredObjectID());

            // Call the business method
            instance.incrementQuantityByItemId(request.getItemId());

            // Send empty response
            responseObserver.onNext(EmptyResponse.newBuilder().build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void addItem(AddItemRequest request, StreamObserver<EmptyResponse> responseObserver) {
        try {
            // Retrieve the Cart instance
            Cart instance = fromID(request.getRefactoredObjectID());

            // Convert the item ID to an Item object
            Item item = (Item) IDMapper.fromID(request.getItem());

            // Call the business method
            instance.addItem(item, request.getIsInStock());

            // Send empty response
            responseObserver.onNext(EmptyResponse.newBuilder().build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void getAllCartItems(GetAllCartItemsRequest request,
            StreamObserver<GetAllCartItemsResponse> responseObserver) {
        try {
            // Retrieve the Cart instance
            Cart instance = fromID(request.getRefactoredObjectID());

            // Call the business method and convert to DTOs
            Iterator<CartItem> items = instance.getAllCartItems();
            List<CartItemDTO> dtoItems = new ArrayList<>();

            while (items.hasNext()) {
                CartItem item = items.next();
                CartItemDTO dto = CartItemMapper.INSTANCE.toDTO(item);
                dtoItems.add(dto);
            }

            // Build and send response
            GetAllCartItemsResponse response = GetAllCartItemsResponse.newBuilder()
                .addAllCartItems(dtoItems)
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void removeItemById(RemoveItemByIdRequest request,
            StreamObserver<RemoveItemByIdResponse> responseObserver) {
        try {
            // Retrieve the Cart instance
            Cart instance = fromID(request.getRefactoredObjectID());

            // Call the business method
            Item item = (Item) instance.removeItemById(request.getItemId());

            // Convert item to ID and build response
            RefactoredObjectID itemId = null;
            if (item != null) {
                itemId = IDMapper.toID(item);
            }

            RemoveItemByIdResponse response = RemoveItemByIdResponse.newBuilder()
                .setItem(itemId != null ? itemId : RefactoredObjectID.getDefaultInstance())
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void setQuantityByItemId(SetQuantityByItemIdRequest request,
            StreamObserver<EmptyResponse> responseObserver) {
        try {
            // Retrieve the Cart instance
            Cart instance = fromID(request.getRefactoredObjectID());

            // Call the business method
            instance.setQuantityByItemId(request.getItemId(), request.getQuantity());

            // Send empty response
            responseObserver.onNext(EmptyResponse.newBuilder().build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
}
