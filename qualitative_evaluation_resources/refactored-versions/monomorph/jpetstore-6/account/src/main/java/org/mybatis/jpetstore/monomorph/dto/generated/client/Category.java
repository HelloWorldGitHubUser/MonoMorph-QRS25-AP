package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import org.mybatis.jpetstore.monomorph.dto.generated.proto.category.*;

/**
 * Auto-generated DTO gRPC client
 * {@link Category} and {@link CategoryDTO}.
 */
public class Category implements java.io.Serializable {
    private static final long serialVersionUID = 3992469837058393712L;
    private CategoryDTO dtoInstance;

    // Default constructor - creates empty DTO
    public Category() {
        this.dtoInstance = CategoryDTO.newBuilder().build();
        // Setting serialVersionUID to match original class
        this.dtoInstance = this.dtoInstance.toBuilder().setSerialVersionUID(serialVersionUID).build();
    }

    // Private constructor for fromDTO method
    private Category(CategoryDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
    }

    // mapping methods
    public CategoryDTO toDTO() {
        return this.dtoInstance;
    }

    public static Category fromDTO(CategoryDTO dtoInstance) {
        return new Category(dtoInstance);
    }

    // Implementation of the original methods
    public java.lang.String getCategoryId() {
        return dtoInstance.getCategoryId();
    }

    public void setCategoryId(java.lang.String categoryId) {
        this.dtoInstance = this.dtoInstance.toBuilder()
                .setCategoryId(categoryId.trim())
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

    @java.lang.Override
    public java.lang.String toString() {
        return getCategoryId();
    }
}
