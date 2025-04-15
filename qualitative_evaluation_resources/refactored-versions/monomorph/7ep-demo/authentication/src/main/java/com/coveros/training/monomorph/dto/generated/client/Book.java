package com.coveros.training.monomorph.dto.generated.client;

// gRPC imports
import com.coveros.training.monomorph.dto.generated.proto.book.*;
import com.coveros.training.monomorph.ServiceRegistry;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import com.coveros.training.helpers.StringUtils;

/**
 * Auto-generated DTO gRPC client
 * {@link Book} and {@link BookDTO}.
 */
public class Book {
    private static final String TARGET_SERVICE_ID = "book-service";
    private static BookServiceGrpc.BookServiceBlockingStub stub;

    private BookDTO dtoInstance;

    // Private constructor for fromDTO method
    private Book(BookDTO dtoInstance) {
        this.dtoInstance = dtoInstance;
    }

    // Constructor matching the original class
    public Book(long id, java.lang.String title) {
        this.dtoInstance = BookDTO.newBuilder()
                .setId(id)
                .setTitle(title)
                .build();
    }

    // mapping methods
    public BookDTO toDTO() {
        return this.dtoInstance;
    }

    public static Book fromDTO(BookDTO dtoInstance) {
        return new Book(dtoInstance);
    }

    // Implementation of original class methods
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Book rhs = ((Book) (obj));
        return new EqualsBuilder().append(getId(), rhs.getId())
                                 .append(getTitle(), rhs.getTitle())
                                 .isEquals();
    }

    public final int hashCode() {
        // Use the same prime numbers as the original class
        return new HashCodeBuilder(13, 33).append(getId())
                                         .append(getTitle())
                                         .toHashCode();
    }

    public final java.lang.String toOutputString() {
        return java.lang.String.format("{"Title": "%s", "Id": "%s"}",
                StringUtils.escapeForJson(getTitle()), getId());
    }

    public final java.lang.String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static Book createEmpty() {
        return new Book(0, "");
    }

    public boolean isEmpty() {
        return this.equals(Book.createEmpty());
    }

    // --- START OF DTO GETTERS AND SETTERS ---
    public String getTitle() {
        return dtoInstance.getTitle();
    }

    public long getId() {
        return dtoInstance.getId();
    }
    // --- END OF DTO GETTERS AND SETTERS ---

    // gRPC stub setup
    private static synchronized void performRpcSetup() {
        if (stub == null) {
            String serviceHost = ServiceRegistry.getServiceHost(TARGET_SERVICE_ID);
            int servicePort = ServiceRegistry.getServicePort(TARGET_SERVICE_ID);

            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress(serviceHost, servicePort)
                    .usePlaintext()
                    .build();

            stub = BookServiceGrpc.newBlockingStub(channel);
        }
    }
}
