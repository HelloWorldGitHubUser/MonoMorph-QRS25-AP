

package com.coveros.training.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.coveros.training.monomorph.dto.generated.proto.user.UserDTO;
import com.coveros.training.authentication.domainobjects.User;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link User} and {@link UserDTO}.
 */
@Mapper(componentModel = "default") 
public interface UserMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    /**
     * Maps from {@link UserDTO} to {@link User}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link User} object.
     */
    User fromDTO(UserDTO dto);

    /**
     * Maps from {@link User} to {@link UserDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link UserDTO} object.
     */
    UserDTO toDTO(User domain);

}