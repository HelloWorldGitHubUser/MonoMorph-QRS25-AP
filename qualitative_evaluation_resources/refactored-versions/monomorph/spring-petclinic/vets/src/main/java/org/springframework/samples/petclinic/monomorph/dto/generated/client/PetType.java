package org.springframework.samples.petclinic.monomorph.dto.generated.client;

// gRPC imports
import org.springframework.samples.petclinic.monomorph.dto.generated.proto.pettype.*;

/**
 * Auto-generated DTO gRPC client
 * {@link PetType} and {@link PetTypeDTO}.
 */
public class PetType {
    private PetTypeDTO dtoInstance;

    /**
     * Private constructor for fromDTO method
     */
    private PetType() {
        this.dtoInstance = PetTypeDTO.newBuilder().build();
    }

    /**
     * Constructor with a DTO instance
     */
    private PetType(PetTypeDTO dtoInstance) {
        // dtoConstructor to initialize from a DTO instance
        this.dtoInstance = dtoInstance;
    }

    /**
     * Default constructor
     */
    public PetType() {
        this.dtoInstance = PetTypeDTO.newBuilder().build();
    }

    /**
     * Constructor with name
     */
    public PetType(String name) {
        this.dtoInstance = PetTypeDTO.newBuilder()
            .setName(name)
            .build();
    }

    /**
     * Constructor with id and name
     */
    public PetType(Long id, String name) {
        this.dtoInstance = PetTypeDTO.newBuilder()
            .setId(id)
            .setName(name)
            .build();
    }

    // mapping methods
    public PetTypeDTO toDTO() {
        return this.dtoInstance;
    }

    public static PetType fromDTO(PetTypeDTO dtoInstance) {
        PetType instance = new PetType(dtoInstance);
        return instance;
    }

    // implementation of the gRPC exposed methods

    // Implement all other getters and setters corresponding to the DTO fields
    // --- START OF DTO GETTERS AND SETTERS ---
    public Long getId() {
        return this.dtoInstance.getId();
    }

    public void setId(Long id) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setId(id)
            .build();
    }

    public String getName() {
        return this.dtoInstance.getName();
    }

    public void setName(String name) {
        this.dtoInstance = this.dtoInstance.toBuilder()
            .setName(name)
            .build();
    }
    // --- END OF DTO GETTERS AND SETTERS ---
}