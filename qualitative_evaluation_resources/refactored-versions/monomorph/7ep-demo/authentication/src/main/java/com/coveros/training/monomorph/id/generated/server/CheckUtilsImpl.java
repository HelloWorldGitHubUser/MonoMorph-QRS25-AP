public class CheckUtilsImpl extends CheckUtilsServiceImplBase implements ServerObjectManager<CheckUtils> {

    private final LeaseManager leaseManager;
    private final String serviceId;

    // Static identifier for the class type managed by this service
    public static final String CLASS_ID = ClassIdRegistry.getClassId("CheckUtils");

    // Static singleton ID for utility class (since we don't actually create instances)
    private static final String SINGLETON_INSTANCE_ID = "CheckUtils-static-singleton";

    public CheckUtilsImpl(LeaseManager leaseManager) {
        this.leaseManager = Objects.requireNonNull(leaseManager);
        this.serviceId = ServiceRegistry.getServiceId();
    }

    // --- createObject gRPC Method Implementation ---

    @Override
    public void createObject(CreateObjectRequest request, StreamObserver<RefactoredObjectID> responseObserver) {
        try {
            // 1. Extract client ID
            String clientId = request.getClientID();

            // 2. Special handling for CheckUtils as it's a utility class
            // We don't actually create an instance since it has a private constructor
            // and only static methods. Instead, we create a placeholder ID.

            // 3. Generate a RefactoredObjectID ID (always return the same ID for this utility class)
            RefactoredObjectID responseProto = RefactoredObjectID.newBuilder()
                .setInstanceID(SINGLETON_INSTANCE_ID)
                .setClassID(CLASS_ID)
                .setServiceID(this.serviceId)
                .build();

            // 4. Register a null instance since this is a static utility class
            boolean registered = leaseManager.registerInstanceAndGrantLease(
                SINGLETON_INSTANCE_ID, CLASS_ID, null, clientId);

            if (!registered) {
                responseObserver.onError(Status.INTERNAL
                    .withDescription("Failed to register static utility class: CheckUtils")
                    .asException());
                return;
            }

            // 5. Send the response
            responseObserver.onNext(responseProto);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                .withDescription("Error processing request: " + e.getMessage())
                .withCause(e)
                .asException());
        }
    }

    // --- Implementation of StringMustNotBeNullOrEmpty ---
    @Override
    public void stringMustNotBeNullOrEmpty(StringMustNotBeNullOrEmptyRequest request,
                                           StreamObserver<StringMustNotBeNullOrEmptyResponse> responseObserver) {
        try {
            // Convert repeated field to array
            String[] values = request.getValuesList().toArray(new String[0]);

            // Call the static method directly (no need to retrieve instance)
            CheckUtils.StringMustNotBeNullOrEmpty(values);

            // Return empty response if successful
            responseObserver.onNext(StringMustNotBeNullOrEmptyResponse.newBuilder().build());
            responseObserver.onCompleted();
        } catch (IllegalArgumentException e) {
            // Convert validation exceptions to INVALID_ARGUMENT status
            responseObserver.onError(Status.INVALID_ARGUMENT
                .withDescription(e.getMessage())
                .withCause(e)
                .asException());
        } catch (Exception e) {
            // Handle other exceptions
            responseObserver.onError(Status.INTERNAL
                .withDescription("Error calling StringMustNotBeNullOrEmpty: " + e.getMessage())
                .withCause(e)
                .asException());
        }
    }

    // --- Implementation of IntParameterMustBePositive ---
    @Override
    public void intParameterMustBePositive(IntParameterMustBePositiveRequest request,
                                           StreamObserver<IntParameterMustBePositiveResponse> responseObserver) {
        try {
            // Extract parameter
            long parameter = request.getParameter();

            // Call the static method directly (no need to retrieve instance)
            CheckUtils.IntParameterMustBePositive(parameter);

            // Return empty response if successful
            responseObserver.onNext(IntParameterMustBePositiveResponse.newBuilder().build());
            responseObserver.onCompleted();
        } catch (IllegalArgumentException e) {
            // Convert validation exceptions to INVALID_ARGUMENT status
            responseObserver.onError(Status.INVALID_ARGUMENT
                .withDescription(e.getMessage())
                .withCause(e)
                .asException());
        } catch (Exception e) {
            // Handle other exceptions
            responseObserver.onError(Status.INTERNAL
                .withDescription("Error calling IntParameterMustBePositive: " + e.getMessage())
                .withCause(e)
                .asException());
        }
    }

    // --- ServerObjectManager method implementations ---
    @Override
    public RefactoredObjectID toID(CheckUtils instance) {
        // For a static utility class, always return the same ID
        return RefactoredObjectID.newBuilder()
            .setInstanceID(SINGLETON_INSTANCE_ID)
            .setClassID(CLASS_ID)
            .setServiceID(this.serviceId)
            .build();
    }

    @Override
    public CheckUtils fromID(RefactoredObjectID id) {
        // Validate the class ID
        if (id.getClassID() == null || !id.getClassID().equals(CLASS_ID)) {
            throw new IllegalArgumentException("class ID mismatch: expected " + CLASS_ID + ", got " + id.getClassID());
        }

        // This is a static utility class, so we don't actually have instances to return
        // We could return null here, but that might cause NPEs
        // Instead, throw an appropriate exception indicating this is a utility class
        throw new UnsupportedOperationException("CheckUtils is a utility class with static methods only. It cannot be instantiated.");
    }

    @Override
    public String getManagedClassId() {
        return CLASS_ID;
    }

    @Override
    public String getServiceId() {
        return serviceId;
    }
}
