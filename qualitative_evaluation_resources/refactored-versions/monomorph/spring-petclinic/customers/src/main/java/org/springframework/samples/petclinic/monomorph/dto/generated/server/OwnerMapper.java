

package org.springframework.samples.petclinic.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.owner.OwnerDTO;
import org.springframework.samples.petclinic.owner.Owner;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link Owner} and {@link OwnerDTO}.
 */
@Mapper(componentModel = "default") 
public interface OwnerMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    OwnerMapper INSTANCE = Mappers.getMapper(OwnerMapper.class);

    /**
     * Maps from {@link OwnerDTO} to {@link Owner}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link Owner} object.
     */
    Owner fromDTO(OwnerDTO dto);

    /**
     * Maps from {@link Owner} to {@link OwnerDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link OwnerDTO} object.
     */
    OwnerDTO toDTO(Owner domain);

}