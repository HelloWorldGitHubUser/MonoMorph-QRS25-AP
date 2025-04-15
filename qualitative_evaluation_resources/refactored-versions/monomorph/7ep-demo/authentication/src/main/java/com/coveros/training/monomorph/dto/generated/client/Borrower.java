package com.coveros.training.monomorph.dto.generated.client;

// gRPC imports
import com.coveros.training.monomorph.dto.generated.proto.borrower.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.checkerframework.checker.nullness.qual.Nullable;
import com.coveros.training.helpers.StringUtils;

/**
 * Auto-generated DTO gRPC client
 * {@link Borrower} and {@link BorrowerDTO}.
 */
public class Borrower {
    private BorrowerDTO dtoInstance;

    /**
     * Private constructor used by the fromDTO method.
     */
    private Borrower() {
        // Empty constructor for use by fromDTO
    }

    /**
     * Constructor matching the original Borrower class API.
     *
     * @param id the identifier for this borrower in the database
     * @param name the name of the borrower
     */
    public Borrower(long id, String name) {
        this.dtoInstance = BorrowerDTO.newBuilder()
                .setId(id)
                .setName(name)
                .build();
    }

    /**
     * Constructor that takes a DTO instance.
     *
     * @param dtoInstance the DTO instance to wrap
     */
    public Borrower(BorrowerDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
    }

    // mapping methods
    /**
     * Converts this client object to a DTO object.
     *
     * @return the DTO representation of this object
     */
    public BorrowerDTO toDTO() {
        return this.dtoInstance;
    }

    /**
     * Creates a client object from a DTO object.
     *
     * @param dtoInstance the DTO object to convert
     * @return a new client object
     */
    public static Borrower fromDTO(BorrowerDTO dtoInstance) {
        Borrower instance = new Borrower();
        instance.dtoInstance = dtoInstance;
        return instance;
    }

    /**
     * Creates an empty borrower instance.
     *
     * @return an empty borrower
     */
    public static Borrower createEmpty() {
        return new Borrower(0, "");
    }

    /**
     * Checks if this borrower is empty.
     *
     * @return true if this borrower is empty, false otherwise
     */
    public boolean isEmpty() {
        return this.equals(Borrower.createEmpty());
    }

    /**
     * Returns a string representation for output.
     *
     * @return a formatted string of this borrower's data
     */
    public final String toOutputString() {
        return String.format("{"Name": "%s", "Id": "%s""},
            StringUtils.escapeForJson(dtoInstance.getName()), dtoInstance.getId());
    }

    @Override
    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Borrower rhs = ((Borrower) (obj));
        return new EqualsBuilder()
                .append(dtoInstance.getId(), rhs.dtoInstance.getId())
                .append(dtoInstance.getName(), rhs.dtoInstance.getName())
                .isEquals();
    }

    @Override
    public final int hashCode() {
        // Same values as original class for consistency
        return new HashCodeBuilder(17, 37)
                .append(dtoInstance.getId())
                .append(dtoInstance.getName())
                .toHashCode();
    }

    @Override
    public final String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    // --- START OF DTO GETTERS AND SETTERS ---
    /**
     * Gets the borrower's ID.
     *
     * @return the borrower's ID
     */
    public long getId() {
        return dtoInstance.getId();
    }

    /**
     * Gets the borrower's name.
     *
     * @return the borrower's name
     */
    public String getName() {
        return dtoInstance.getName();
    }
    // --- END OF DTO GETTERS AND SETTERS ---
}
