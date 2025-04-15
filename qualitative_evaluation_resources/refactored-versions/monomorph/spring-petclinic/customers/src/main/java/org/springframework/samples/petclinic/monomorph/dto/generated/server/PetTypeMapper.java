

package org.springframework.samples.petclinic.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pettype.PetTypeDTO;
import org.springframework.samples.petclinic.owner.PetType;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link PetType} and {@link PetTypeDTO}.
 */
@Mapper(componentModel = "default") 
public interface PetTypeMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    PetTypeMapper INSTANCE = Mappers.getMapper(PetTypeMapper.class);

    /**
     * Maps from {@link PetTypeDTO} to {@link PetType}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link PetType} object.
     */
    PetType fromDTO(PetTypeDTO dto);

    /**
     * Maps from {@link PetType} to {@link PetTypeDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link PetTypeDTO} object.
     */
    PetTypeDTO toDTO(PetType domain);

}