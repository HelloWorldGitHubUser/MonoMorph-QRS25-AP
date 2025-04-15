package org.mybatis.jpetstore.monomorph.id.generated.server;

import io.grpc.stub.StreamObserver;
import org.mybatis.jpetstore.monomorph.id.generated.proto.accountactionbean.*;
import org.mybatis.jpetstore.monomorph.id.shared.server.LeaseManager;
import org.mybatis.jpetstore.monomorph.id.shared.server.ServerObjectManager;
import org.mybatis.jpetstore.monomorph.id.shared.RefactoredObjectID;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ClassIdRegistry;
import org.mybatis.jpetstore.web.actions.AccountActionBean;
import org.mybatis.jpetstore.domain.Account;
import org.mybatis.jpetstore.monomorph.dto.generated.server.AccountMapper;

import java.util.Objects;
import java.util.UUID;

/**
 * gRPC Service implementation for AccountActionBean.
 * - Handles gRPC requests for AccountActionBean API.
 * - Creates transient AccountActionBean instances.
 * - Interacts with LeaseManager for instance registration/retrieval.
 * - Calls business methods on retrieved AccountActionBean instances.
 */
public class AccountActionBeanImpl extends AccountActionBeanServiceGrpc.AccountActionBeanServiceImplBase implements ServerObjectManager<AccountActionBean> {

    private final LeaseManager leaseManager;
    private final String serviceId;

    // Static identifier for the class type managed by this service
    public static final String CLASS_ID = ClassIdRegistry.getClassId("AccountActionBean");

    public AccountActionBeanImpl(LeaseManager leaseManager) {
        this.leaseManager = Objects.requireNonNull(leaseManager);
        this.serviceId = ServiceRegistry.getServiceId();
    }

    // --- createObject gRPC Method Implementation ---

    @Override
    public void createObject(CreateObjectRequest request, StreamObserver<RefactoredObjectID> responseObserver) {
        try {
            // 1. Extract args & client ID
            String clientId = request.getClientID();
            ConstructorArgs constructorArgs = request.getConstructorArgs();

            // 2. Create the transient instance
            AccountActionBean newInstance = new AccountActionBean();

            // Apply any initialization from constructor args if needed
            if (constructorArgs.hasAccount()) {
                Account account = AccountMapper.INSTANCE.fromDTO(constructorArgs.getAccount());
                newInstance.setAccount(account);
            }

            if (constructorArgs.getAuthenticated()) {
                // Since authenticated is private and has no setter, we can't set it directly
                // This would require a workaround or modification of the original class
            }

            // 3. Generate a RefactoredObjectID ID
            RefactoredObjectID responseProto = toID(newInstance, clientId);

            // 4. Send the response
            responseObserver.onNext(responseProto);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    // --- ServerObjectManager method implementations ---

    public RefactoredObjectID toID(AccountActionBean instance, String clientId) {
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
        return RefactoredObjectID.newBuilder()
                .setInstanceID(instanceId)
                .setClassID(CLASS_ID)
                .setServiceID(this.serviceId)
                .build();
    }

    @Override
    public RefactoredObjectID toID(AccountActionBean instance) {
        // This overload is required by the interface but we need a clientId
        // In a real scenario, you might want to use a default client ID or throw an exception
        return toID(instance, "default-client");
    }

    @Override
    public AccountActionBean fromID(RefactoredObjectID id) {
        // Validate the class ID
        if (id.getClassID() == null || !id.getClassID().equals(CLASS_ID)) {
            throw new IllegalArgumentException("class ID mismatch: expected " + CLASS_ID + ", got " + id.getClassID());
        }
        // Retrieve the instance from LeaseManager
        AccountActionBean instance = (AccountActionBean) leaseManager.getInstance(id.getInstanceID());
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

    // --- RPC method implementations ---

    @Override
    public void isAuthenticated(IsAuthenticatedRequest request, StreamObserver<IsAuthenticatedResponse> responseObserver) {
        try {
            // Get the object ID and retrieve the instance
            RefactoredObjectID objectId = request.getRefactoredObjectID();
            AccountActionBean instance = fromID(objectId);

            // Call the business method
            boolean authenticated = instance.isAuthenticated();

            // Build and send the response
            IsAuthenticatedResponse response = IsAuthenticatedResponse.newBuilder()
                    .setAuthenticated(authenticated)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    @Override
    public void getAccount(GetAccountRequest request, StreamObserver<GetAccountResponse> responseObserver) {
        try {
            // Get the object ID and retrieve the instance
            RefactoredObjectID objectId = request.getRefactoredObjectID();
            AccountActionBean instance = fromID(objectId);

            // Call the business method
            Account account = instance.getAccount();

            // Convert the Account to AccountDTO
            org.mybatis.jpetstore.monomorph.dto.generated.proto.account.AccountDTO accountDTO =
                    (account != null) ? AccountMapper.INSTANCE.toDTO(account) : null;

            // Build and send the response
            GetAccountResponse.Builder responseBuilder = GetAccountResponse.newBuilder();
            if (accountDTO != null) {
                responseBuilder.setAccount(accountDTO);
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
}
