package org.springframework.samples.petclinic.monomorph.dto.generated.client;

// gRPC imports
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.visit.*;

import java.time.LocalDate;

/**
 * Auto-generated DTO gRPC client
 * {@link Visit} and {@link VisitDTO}.
 */
public class Visit {
    private VisitDTO dtoInstance;

    /**
     * Private constructor for DTO conversion
     */
    private Visit(VisitDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;
    }

    /**
     * Creates a new instance of Visit for the current date
     * (Matches original class constructor)
     */
    public Visit() {
        VisitDTO.Builder builder = VisitDTO.newBuilder();
        // Set default date to current date (matching original behavior)
        builder.setDate(LocalDate.now().toString());
        this.dtoInstance = builder.build();
    }

    // mapping methods
    public VisitDTO toDTO() {
        return this.dtoInstance;
    }

    public static Visit fromDTO(VisitDTO dtoInstance) {
        return new Visit(dtoInstance);
    }

    // implementation of the gRPC exposed methods

    // --- START OF DTO GETTERS AND SETTERS ---
    public LocalDate getDate() {
        if (this.dtoInstance.getDate().isEmpty()) {
            return null;
        }
        return LocalDate.parse(this.dtoInstance.getDate());
    }

    public void setDate(LocalDate date) {
        VisitDTO.Builder builder = this.dtoInstance.toBuilder();
        if (date != null) {
            builder.setDate(date.toString());
        } else {
            builder.clearDate();
        }
        this.dtoInstance = builder.build();
    }

    public String getDescription() {
        return this.dtoInstance.getDescription();
    }

    public void setDescription(String description) {
        VisitDTO.Builder builder = this.dtoInstance.toBuilder();
        builder.setDescription(description);
        this.dtoInstance = builder.build();
    }

    public Long getId() {
        if (this.dtoInstance.getId() == 0) {
            return null;
        }
        return this.dtoInstance.getId();
    }

    public void setId(Long id) {
        VisitDTO.Builder builder = this.dtoInstance.toBuilder();
        if (id != null) {
            builder.setId(id);
        } else {
            builder.setId(0);
        }
        this.dtoInstance = builder.build();
    }
    // --- END OF DTO GETTERS AND SETTERS ---
}
