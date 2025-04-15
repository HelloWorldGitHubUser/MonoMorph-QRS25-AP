package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.mybatis.jpetstore.domain.Category;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.categorymapper.*;
import org.mybatis.jpetstore.monomorph.registry.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Auto-generated DTO gRPC client
 * {@link CategoryMapper} and {@link CategoryMapperDTO}.
 */
public class CategoryMapper implements org.mybatis.jpetstore.mapper.CategoryMapper {
    private static final String TARGET_SERVICE_ID = "CATEGORY_MAPPER_SERVICE";
    private final CategoryMapperServiceGrpc.CategoryMapperServiceBlockingStub blockingStub;
    private CategoryMapperDTO dtoInstance;

    // Connection-related fields
    private final ManagedChannel channel;

    // Default constructor - initializes the gRPC connection
    public CategoryMapper() {
        this.dtoInstance = CategoryMapperDTO.getDefaultInstance();

        // Initialize the gRPC connection
        String[] hostAndPort = performRpcSetup();
        this.channel = ManagedChannelBuilder.forAddress(hostAndPort[0], Integer.parseInt(hostAndPort[1]))
                .usePlaintext()
                .build();
        this.blockingStub = CategoryMapperServiceGrpc.newBlockingStub(channel);
    }

    public CategoryMapper(CategoryMapperDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;

        // Initialize the gRPC connection
        String[] hostAndPort = performRpcSetup();
        this.channel = ManagedChannelBuilder.forAddress(hostAndPort[0], Integer.parseInt(hostAndPort[1]))
                .usePlaintext()
                .build();
        this.blockingStub = CategoryMapperServiceGrpc.newBlockingStub(channel);
    }

    // Helper method to get host and port from ServiceRegistry
    private String[] performRpcSetup() {
        String serviceUrl = ServiceRegistry.getInstance().getServiceUrl(TARGET_SERVICE_ID);
        // Assuming the URL format is host:port
        return serviceUrl.split(":");
    }

    // mapping methods
    public CategoryMapperDTO toDTO() {
        return this.dtoInstance;
    }

    public static CategoryMapper fromDTO(CategoryMapperDTO dtoInstance) {
        return new CategoryMapper(dtoInstance);
    }

    // Implementation of the original interface methods using gRPC
    @Override
    public List<Category> getCategoryList() {
        GetCategoryListRequest request = GetCategoryListRequest.getDefaultInstance();
        GetCategoryListResponse response = blockingStub.getCategoryList(request);

        List<Category> categoryList = new ArrayList<>();
        for (org.mybatis.jpetstore.monomorph.dto.generated.proto.categorymapper.Category protoCategory : response.getCategoryListList()) {
            categoryList.add(convertProtoToCategory(protoCategory));
        }

        return categoryList;
    }

    @Override
    public Category getCategory(String categoryId) {
        GetCategoryRequest request = GetCategoryRequest.newBuilder()
                .setCategoryId(categoryId)
                .build();
        GetCategoryResponse response = blockingStub.getCategory(request);

        return convertProtoToCategory(response.getCategory());
    }

    // Helper methods to convert between domain objects and proto messages
    private Category convertProtoToCategory(org.mybatis.jpetstore.monomorph.dto.generated.proto.categorymapper.Category protoCategory) {
        Category category = new Category();
        category.setCategoryId(protoCategory.getCategoryId());
        category.setName(protoCategory.getName());
        category.setDescription(protoCategory.getDescription());
        return category;
    }

    // Close the channel when it's no longer needed
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    // --- START OF DTO GETTERS AND SETTERS ---
    // Since CategoryMapperDTO doesn't have fields (it's empty in our proto),
    // there are no getters and setters to implement
    // --- END OF DTO GETTERS AND SETTERS ---
}