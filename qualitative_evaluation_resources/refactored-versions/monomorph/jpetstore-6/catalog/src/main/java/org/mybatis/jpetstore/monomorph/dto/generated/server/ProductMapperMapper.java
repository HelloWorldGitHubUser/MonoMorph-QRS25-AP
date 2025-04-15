

package org.mybatis.jpetstore.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.productmapper.ProductMapperDTO;
import org.mybatis.jpetstore.mapper.ProductMapper;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link ProductMapper} and {@link ProductMapperDTO}.
 */
@Mapper(componentModel = "default") 
public interface ProductMapperMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    ProductMapperMapper INSTANCE = Mappers.getMapper(ProductMapperMapper.class);

    /**
     * Maps from {@link ProductMapperDTO} to {@link ProductMapper}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link ProductMapper} object.
     */
    ProductMapper fromDTO(ProductMapperDTO dto);

    /**
     * Maps from {@link ProductMapper} to {@link ProductMapperDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link ProductMapperDTO} object.
     */
    ProductMapperDTO toDTO(ProductMapper domain);

}