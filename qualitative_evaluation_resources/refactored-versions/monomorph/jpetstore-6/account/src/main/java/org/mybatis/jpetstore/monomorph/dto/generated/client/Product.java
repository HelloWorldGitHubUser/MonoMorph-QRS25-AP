package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import org.mybatis.jpetstore.monomorph.dto.generated.proto.product.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.mybatis.jpetstore.monomorph.ServiceRegistry;

/**
 * Auto-generated DTO gRPC client
 * {@link Product} and {@link ProductDTO}.
 */
public class Product implements java.io.Serializable {
    private static final long serialVersionUID = -7492639752670189553L;

    // Service identification for registry lookup
    private static final String TARGET_SERVICE_ID = "product-service";

    // gRPC stub for remote calls
    private static ProductServiceGrpc.ProductServiceBlockingStub stub;

    private ProductDTO dtoInstance;

    /**
     * Private constructor used by fromDTO method
     */
    private Product(ProductDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
    }

    /**
     * Default constructor - creates an empty Product
     */
    public Product() {
        this.dtoInstance = ProductDTO.newBuilder().build();
        performRpcSetup();
    }

    /**
     * Sets up the gRPC channel and stub
     */
    private static void performRpcSetup() {
        if (stub == null) {
            synchronized (Product.class) {
                if (stub == null) {
                    String host = ServiceRegistry.getServiceHost(TARGET_SERVICE_ID);
                    int port = ServiceRegistry.getServicePort(TARGET_SERVICE_ID);

                    ManagedChannel channel = ManagedChannelBuilder
                        .forAddress(host, port)
                        .usePlaintext() // Not using TLS for simplicity
                        .build();

                    stub = ProductServiceGrpc.newBlockingStub(channel);
                }
            }
        }
    }

    // mapping methods
    public ProductDTO toDTO() {
        return this.dtoInstance;
    }

    public static Product fromDTO(ProductDTO dtoInstance) {
        return new Product(dtoInstance);
    }

    // Implementation of getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---
    public java.lang.String getProductId() {
        return dtoInstance.getProductId();
    }

    public void setProductId(java.lang.String productId) {
        dtoInstance = dtoInstance.toBuilder()
            .setProductId(productId.trim())
            .build();
    }

    public java.lang.String getCategoryId() {
        return dtoInstance.getCategoryId();
    }

    public void setCategoryId(java.lang.String categoryId) {
        dtoInstance = dtoInstance.toBuilder()
            .setCategoryId(categoryId)
            .build();
    }

    public java.lang.String getName() {
        return dtoInstance.getName();
    }

    public void setName(java.lang.String name) {
        dtoInstance = dtoInstance.toBuilder()
            .setName(name)
            .build();
    }

    public java.lang.String getDescription() {
        return dtoInstance.getDescription();
    }

    public void setDescription(java.lang.String description) {
        dtoInstance = dtoInstance.toBuilder()
            .setDescription(description)
            .build();
    }
    // --- END OF DTO GETTERS AND SETTERS ---

    @java.lang.Override
    public java.lang.String toString() {
        return getName();
    }
}
