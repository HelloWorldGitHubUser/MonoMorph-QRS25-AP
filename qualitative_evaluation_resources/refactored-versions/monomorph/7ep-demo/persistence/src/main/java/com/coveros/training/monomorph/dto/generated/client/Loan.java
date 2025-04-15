package com.coveros.training.monomorph.dto.generated.client;

// gRPC imports
import com.coveros.training.monomorph.dto.generated.proto.loan.*;
import com.coveros.training.monomorph.dto.generated.proto.book.BookDTO;
import com.coveros.training.monomorph.dto.generated.proto.borrower.BorrowerDTO;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.sql.Date;

/**
 * Auto-generated DTO gRPC client
 * {@link Loan} and {@link LoanDTO}.
 */
public class Loan {
    private LoanDTO dtoInstance;

    private Loan() {
        // Private default constructor for fromDTO method
    }

    public Loan(LoanDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;
    }

    /**
     * Constructor matching the original Loan class constructor
     */
    public Loan(Book book, Borrower borrower, long id, Date checkoutDate) {
        LoanDTO.Builder builder = LoanDTO.newBuilder()
                .setBook(book.toDTO())
                .setBorrower(borrower.toDTO())
                .setId(id)
                .setCheckoutDate(checkoutDate.getTime());

        this.dtoInstance = builder.build();
    }

    // mapping methods
    public LoanDTO toDTO() {
        return this.dtoInstance;
    }

    public static Loan fromDTO(LoanDTO dtoInstance) {
        Loan instance = new Loan();
        instance.dtoInstance = dtoInstance;
        return instance;
    }

    // implementation of the original class methods
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Loan rhs = (Loan) obj;
        return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .append(getBook(), rhs.getBook())
                .append(getBorrower(), rhs.getBorrower())
                .append(getCheckoutDate(), rhs.getCheckoutDate())
                .isEquals();
    }

    @Override
    public int hashCode() {
        // using the same hard-coded values as the original class
        return new HashCodeBuilder(5, 21)
                .append(getBook())
                .append(getBorrower())
                .append(getId())
                .append(getCheckoutDate())
                .toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static Loan createEmpty() {
        return new Loan(
                Book.createEmpty(),
                Borrower.createEmpty(),
                0,
                new Date(0)
        );
    }

    public boolean isEmpty() {
        return this.equals(Loan.createEmpty());
    }

    // --- START OF DTO GETTERS AND SETTERS ---
    public Date getCheckoutDate() {
        return new Date(dtoInstance.getCheckoutDate());
    }

    public Book getBook() {
        return Book.fromDTO(dtoInstance.getBook());
    }

    public Borrower getBorrower() {
        return Borrower.fromDTO(dtoInstance.getBorrower());
    }

    public long getId() {
        return dtoInstance.getId();
    }
    // --- END OF DTO GETTERS AND SETTERS ---
}
