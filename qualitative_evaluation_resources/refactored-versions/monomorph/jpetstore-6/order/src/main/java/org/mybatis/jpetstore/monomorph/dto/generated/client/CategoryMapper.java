package org.mybatis.jpetstore.monomorph.dto.generated.client;

// gRPC imports
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.mybatis.jpetstore.domain.Category;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.categorymapper.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Auto-generated DTO gRPC client
 * {@link CategoryMapper} and {@link CategoryMapperDTO}.
 */
public class CategoryMapper implements org.mybatis.jpetstore.mapper.CategoryMapper {
    private static final String TARGET_SERVICE_ID = "category-mapper-service";
    private CategoryMapperDTO dtoInstance;
    private CategoryMapperServiceGrpc.CategoryMapperServiceBlockingStub blockingStub;

    // Default constructor
    public CategoryMapper() {
        this.dtoInstance = CategoryMapperDTO.getDefaultInstance();
        performRpcSetup();
    }

    // DTO constructor
    public CategoryMapper(CategoryMapperDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;
        performRpcSetup();
    }

    // Private method to set up the gRPC connection
    private void performRpcSetup() {
        // Get host and port from ServiceRegistry
        String host = ServiceRegistry.getHost(TARGET_SERVICE_ID);
        int port = ServiceRegistry.getPort(TARGET_SERVICE_ID);

        // Create a channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        // Create a blocking stub
        blockingStub = CategoryMapperServiceGrpc.newBlockingStub(channel);
    }

    // mapping methods
    public CategoryMapperDTO toDTO() {
        return this.dtoInstance;
    }

    public static CategoryMapper fromDTO(CategoryMapperDTO dtoInstance) {
        CategoryMapper instance = new CategoryMapper(dtoInstance);
        return instance;
    }

    // implementation of the gRPC exposed methods
    @Override
    public List<Category> getCategoryList() {
        GetCategoryListRequest request = GetCategoryListRequest.getDefaultInstance();
        GetCategoryListResponse response = blockingStub.getCategoryList(request);

        List<Category> categories = new ArrayList<>();
        for (org.mybatis.jpetstore.monomorph.dto.generated.proto.categorymapper.Category protoCategory : response.getCategoryListList()) {
            categories.add(convertProtoToCategory(protoCategory));
        }
        return categories;
    }

    @Override
    public Category getCategory(String categoryId) {
        GetCategoryRequest request = GetCategoryRequest.newBuilder()
                .setCategoryId(categoryId)
                .build();

        GetCategoryResponse response = blockingStub.getCategory(request);

        if (response.hasCategory()) {
            return convertProtoToCategory(response.getCategory());
        }
        return null;
    }

    // Helper method to convert proto Category to domain Category
    private Category convertProtoToCategory(org.mybatis.jpetstore.monomorph.dto.generated.proto.categorymapper.Category protoCategory) {
        Category category = new Category();
        category.setCategoryId(protoCategory.getCategoryId());
        category.setName(protoCategory.getName());
        category.setDescription(protoCategory.getDescription());
        return category;
    }

    // Implement all other getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---
    // Since CategoryMapperDTO is empty in our proto definition, there are no getters/setters needed here
    // --- END OF DTO GETTERS AND SETTERS ---
}
