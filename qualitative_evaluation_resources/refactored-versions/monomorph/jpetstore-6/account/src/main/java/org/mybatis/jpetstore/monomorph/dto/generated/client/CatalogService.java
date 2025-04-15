package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import org.mybatis.jpetstore.monomorph.dto.generated.proto.catalogservice.*;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.product.ProductDTO;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.IDMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Auto-generated DTO gRPC client
 * {@link CatalogService} and {@link CatalogServiceDTO}.
 */
public class CatalogService {
    private CatalogServiceDTO dtoInstance;

    // TARGET_SERVICE_ID is the unique ID for the CatalogService service
    private static final String TARGET_SERVICE_ID = "catalog";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel; // Channel for RPC calls
    private CatalogServiceServiceGrpc.CatalogServiceServiceBlockingStub businessStub; // Use this stub for RPC calls

    /**
     * Private constructor for fromDTO method
     */
    private CatalogService() {
        this.dtoInstance = CatalogServiceDTO.newBuilder().build();
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up RPC connection", e);
        }
    }

    /**
     * Constructor with DTO instance
     */
    public CatalogService(CatalogServiceDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up RPC connection", e);
        }
    }

    /**
     * Constructor matching the original class signature
     */
    public CatalogService(
            org.mybatis.jpetstore.monomorph.dto.generated.client.CategoryMapper categoryMapper,
            org.mybatis.jpetstore.monomorph.id.generated.client.ItemMapper itemMapper,
            org.mybatis.jpetstore.monomorph.dto.generated.client.ProductMapper productMapper) {

        CatalogServiceDTO.Builder builder = CatalogServiceDTO.newBuilder();

        if (categoryMapper != null) {
            builder.setCategoryMapper(categoryMapper.toDTO());
        }

        if (itemMapper != null) {
            builder.setItemMapper(IDMapper.toID(itemMapper).getId());
        }

        if (productMapper != null) {
            builder.setProductMapper(productMapper.toDTO());
        }

        this.dtoInstance = builder.build();

        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up RPC connection", e);
        }
    }

    // mapping methods
    public CatalogServiceDTO toDTO() {
        return this.dtoInstance;
    }

    public static CatalogService fromDTO(CatalogServiceDTO dtoInstance) {
        CatalogService instance = new CatalogService();
        instance.dtoInstance = dtoInstance;
        return instance;
    }

    // Helper methods for gRPC
    protected void performRpcSetup() throws Exception {
        // Use the static TARGET_SERVICE_ID to find the endpoint for business logic calls
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort()).usePlaintext().build();
        this.businessStub = CatalogServiceServiceGrpc.newBlockingStub(businessChannel);
    }

    protected void performSubclassRpcCleanup() {
        // ... shutdown logic for businessChannel ...
         if (this.businessChannel != null && !this.businessChannel.isShutdown()) {
             try {
                 this.businessChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
                  if (!this.businessChannel.isTerminated()) { this.businessChannel.shutdownNow(); }
             } catch (InterruptedException e) {  }
         }
    }

    // Implement required methods for gRPC calls here
    // --- START OF gRPC METHOD IMPLEMENTATIONS ---

    /**
     * Implementation of getProductListByCategory method exposed via gRPC
     *
     * @param categoryId the category ID
     * @return list of Product objects
     */
    public List<org.mybatis.jpetstore.monomorph.dto.generated.client.Product> getProductListByCategory(String categoryId) {
        // Create request message
        GetProductListByCategoryRequest request = GetProductListByCategoryRequest.newBuilder()
                .setDto(this.dtoInstance)
                .setCategoryId(categoryId)
                .build();

        // Make the RPC call
        GetProductListByCategoryResponse response = this.businessStub.getProductListByCategory(request);

        // Convert the ProductDTO list to Product objects
        List<org.mybatis.jpetstore.monomorph.dto.generated.client.Product> products = new ArrayList<>();
        for (ProductDTO productDTO : response.getProductsList()) {
            products.add(org.mybatis.jpetstore.monomorph.dto.generated.client.Product.fromDTO(productDTO));
        }

        return products;
    }

    // --- END OF gRPC METHOD IMPLEMENTATIONS ---

    // Implement all other getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---

    /**
     * Get the CategoryMapper
     * @return CategoryMapper instance
     */
    public org.mybatis.jpetstore.monomorph.dto.generated.client.CategoryMapper getCategoryMapper() {
        if (!this.dtoInstance.hasCategoryMapper()) {
            return null;
        }
        return org.mybatis.jpetstore.monomorph.dto.generated.client.CategoryMapper.fromDTO(
                this.dtoInstance.getCategoryMapper());
    }

    /**
     * Set the CategoryMapper
     * @param categoryMapper the CategoryMapper to set
     */
    public void setCategoryMapper(org.mybatis.jpetstore.monomorph.dto.generated.client.CategoryMapper categoryMapper) {
        CatalogServiceDTO.Builder builder = this.dtoInstance.toBuilder();
        if (categoryMapper != null) {
            builder.setCategoryMapper(categoryMapper.toDTO());
        } else {
            builder.clearCategoryMapper();
        }
        this.dtoInstance = builder.build();
    }

    /**
     * Get the ItemMapper
     * @return ItemMapper instance
     */
    public org.mybatis.jpetstore.monomorph.id.generated.client.ItemMapper getItemMapper() {
        if (this.dtoInstance.getItemMapper().isEmpty()) {
            return null;
        }

        // Create RefactoredObjectID from the stored string ID
        RefactoredObjectID id = RefactoredObjectID.newBuilder()
                .setId(this.dtoInstance.getItemMapper())
                .build();

        // Convert RefactoredObjectID to ItemMapper
        return (org.mybatis.jpetstore.monomorph.id.generated.client.ItemMapper) IDMapper.fromID(id);
    }

    /**
     * Set the ItemMapper
     * @param itemMapper the ItemMapper to set
     */
    public void setItemMapper(org.mybatis.jpetstore.monomorph.id.generated.client.ItemMapper itemMapper) {
        CatalogServiceDTO.Builder builder = this.dtoInstance.toBuilder();
        if (itemMapper != null) {
            RefactoredObjectID id = IDMapper.toID(itemMapper);
            builder.setItemMapper(id.getId());
        } else {
            builder.setItemMapper("");
        }
        this.dtoInstance = builder.build();
    }

    /**
     * Get the ProductMapper
     * @return ProductMapper instance
     */
    public org.mybatis.jpetstore.monomorph.dto.generated.client.ProductMapper getProductMapper() {
        if (!this.dtoInstance.hasProductMapper()) {
            return null;
        }
        return org.mybatis.jpetstore.monomorph.dto.generated.client.ProductMapper.fromDTO(
                this.dtoInstance.getProductMapper());
    }

    /**
     * Set the ProductMapper
     * @param productMapper the ProductMapper to set
     */
    public void setProductMapper(org.mybatis.jpetstore.monomorph.dto.generated.client.ProductMapper productMapper) {
        CatalogServiceDTO.Builder builder = this.dtoInstance.toBuilder();
        if (productMapper != null) {
            builder.setProductMapper(productMapper.toDTO());
        } else {
            builder.clearProductMapper();
        }
        this.dtoInstance = builder.build();
    }

    // --- END OF DTO GETTERS AND SETTERS ---
}