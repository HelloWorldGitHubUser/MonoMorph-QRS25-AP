

package org.mybatis.jpetstore.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.account.AccountDTO;
import org.mybatis.jpetstore.domain.Account;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link Account} and {@link AccountDTO}.
 */
@Mapper(componentModel = "default") 
public interface AccountMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    /**
     * Maps from {@link AccountDTO} to {@link Account}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link Account} object.
     */
    Account fromDTO(AccountDTO dto);

    /**
     * Maps from {@link Account} to {@link AccountDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link AccountDTO} object.
     */
    AccountDTO toDTO(Account domain);

}