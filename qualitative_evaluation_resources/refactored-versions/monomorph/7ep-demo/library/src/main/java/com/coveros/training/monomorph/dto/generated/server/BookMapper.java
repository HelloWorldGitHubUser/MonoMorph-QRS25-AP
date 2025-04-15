

package com.coveros.training.monomorph.dto.generated.server;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.coveros.training.monomorph.dto.generated.proto.book.BookDTO;
import com.coveros.training.library.domainobjects.Book;

/**
 * Auto-generated MapStruct mapper for converting between
 * {@link Book} and {@link BookDTO}.
 */
@Mapper(componentModel = "default") 
public interface BookMapper {
    /**
     * Singleton instance of this mapper. Use this to access mapping methods.
     */
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    /**
     * Maps from {@link BookDTO} to {@link Book}.
     *
     * @param dto The source DTO object.
     * @return The mapped {@link Book} object.
     */
    Book fromDTO(BookDTO dto);

    /**
     * Maps from {@link Book} to {@link BookDTO}.
     *
     * @param original The source of the Original object.
     * @return The mapped {@link BookDTO} object.
     */
    BookDTO toDTO(Book domain);

}