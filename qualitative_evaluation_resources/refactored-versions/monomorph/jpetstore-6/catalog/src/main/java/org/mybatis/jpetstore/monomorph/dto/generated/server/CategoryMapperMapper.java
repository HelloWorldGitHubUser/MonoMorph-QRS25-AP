

package org.mybatis.jpetstore.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.categorymapper.CategoryMapperDTO;
import org.mybatis.jpetstore.mapper.CategoryMapper;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link CategoryMapper} and {@link CategoryMapperDTO}.
 */
@Mapper(componentModel = "default") 
public interface CategoryMapperMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    CategoryMapperMapper INSTANCE = Mappers.getMapper(CategoryMapperMapper.class);

    /**
     * Maps from {@link CategoryMapperDTO} to {@link CategoryMapper}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link CategoryMapper} object.
     */
    CategoryMapper fromDTO(CategoryMapperDTO dto);

    /**
     * Maps from {@link CategoryMapper} to {@link CategoryMapperDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link CategoryMapperDTO} object.
     */
    CategoryMapperDTO toDTO(CategoryMapper domain);

}