

package org.mybatis.jpetstore.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.category.CategoryDTO;
import org.mybatis.jpetstore.domain.Category;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link Category} and {@link CategoryDTO}.
 */
@Mapper(componentModel = "default") 
public interface CategoryMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    /**
     * Maps from {@link CategoryDTO} to {@link Category}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link Category} object.
     */
    Category fromDTO(CategoryDTO dto);

    /**
     * Maps from {@link Category} to {@link CategoryDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link CategoryDTO} object.
     */
    CategoryDTO toDTO(Category domain);

}