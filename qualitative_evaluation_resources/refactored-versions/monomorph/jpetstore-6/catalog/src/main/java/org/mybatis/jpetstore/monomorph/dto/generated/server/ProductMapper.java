

package org.mybatis.jpetstore.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.product.ProductDTO;
import org.mybatis.jpetstore.domain.Product;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link Product} and {@link ProductDTO}.
 */
@Mapper(componentModel = "default") 
public interface ProductMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    /**
     * Maps from {@link ProductDTO} to {@link Product}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link Product} object.
     */
    Product fromDTO(ProductDTO dto);

    /**
     * Maps from {@link Product} to {@link ProductDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link ProductDTO} object.
     */
    ProductDTO toDTO(Product domain);

}