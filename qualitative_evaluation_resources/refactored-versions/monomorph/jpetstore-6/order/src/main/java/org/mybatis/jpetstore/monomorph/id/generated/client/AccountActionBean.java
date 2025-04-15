package org.mybatis.jpetstore.monomorph.id.generated.client;

import org.mybatis.jpetstore.monomorph.id.shared.client.AbstractRefactoredClient;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.id.shared.RefactoredObjectID;
// gRPC imports
import org.mybatis.jpetstore.monomorph.id.generated.proto.accountactionbean.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.sourceforge.stripes.action.Resolution;

import java.util.concurrent.TimeUnit;

public class AccountActionBean extends AbstractRefactoredClient {

    private static final String TARGET_SERVICE_ID = "account";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel;
    private AccountActionBeanServiceGrpc.AccountActionBeanServiceBlockingStub businessStub;

    // Original class fields
    private Account account = new Account();
    private boolean authenticated;

    /** Default constructor. */
    public AccountActionBean() {
        super();
    }

    /** Private constructor used by the fromID factory. */
    private AccountActionBean(RefactoredObjectID existingId) {
        super(existingId);
    }

    // --- Implementation of Abstract Methods ---

    @Override
    protected void performRpcSetup() throws Exception {
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort()).usePlaintext().build();
        this.businessStub = AccountActionBeanServiceGrpc.newBlockingStub(businessChannel);
    }

    @Override
    protected RefactoredObjectID performRemoteCreateAndGetId(String clientId) throws Exception {
        performRpcSetup();

        // Create constructor args with default values
        ConstructorArgs constructorArgs = ConstructorArgs.newBuilder()
            .setAuthenticated(false)
            .setAccount(this.account != null ? this.account.toDTO() : null)
            .build();

        CreateObjectRequest createRequest = CreateObjectRequest.newBuilder()
            .setClientID(clientId)
            .setConstructorArgs(constructorArgs)
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
            } catch (InterruptedException e) { }
        }
    }

    /** Factory method for creating proxy from an EXISTING ID. */
    @Override
    public static AccountActionBean fromID(RefactoredObjectID existingId) {
        return new AccountActionBean(existingId);
    }

    // --- Implementation of the service methods ---

    /**
     * Checks if is authenticated.
     *
     * @return true, if is authenticated
     */
    public boolean isAuthenticated() {
        try {
            ensureRpcChannelsAreSetup();

            IsAuthenticatedRequest request = IsAuthenticatedRequest.newBuilder()
                .setRefactoredObjectID(this.objectId)
                .build();

            IsAuthenticatedResponse response = this.businessStub.isAuthenticated(request);
            return response.getAuthenticated();
        } catch (Exception e) {
            throw new RuntimeException("Error calling isAuthenticated", e);
        }
    }

    /**
     * Gets the account.
     *
     * @return the account
     */
    public Account getAccount() {
        try {
            ensureRpcChannelsAreSetup();

            GetAccountRequest request = GetAccountRequest.newBuilder()
                .setRefactoredObjectID(this.objectId)
                .build();

            GetAccountResponse response = this.businessStub.getAccount(request);

            // Convert the DTO to the client-side Account object
            return response.hasAccount() ?
                Account.fromDTO(response.getAccount()) :
                null;
        } catch (Exception e) {
            throw new RuntimeException("Error calling getAccount", e);
        }
    }

    // Additional methods from original class to maintain compatibility

    public String getUsername() {
        Account account = getAccount();
        return account != null ? account.getUsername() : null;
    }

    public void setUsername(String username) {
        Account account = getAccount();
        if (account != null) {
            account.setUsername(username);
        }
    }

    public String getPassword() {
        Account account = getAccount();
        return account != null ? account.getPassword() : null;
    }

    public void setPassword(String password) {
        Account account = getAccount();
        if (account != null) {
            account.setPassword(password);
        }
    }
}
