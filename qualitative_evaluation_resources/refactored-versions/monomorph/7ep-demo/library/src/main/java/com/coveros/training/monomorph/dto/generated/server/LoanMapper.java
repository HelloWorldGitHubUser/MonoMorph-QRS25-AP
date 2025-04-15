

package com.coveros.training.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.coveros.training.monomorph.dto.generated.proto.loan.LoanDTO;
import com.coveros.training.library.domainobjects.Loan;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link Loan} and {@link LoanDTO}.
 */
@Mapper(componentModel = "default") 
public interface LoanMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    LoanMapper INSTANCE = Mappers.getMapper(LoanMapper.class);

    /**
     * Maps from {@link LoanDTO} to {@link Loan}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link Loan} object.
     */
    Loan fromDTO(LoanDTO dto);

    /**
     * Maps from {@link Loan} to {@link LoanDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link LoanDTO} object.
     */
    LoanDTO toDTO(Loan domain);

}