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

/
/**
 * Auto-generated DTO gRPC client
 * {@link CatalogService} and {@link CatalogServiceDTO}.
 */
public class CatalogService {
    private CatalogServiceDTO dtoInstance;

    private CatalogService() {
        // Empty private constructor for fromDTO method
        this.dtoInstance = CatalogServiceDTO.newBuilder().build();
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up RPC connection", e);
        }
    }

    public CatalogService(CatalogServiceDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;
        try {
            performRpcSetup();
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up RPC connection", e);
        }
    }

    // Constructor matching original class
    public CatalogService(CategoryMapper categoryMapper, ItemMapper itemMapper, ProductMapper productMapper) {
        this.dtoInstance = CatalogServiceDTO.newBuilder()
                .setCategoryMapper(categoryMapper.toDTO())
                .setItemMapper(IDMapper.toID(itemMapper).getId())
                .setProductMapper(productMapper.toDTO())
                .build();
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
        CatalogService instance = new CatalogService(dtoInstance);
        return instance;
    }

    // implementation of the gRPC exposed methods

    // TARGET_SERVICE_ID is the unique ID for the ClassA service, provided by the tool
    private static final String TARGET_SERVICE_ID = "catalog";

    // --- gRPC Specific Fields ---
    private ManagedChannel businessChannel; // Channel for RPC calls
    private CatalogServiceServiceGrpc.CatalogServiceServiceBlockingStub businessStub; // Use this stub for RPC calls

    // Helper methods for gRPC
    protected void performRpcSetup() throws Exception {
        // Use the static TARGET_SERVICE_ID to find the endpoint for business logic calls
        ServiceRegistry.ServiceEndpoint endpoint = ServiceRegistry.getEndpoint(TARGET_SERVICE_ID);
        this.businessChannel = ManagedChannelBuilder.forAddress(endpoint.getHost(), endpoint.getPort()).usePlaintext().build();
        this.businessStub = CatalogServiceServiceGrpc.newBlockingStub(this.businessChannel);
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
     * Get a list of products belonging to a specific category
     *
     * @param categoryId the category identifier
     * @return the list of products in that category
     */
    public List<Product> getProductListByCategory(String categoryId) {
        // Create the request
        GetProductListByCategoryRequest request = GetProductListByCategoryRequest.newBuilder()
                .setDto(this.dtoInstance)
                .setCategoryId(categoryId)
                .build();

        // Make the RPC call
        GetProductListByCategoryResponse response = businessStub.getProductListByCategory(request);

        // Convert response to domain objects
        List<Product> products = new ArrayList<>();
        for (ProductDTO productDTO : response.getProductsList()) {
            products.add(Product.fromDTO(productDTO));
        }

        return products;
    }

    // --- END OF gRPC METHOD IMPLEMENTATIONS ---

    // Implement all other getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---

    public CategoryMapper getCategoryMapper() {
        return CategoryMapper.fromDTO(this.dtoInstance.getCategoryMapper());
    }

    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.dtoInstance = this.dtoInstance.toBuilder()
                .setCategoryMapper(categoryMapper.toDTO())
                .build();
    }

    public ItemMapper getItemMapper() {
        return (ItemMapper) IDMapper.fromID(
                RefactoredObjectID.newBuilder()
                        .setId(this.dtoInstance.getItemMapper())
                        .build());
    }

    public void setItemMapper(ItemMapper itemMapper) {
        this.dtoInstance = this.dtoInstance.toBuilder()
                .setItemMapper(IDMapper.toID(itemMapper).getId())
                .build();
    }

    public ProductMapper getProductMapper() {
        return ProductMapper.fromDTO(this.dtoInstance.getProductMapper());
    }

    public void setProductMapper(ProductMapper productMapper) {
        this.dtoInstance = this.dtoInstance.toBuilder()
                .setProductMapper(productMapper.toDTO())
                .build();
    }

    // --- END OF DTO GETTERS AND SETTERS ---
}