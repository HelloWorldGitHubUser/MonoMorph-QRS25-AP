package org.mybatis.jpetstore.monomorph.dto.generated.server;

import io.grpc.stub.StreamObserver;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.catalogservice.*;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.product.ProductDTO;
import org.mybatis.jpetstore.service.CatalogService;
import org.mybatis.jpetstore.domain.Product;
import org.mybatis.jpetstore.mapper.CategoryMapper;
import org.mybatis.jpetstore.mapper.ItemMapper;
import org.mybatis.jpetstore.mapper.ProductMapper;
import org.mybatis.jpetstore.monomorph.id.generated.helpers.IDMapper;
import org.mybatis.jpetstore.monomorph.dto.generated.server.ProductMapper as ProductDTOMapper;
import org.mybatis.jpetstore.monomorph.dto.generated.server.CategoryMapperMapper;
import org.mybatis.jpetstore.monomorph.dto.generated.server.ProductMapperMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * gRPC Service implementation for CatalogService.
 * - Handles gRPC requests for CatalogService API.
 * - Interacts with Mapper for switching between DTO and CatalogService instances.
 */
public class CatalogServiceImpl extends CatalogServiceServiceGrpc.CatalogServiceServiceImplBase {

    /**
     * Implementation of the getProductListByCategory gRPC method.
     * Retrieves a list of products by category ID.
     *
     * @param request The request containing the category ID
     * @param responseObserver The observer to send the response back to the client
     */
    @Override
    public void getProductListByCategory(GetProductListByCategoryRequest request,
                                        StreamObserver<GetProductListByCategoryResponse> responseObserver) {
        try {
            // Extract the DTO and categoryId from the request
            CatalogServiceDTO dto = request.getDto();
            String categoryId = request.getCategoryId();

            // Map the DTO to the original domain object
            CatalogService catalogService = CatalogServiceMapper.INSTANCE.fromDTO(dto);

            // Call the business logic method
            List<Product> products = catalogService.getProductListByCategory(categoryId);

            // Convert the domain objects to DTOs
            List<ProductDTO> productDTOs = new ArrayList<>();
            for (Product product : products) {
                productDTOs.add(ProductDTOMapper.INSTANCE.toDTO(product));
            }

            // Build and send the response
            GetProductListByCategoryResponse response = GetProductListByCategoryResponse.newBuilder()
                .addAllProducts(productDTOs)
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    // You can add additional helper methods here if needed for more complex transformations
}