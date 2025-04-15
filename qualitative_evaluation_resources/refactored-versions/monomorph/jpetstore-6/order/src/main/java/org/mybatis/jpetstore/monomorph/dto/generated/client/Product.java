package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import org.mybatis.jpetstore.monomorph.dto.generated.proto.product.*;

/**
 * Auto-generated DTO gRPC client
 * {@link Product} and {@link ProductDTO}.
 */
public class Product implements java.io.Serializable {
    private static final long serialVersionUID = -7492639752670189553L;

    private ProductDTO dtoInstance;

    // Default constructor
    public Product() {
        this.dtoInstance = ProductDTO.newBuilder().build();
    }

    // Constructor that matches the original class's implied constructor
    public Product(String productId, String categoryId, String name, String description) {
        this.dtoInstance = ProductDTO.newBuilder()
            .setProductId(productId)
            .setCategoryId(categoryId)
            .setName(name)
            .setDescription(description)
            .build();
    }

    // Private constructor to initialize from a DTO instance
    private Product(ProductDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
    }

    // mapping methods
    public ProductDTO toDTO() {
        return this.dtoInstance;
    }

    public static Product fromDTO(ProductDTO dtoInstance) {
        return new Product(dtoInstance);
    }

    // implementation of the gRPC exposed methods
    // In this case, there are no explicit exposed methods in the proto file
    // beyond the standard getters and setters for the DTO fields

    // Implement all other getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---
    public java.lang.String getProductId() {
        return dtoInstance.getProductId();
    }

    public void setProductId(java.lang.String productId) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setProductId(productId.trim())
            .build();
    }

    public java.lang.String getCategoryId() {
        return dtoInstance.getCategoryId();
    }

    public void setCategoryId(java.lang.String categoryId) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setCategoryId(categoryId)
            .build();
    }

    public java.lang.String getName() {
        return dtoInstance.getName();
    }

    public void setName(java.lang.String name) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setName(name)
            .build();
    }

    public java.lang.String getDescription() {
        return dtoInstance.getDescription();
    }

    public void setDescription(java.lang.String description) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setDescription(description)
            .build();
    }
    // --- END OF DTO GETTERS AND SETTERS ---

    @java.lang.Override
    public java.lang.String toString() {
        return getName();
    }
}
