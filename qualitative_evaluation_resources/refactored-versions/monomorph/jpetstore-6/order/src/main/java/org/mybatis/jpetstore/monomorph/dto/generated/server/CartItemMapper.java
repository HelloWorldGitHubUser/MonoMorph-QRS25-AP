

package org.mybatis.jpetstore.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mybatis.jpetstore.monomorph.dto.generated.proto.cartitem.CartItemDTO;
import org.mybatis.jpetstore.domain.CartItem;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link CartItem} and {@link CartItemDTO}.
 */
@Mapper(componentModel = "default") 
public interface CartItemMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    CartItemMapper INSTANCE = Mappers.getMapper(CartItemMapper.class);

    /**
     * Maps from {@link CartItemDTO} to {@link CartItem}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link CartItem} object.
     */
    CartItem fromDTO(CartItemDTO dto);

    /**
     * Maps from {@link CartItem} to {@link CartItemDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link CartItemDTO} object.
     */
    CartItemDTO toDTO(CartItem domain);

}