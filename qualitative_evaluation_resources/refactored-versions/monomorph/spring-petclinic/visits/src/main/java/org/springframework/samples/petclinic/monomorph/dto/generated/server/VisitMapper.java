

package org.springframework.samples.petclinic.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.visit.VisitDTO;
import org.springframework.samples.petclinic.owner.Visit;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link Visit} and {@link VisitDTO}.
 */
@Mapper(componentModel = "default") 
public interface VisitMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    VisitMapper INSTANCE = Mappers.getMapper(VisitMapper.class);

    /**
     * Maps from {@link VisitDTO} to {@link Visit}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link Visit} object.
     */
    Visit fromDTO(VisitDTO dto);

    /**
     * Maps from {@link Visit} to {@link VisitDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link VisitDTO} object.
     */
    VisitDTO toDTO(Visit domain);

}