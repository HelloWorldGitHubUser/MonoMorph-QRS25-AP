package org.springframework.samples.petclinic.monomorph.id.shared.server; 

import org.springframework.samples.petclinic.monomorph.id.shared.RefactoredObjectID;

/**
 * Interface for server-side components responsible for managing
 * actual object instances and mapping them to/from RefactoredObjectIDs.
 * This allows IDMapper to interact with server-side instance management
 * (like LeaseManager) in a standardized way.
 *
 * @param <T> The type of the actual object managed.
 */
public interface ServerObjectManager<T> {

    /**
     * Gets the RefactoredObjectID for a given managed instance.
     * Implementations will likely need to consult the LeaseManager or
     * have stored the ID during registration.
     *
     * @param instance The actual object instance.
     * @return The corresponding RefactoredObjectID.
     * @throws IllegalArgumentException if the instance is not managed or its ID cannot be found.
     */
    public RefactoredObjectID toID(T instance);

    /**
     * Retrieves the actual object instance corresponding to the given ID.
     * Implementations will typically delegate to LeaseManager.getInstance().
     *
     * @param id The RefactoredObjectID to look up.
     * @return The actual object instance.
     * @throws IllegalArgumentException if the ID is not found, invalid for this manager,
     *                                  or the object type doesn't match.
     */
    public T fromID(RefactoredObjectID id);

    /**
     * Gets the Class ID (from ClassIdRegistry) of the objects managed by this component.
     * Used for registration with IDMapper.
     * @return The managed class ID string.
     */
    public String getManagedClassId();

    /**
     * Gets the Service ID associated with the objects managed by this component.
     * Useful for verifying IDs and potentially for routing.
     * @return The service ID string.
     */
    public String getServiceId();
}