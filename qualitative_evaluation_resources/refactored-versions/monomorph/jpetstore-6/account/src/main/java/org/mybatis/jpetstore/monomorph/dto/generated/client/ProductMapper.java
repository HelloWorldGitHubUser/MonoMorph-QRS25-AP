package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.mybatis.jpetstore.domain.Product;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.productmapper.*;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.mybatis.jpetstore.monomorph.ServiceRegistry;

/**
 * Auto-generated DTO gRPC client
 * {@link org.mybatis.jpetstore.mapper.ProductMapper} and {@link ProductMapperDTO}.
 */
public class ProductMapper implements org.mybatis.jpetstore.mapper.ProductMapper {
    private static final String TARGET_SERVICE_ID = "productmapper-service";
    private ProductMapperDTO dtoInstance;
    private ProductMapperServiceGrpc.ProductMapperServiceBlockingStub blockingStub;
    private ManagedChannel channel;

    public ProductMapper() {
        this.dtoInstance = ProductMapperDTO.newBuilder().build();
        performRpcSetup();
    }

    public ProductMapper(ProductMapperDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;
        performRpcSetup();
    }

    // Set up the gRPC channel and stub
    private void performRpcSetup() {
        String host = ServiceRegistry.getServiceHost(TARGET_SERVICE_ID);
        int port = ServiceRegistry.getServicePort(TARGET_SERVICE_ID);

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext() // For development only, use TLS in production
                .build();

        blockingStub = ProductMapperServiceGrpc.newBlockingStub(channel);
    }

    // For clean shutdown
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    // mapping methods
    public ProductMapperDTO toDTO() {
        return this.dtoInstance;
    }

    public static ProductMapper fromDTO(ProductMapperDTO dtoInstance) {
        ProductMapper instance = new ProductMapper(dtoInstance);
        return instance;
    }

    // Implementation of the gRPC exposed methods from the original interface
    @Override
    public List<Product> getProductListByCategory(String categoryId) {
        GetProductListByCategoryRequest request = GetProductListByCategoryRequest.newBuilder()
                .setCategoryId(categoryId)
                .build();

        GetProductListByCategoryResponse response = blockingStub.getProductListByCategory(request);

        // Convert the proto Products to domain Products
        List<Product> products = new ArrayList<>();
        for (org.mybatis.jpetstore.monomorph.dto.generated.proto.productmapper.Product protoProduct : response.getProductsList()) {
            products.add(convertProtoProductToDomain(protoProduct));
        }

        return products;
    }

    @Override
    public Product getProduct(String productId) {
        GetProductRequest request = GetProductRequest.newBuilder()
                .setProductId(productId)
                .build();

        GetProductResponse response = blockingStub.getProduct(request);

        if (response.hasProduct()) {
            return convertProtoProductToDomain(response.getProduct());
        }
        return null;
    }

    @Override
    public List<Product> searchProductList(String keywords) {
        SearchProductListRequest request = SearchProductListRequest.newBuilder()
                .setKeywords(keywords)
                .build();

        SearchProductListResponse response = blockingStub.searchProductList(request);

        // Convert the proto Products to domain Products
        List<Product> products = new ArrayList<>();
        for (org.mybatis.jpetstore.monomorph.dto.generated.proto.productmapper.Product protoProduct : response.getProductsList()) {
            products.add(convertProtoProductToDomain(protoProduct));
        }

        return products;
    }

    // Helper method to convert proto Product to domain Product
    private Product convertProtoProductToDomain(org.mybatis.jpetstore.monomorph.dto.generated.proto.productmapper.Product protoProduct) {
        Product domainProduct = new Product();
        domainProduct.setProductId(protoProduct.getProductId());
        domainProduct.setCategoryId(protoProduct.getCategoryId());
        domainProduct.setName(protoProduct.getName());
        domainProduct.setDescription(protoProduct.getDescription());
        // Set other fields from the proto Product to the domain Product
        // This would need to be completed based on the actual Product class definition
        
        return domainProduct;
    }

    // Implement all other getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---
    public GetProductListByCategoryRequest getGetProductListByCategoryRequest() {
        return dtoInstance.getGetProductListByCategoryRequest();
    }

    public void setGetProductListByCategoryRequest(GetProductListByCategoryRequest request) {
        this.dtoInstance = dtoInstance.toBuilder()
                .setGetProductListByCategoryRequest(request)
                .build();
    }

    public GetProductRequest getGetProductRequest() {
        return dtoInstance.getGetProductRequest();
    }

    public void setGetProductRequest(GetProductRequest request) {
        this.dtoInstance = dtoInstance.toBuilder()
                .setGetProductRequest(request)
                .build();
    }

    public SearchProductListRequest getSearchProductListRequest() {
        return dtoInstance.getSearchProductListRequest();
    }

    public void setSearchProductListRequest(SearchProductListRequest request) {
        this.dtoInstance = dtoInstance.toBuilder()
                .setSearchProductListRequest(request)
                .build();
    }

    public GetProductListByCategoryResponse getGetProductListByCategoryResponse() {
        return dtoInstance.getGetProductListByCategoryResponse();
    }

    public void setGetProductListByCategoryResponse(GetProductListByCategoryResponse response) {
        this.dtoInstance = dtoInstance.toBuilder()
                .setGetProductListByCategoryResponse(response)
                .build();
    }

    public GetProductResponse getGetProductResponse() {
        return dtoInstance.getGetProductResponse();
    }

    public void setGetProductResponse(GetProductResponse response) {
        this.dtoInstance = dtoInstance.toBuilder()
                .setGetProductResponse(response)
                .build();
    }

    public SearchProductListResponse getSearchProductListResponse() {
        return dtoInstance.getSearchProductListResponse();
    }

    public void setSearchProductListResponse(SearchProductListResponse response) {
        this.dtoInstance = dtoInstance.toBuilder()
                .setSearchProductListResponse(response)
                .build();
    }

    // --- END OF DTO GETTERS AND SETTERS ---
}
