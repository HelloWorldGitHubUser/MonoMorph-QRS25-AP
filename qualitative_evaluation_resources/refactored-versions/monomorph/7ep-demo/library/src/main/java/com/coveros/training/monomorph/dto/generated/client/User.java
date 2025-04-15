package com.coveros.training.monomorph.dto.generated.client;

// gRPC imports
import com.coveros.training.monomorph.dto.generated.proto.user.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Auto-generated DTO gRPC client
 * {@link User} and {@link UserDTO}.
 */
public class User {
    private UserDTO dtoInstance;

    // Private constructor for fromDTO method
    private User() {
        // Empty constructor for internal use
    }

    // Constructor matching the original User class
    public User(String name, long id) {
        this.dtoInstance = UserDTO.newBuilder()
                .setName(name)
                .setId(id)
                .build();
    }

    // Constructor with DTO instance
    public User(UserDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
    }

    // Mapping methods
    public UserDTO toDTO() {
        return this.dtoInstance;
    }

    public static User fromDTO(UserDTO dtoInstance) {
        User instance = new User();
        instance.dtoInstance = dtoInstance;
        return instance;
    }

    // Implementation of the original class methods
    public static User createEmpty() {
        return new User("", 0);
    }

    public boolean isEmpty() {
        return this.equals(User.createEmpty());
    }

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
        User rhs = (User) obj;
        return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .append(getName(), rhs.getName())
                .isEquals();
    }

    @Override
    public int hashCode() {
        // Using the same hard-coded values as the original class
        return new HashCodeBuilder(19, 3)
                .append(getName())
                .append(getId())
                .toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    // --- START OF DTO GETTERS AND SETTERS ---
    public String getName() {
        return dtoInstance.getName();
    }

    public long getId() {
        return dtoInstance.getId();
    }
    // --- END OF DTO GETTERS AND SETTERS ---
}
