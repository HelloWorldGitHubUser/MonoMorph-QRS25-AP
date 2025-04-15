

package org.mybatis.jpetstore.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.catalogactionbean.CatalogActionBeanDTO;
import org.mybatis.jpetstore.web.actions.CatalogActionBean;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link CatalogActionBean} and {@link CatalogActionBeanDTO}.
 */
@Mapper(componentModel = "default") 
public interface CatalogActionBeanMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    CatalogActionBeanMapper INSTANCE = Mappers.getMapper(CatalogActionBeanMapper.class);

    /**
     * Maps from {@link CatalogActionBeanDTO} to {@link CatalogActionBean}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link CatalogActionBean} object.
     */
    CatalogActionBean fromDTO(CatalogActionBeanDTO dto);

    /**
     * Maps from {@link CatalogActionBean} to {@link CatalogActionBeanDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link CatalogActionBeanDTO} object.
     */
    CatalogActionBeanDTO toDTO(CatalogActionBean domain);

}