package org.mybatis.jpetstore.monomorph.dto.generated.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.mybatis.jpetstore.domain.Product;
import org.mybatis.jpetstore.monomorph.config.ServiceRegistry;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.productmapper.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Auto-generated DTO gRPC client
 * {@link org.mybatis.jpetstore.mapper.ProductMapper} and {@link ProductMapperDTO}.
 */
public class ProductMapper implements org.mybatis.jpetstore.mapper.ProductMapper {
    private static final String TARGET_SERVICE_ID = "productmapper-service";
    private static final int SHUTDOWN_TIMEOUT = 5; // in seconds

    private ProductMapperDTO dtoInstance;
    private ProductMapperServiceGrpc.ProductMapperServiceBlockingStub blockingStub;
    private ManagedChannel channel;

    // Default constructor to create an empty instance
    public ProductMapper() {
        this.dtoInstance = ProductMapperDTO.getDefaultInstance();
        performRpcSetup();
    }

    public ProductMapper(ProductMapperDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;
        performRpcSetup();
    }

    private void performRpcSetup() {
        // Get service host and port from ServiceRegistry
        String host = ServiceRegistry.getServiceHost(TARGET_SERVICE_ID);
        int port = ServiceRegistry.getServicePort(TARGET_SERVICE_ID);

        // Create the channel and stub
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = ProductMapperServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        if (channel != null && !channel.isShutdown()) {
            channel.shutdown().awaitTermination(SHUTDOWN_TIMEOUT, TimeUnit.SECONDS);
        }
    }

    // mapping methods
    public ProductMapperDTO toDTO() {
        return this.dtoInstance;
    }

    public static ProductMapper fromDTO(ProductMapperDTO dtoInstance) {
        ProductMapper instance = new ProductMapper(dtoInstance);
        return instance;
    }

    // implementation of the gRPC exposed methods
    @Override
    public List<Product> getProductListByCategory(String categoryId) {
        GetProductListByCategoryRequest request = GetProductListByCategoryRequest.newBuilder()
                .setCategoryId(categoryId)
                .build();

        GetProductListByCategoryResponse response = blockingStub.getProductListByCategory(request);

        // Convert proto products to domain products
        List<Product> products = new ArrayList<>();
        for (org.mybatis.jpetstore.monomorph.dto.generated.proto.productmapper.Product protoProduct : response.getProductsList()) {
            products.add(convertProtoToProduct(protoProduct));
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
            return convertProtoToProduct(response.getProduct());
        }

        return null;
    }

    @Override
    public List<Product> searchProductList(String keywords) {
        SearchProductListRequest request = SearchProductListRequest.newBuilder()
                .setKeywords(keywords)
                .build();

        SearchProductListResponse response = blockingStub.searchProductList(request);

        // Convert proto products to domain products
        List<Product> products = new ArrayList<>();
        for (org.mybatis.jpetstore.monomorph.dto.generated.proto.productmapper.Product protoProduct : response.getProductsList()) {
            products.add(convertProtoToProduct(protoProduct));
        }

        return products;
    }

    // Helper method to convert proto Product to domain Product
    private Product convertProtoToProduct(org.mybatis.jpetstore.monomorph.dto.generated.proto.productmapper.Product protoProduct) {
        Product product = new Product();
        product.setProductId(protoProduct.getProductId());
        product.setCategoryId(protoProduct.getCategoryId());
        product.setName(protoProduct.getName());
        product.setDescription(protoProduct.getDescription());
        product.setImageUrl(protoProduct.getImageUrl());
        product.setListPrice(protoProduct.getListPrice());
        product.setUnitCost(protoProduct.getUnitCost());

        // Set other fields as needed based on the actual Product domain class

        return product;
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
