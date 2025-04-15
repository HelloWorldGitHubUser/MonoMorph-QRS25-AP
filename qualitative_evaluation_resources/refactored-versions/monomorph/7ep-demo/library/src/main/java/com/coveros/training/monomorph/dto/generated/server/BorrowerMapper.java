

package com.coveros.training.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.coveros.training.monomorph.dto.generated.proto.borrower.BorrowerDTO;
import com.coveros.training.library.domainobjects.Borrower;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link Borrower} and {@link BorrowerDTO}.
 */
@Mapper(componentModel = "default") 
public interface BorrowerMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    BorrowerMapper INSTANCE = Mappers.getMapper(BorrowerMapper.class);

    /**
     * Maps from {@link BorrowerDTO} to {@link Borrower}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link Borrower} object.
     */
    Borrower fromDTO(BorrowerDTO dto);

    /**
     * Maps from {@link Borrower} to {@link BorrowerDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link BorrowerDTO} object.
     */
    BorrowerDTO toDTO(Borrower domain);

}