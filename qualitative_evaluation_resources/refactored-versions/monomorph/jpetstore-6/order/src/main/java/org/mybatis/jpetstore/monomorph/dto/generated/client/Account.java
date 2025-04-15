package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.account.*;
import org.mybatis.jpetstore.monomorph.registry.ServiceRegistry;

import java.io.Serializable;

/
/**
 * Auto-generated DTO gRPC client
 * {@link Account} and {@link AccountDTO}.
 */
public class Account implements Serializable {
    private static final String TARGET_SERVICE_ID = "accountService";
    private static final long serialVersionUID = 8751282105532159742L;

    private AccountDTO dtoInstance;
    private static ManagedChannel channel;

    // Default constructor
    public Account() {
        this.dtoInstance = AccountDTO.newBuilder().build();
        performRpcSetup();
    }

    // Constructor that accepts a DTO instance
    public Account(AccountDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;
        performRpcSetup();
    }

    // Private method to set up the gRPC connection
    private void performRpcSetup() {
        if (channel == null) {
            synchronized (Account.class) {
                if (channel == null) {
                    String host = ServiceRegistry.getServiceHost(TARGET_SERVICE_ID);
                    int port = ServiceRegistry.getServicePort(TARGET_SERVICE_ID);
                    
                    channel = ManagedChannelBuilder.forAddress(host, port)
                            .usePlaintext()
                            .build();
                    
                    // Here you would typically initialize your Stub
                    // accountServiceStub = AccountServiceGrpc.newBlockingStub(channel);
                }
            }
        }
    }

    // mapping methods
    public AccountDTO toDTO() {
        return this.dtoInstance;
    }

    public static Account fromDTO(AccountDTO dtoInstance) {
        return new Account(dtoInstance);
    }

    // implementation of the gRPC exposed methods
    // These would typically call methods on the gRPC stub

    // --- START OF DTO GETTERS AND SETTERS ---
    public String getUsername() {
        return dtoInstance.getUsername();
    }

    public void setUsername(String username) {
        this.dtoInstance = this.dtoInstance.toBuilder().setUsername(username).build();
    }

    public String getPassword() {
        return dtoInstance.getPassword();
    }

    public void setPassword(String password) {
        this.dtoInstance = this.dtoInstance.toBuilder().setPassword(password).build();
    }

    public String getEmail() {
        return dtoInstance.getEmail();
    }

    public void setEmail(String email) {
        this.dtoInstance = this.dtoInstance.toBuilder().setEmail(email).build();
    }

    public String getFirstName() {
        return dtoInstance.getFirstName();
    }

    public void setFirstName(String firstName) {
        this.dtoInstance = this.dtoInstance.toBuilder().setFirstName(firstName).build();
    }

    public String getLastName() {
        return dtoInstance.getLastName();
    }

    public void setLastName(String lastName) {
        this.dtoInstance = this.dtoInstance.toBuilder().setLastName(lastName).build();
    }

    public String getStatus() {
        return dtoInstance.getStatus();
    }

    public void setStatus(String status) {
        this.dtoInstance = this.dtoInstance.toBuilder().setStatus(status).build();
    }

    public String getAddress1() {
        return dtoInstance.getAddress1();
    }

    public void setAddress1(String address1) {
        this.dtoInstance = this.dtoInstance.toBuilder().setAddress1(address1).build();
    }

    public String getAddress2() {
        return dtoInstance.getAddress2();
    }

    public void setAddress2(String address2) {
        this.dtoInstance = this.dtoInstance.toBuilder().setAddress2(address2).build();
    }

    public String getCity() {
        return dtoInstance.getCity();
    }

    public void setCity(String city) {
        this.dtoInstance = this.dtoInstance.toBuilder().setCity(city).build();
    }

    public String getState() {
        return dtoInstance.getState();
    }

    public void setState(String state) {
        this.dtoInstance = this.dtoInstance.toBuilder().setState(state).build();
    }

    public String getZip() {
        return dtoInstance.getZip();
    }

    public void setZip(String zip) {
        this.dtoInstance = this.dtoInstance.toBuilder().setZip(zip).build();
    }

    public String getCountry() {
        return dtoInstance.getCountry();
    }

    public void setCountry(String country) {
        this.dtoInstance = this.dtoInstance.toBuilder().setCountry(country).build();
    }

    public String getPhone() {
        return dtoInstance.getPhone();
    }

    public void setPhone(String phone) {
        this.dtoInstance = this.dtoInstance.toBuilder().setPhone(phone).build();
    }

    public String getFavouriteCategoryId() {
        return dtoInstance.getFavouriteCategoryId();
    }

    public void setFavouriteCategoryId(String favouriteCategoryId) {
        this.dtoInstance = this.dtoInstance.toBuilder().setFavouriteCategoryId(favouriteCategoryId).build();
    }

    public String getLanguagePreference() {
        return dtoInstance.getLanguagePreference();
    }

    public void setLanguagePreference(String languagePreference) {
        this.dtoInstance = this.dtoInstance.toBuilder().setLanguagePreference(languagePreference).build();
    }

    public boolean isListOption() {
        return dtoInstance.getListOption();
    }

    public void setListOption(boolean listOption) {
        this.dtoInstance = this.dtoInstance.toBuilder().setListOption(listOption).build();
    }

    public boolean isBannerOption() {
        return dtoInstance.getBannerOption();
    }

    public void setBannerOption(boolean bannerOption) {
        this.dtoInstance = this.dtoInstance.toBuilder().setBannerOption(bannerOption).build();
    }

    public String getBannerName() {
        return dtoInstance.getBannerName();
    }

    public void setBannerName(String bannerName) {
        this.dtoInstance = this.dtoInstance.toBuilder().setBannerName(bannerName).build();
    }
    // --- END OF DTO GETTERS AND SETTERS ---
}
