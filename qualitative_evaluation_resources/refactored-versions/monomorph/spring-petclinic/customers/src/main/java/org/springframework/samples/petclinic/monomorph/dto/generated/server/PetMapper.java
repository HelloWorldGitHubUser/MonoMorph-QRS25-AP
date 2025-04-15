

package org.springframework.samples.petclinic.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pet.PetDTO;
import org.springframework.samples.petclinic.owner.Pet;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link Pet} and {@link PetDTO}.
 */
@Mapper(componentModel = "default") 
public interface PetMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);

    /**
     * Maps from {@link PetDTO} to {@link Pet}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link Pet} object.
     */
    Pet fromDTO(PetDTO dto);

    /**
     * Maps from {@link Pet} to {@link PetDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link PetDTO} object.
     */
    PetDTO toDTO(Pet domain);

}