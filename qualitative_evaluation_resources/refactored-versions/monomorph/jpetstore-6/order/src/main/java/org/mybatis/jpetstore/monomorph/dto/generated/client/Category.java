package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import org.mybatis.jpetstore.monomorph.dto.generated.proto.category.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.mybatis.jpetstore.monomorph.registry.ServiceRegistry;

/**
 * Auto-generated DTO gRPC client
 * {@link Category} and {@link CategoryDTO}.
 */
public class Category implements java.io.Serializable {
    private static final String TARGET_SERVICE_ID = "category-service";
    private static final long serialVersionUID = 3992469837058393712L;

    private CategoryDTO dtoInstance;

    // Default constructor
    public Category() {
        this.dtoInstance = CategoryDTO.newBuilder().build();
    }

    public Category(CategoryDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;
    }

    // Constructor with all fields
    public Category(String categoryId, String name, String description) {
        this.dtoInstance = CategoryDTO.newBuilder()
            .setCategoryId(categoryId != null ? categoryId : "")
            .setName(name != null ? name : "")
            .setDescription(description != null ? description : "")
            .setSerialVersionUID(serialVersionUID)
            .build();
    }

    // mapping methods
    public CategoryDTO toDTO() {
        return this.dtoInstance;
    }

    public static Category fromDTO(CategoryDTO dtoInstance) {
        return new Category(dtoInstance);
    }

    // RPC service stub setup
    private static void performRpcSetup() {
        String host = ServiceRegistry.getInstance().getServiceHost(TARGET_SERVICE_ID);
        int port = ServiceRegistry.getInstance().getServicePort(TARGET_SERVICE_ID);
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
            .usePlaintext()
            .build();
        // Initialize gRPC stubs here when we have service definitions
        // For example: categoryServiceStub = CategoryServiceGrpc.newBlockingStub(channel);
    }

    // --- START OF DTO GETTERS AND SETTERS ---
    public java.lang.String getCategoryId() {
        return dtoInstance.getCategoryId();
    }

    public void setCategoryId(java.lang.String categoryId) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setCategoryId(categoryId != null ? categoryId.trim() : "")
            .build();
    }

    public java.lang.String getName() {
        return dtoInstance.getName();
    }

    public void setName(java.lang.String name) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setName(name != null ? name : "")
            .build();
    }

    public java.lang.String getDescription() {
        return dtoInstance.getDescription();
    }

    public void setDescription(java.lang.String description) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setDescription(description != null ? description : "")
            .build();
    }
    // --- END OF DTO GETTERS AND SETTERS ---

    @java.lang.Override
    public java.lang.String toString() {
        return getCategoryId();
    }
}