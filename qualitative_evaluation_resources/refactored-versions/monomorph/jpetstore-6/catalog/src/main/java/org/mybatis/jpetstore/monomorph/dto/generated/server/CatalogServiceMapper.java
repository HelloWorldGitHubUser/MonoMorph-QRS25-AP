

package org.mybatis.jpetstore.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.catalogservice.CatalogServiceDTO;
import org.mybatis.jpetstore.service.CatalogService;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link CatalogService} and {@link CatalogServiceDTO}.
 */
@Mapper(componentModel = "default") 
public interface CatalogServiceMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    CatalogServiceMapper INSTANCE = Mappers.getMapper(CatalogServiceMapper.class);

    /**
     * Maps from {@link CatalogServiceDTO} to {@link CatalogService}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link CatalogService} object.
     */
    CatalogService fromDTO(CatalogServiceDTO dto);

    /**
     * Maps from {@link CatalogService} to {@link CatalogServiceDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link CatalogServiceDTO} object.
     */
    CatalogServiceDTO toDTO(CatalogService domain);

}