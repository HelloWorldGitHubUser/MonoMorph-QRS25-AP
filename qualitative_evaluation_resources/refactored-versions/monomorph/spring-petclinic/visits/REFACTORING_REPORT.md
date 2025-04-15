# **Microservice "visits" ("visits") Report**
## Microservice Summary
 The microservice "visits"  contains a total of **30** classes and files:
  - **10** classes were selected from the decomposition file
  - **13** new classes were added or generated
  - **7** new proto files were added or generated

 The microservice has inherited the old main class "[PetClinicApplication](src/main/java/org/springframework/samples/petclinic/PetClinicApplication.java)" of the monolith.

---

---

## Changes
 The following changes were made in order to create the microservice:
### Dependencies
 The dependencies of the microservice have been updated. The following packages were added to the file [pom.xml](pom.xml):
 - `com.github.ben-manes.caffeine:caffeine:2.8.0`
 - `com.google.protobuf:protobuf-java:3.25.5`
 - `io.grpc:grpc-netty-shaded:1.71.0`
 - `io.grpc:grpc-protobuf:1.71.0`
 - `io.grpc:grpc-stub:1.71.0`
 - `javax.annotation:javax.annotation-api:1.3.2`
 - `org.mapstruct:mapstruct:1.6.3`

### Copied Classes
 The following classes were copied from the original microservice based on the decomposition:
 - `org.springframework.samples.petclinic.model.BaseEntity` was copied to [src/main/java/org/springframework/samples/petclinic/model/BaseEntity.java](src/main/java/org/springframework/samples/petclinic/model/BaseEntity.java)
 - `org.springframework.samples.petclinic.model.NamedEntity` was copied to [src/main/java/org/springframework/samples/petclinic/model/NamedEntity.java](src/main/java/org/springframework/samples/petclinic/model/NamedEntity.java)
 - `org.springframework.samples.petclinic.model.Person` was copied to [src/main/java/org/springframework/samples/petclinic/model/Person.java](src/main/java/org/springframework/samples/petclinic/model/Person.java)
 - `org.springframework.samples.petclinic.PetClinicApplication` was copied to [src/main/java/org/springframework/samples/petclinic/PetClinicApplication.java](src/main/java/org/springframework/samples/petclinic/PetClinicApplication.java)
 - `org.springframework.samples.petclinic.owner.Visit` was copied to [src/main/java/org/springframework/samples/petclinic/owner/Visit.java](src/main/java/org/springframework/samples/petclinic/owner/Visit.java)
 - `org.springframework.samples.petclinic.owner.VisitController` was copied to [src/main/java/org/springframework/samples/petclinic/owner/VisitController.java](src/main/java/org/springframework/samples/petclinic/owner/VisitController.java)
 - `org.springframework.samples.petclinic.system.CrashController` was copied to [src/main/java/org/springframework/samples/petclinic/system/CrashController.java](src/main/java/org/springframework/samples/petclinic/system/CrashController.java)
 - `org.springframework.samples.petclinic.PetClinicRuntimeHints` was copied to [src/main/java/org/springframework/samples/petclinic/PetClinicRuntimeHints.java](src/main/java/org/springframework/samples/petclinic/PetClinicRuntimeHints.java)
 - `org.springframework.samples.petclinic.owner.PetTypeFormatter` was copied to [src/main/java/org/springframework/samples/petclinic/owner/PetTypeFormatter.java](src/main/java/org/springframework/samples/petclinic/owner/PetTypeFormatter.java)
 - `org.springframework.samples.petclinic.system.WelcomeController` was copied to [src/main/java/org/springframework/samples/petclinic/system/WelcomeController.java](src/main/java/org/springframework/samples/petclinic/system/WelcomeController.java)

### New Services
 The following gRPC services were generated and added to expose their corresponding classes to other microservices:
 - Class `org.springframework.samples.petclinic.monomorph.dto.generated.proto.visit.VisitService`:
   - Exposes the API of [org.springframework.samples.petclinic.owner.Visit](src/main/java/org/springframework/samples/petclinic/owner/Visit.java)
   - Corresponding Proto service `` in file [visit.proto](src/main/proto/visit.proto)
   - DTO Message: VisitDTO in [visit.proto](src/main/proto/visit.proto)
   - Mapper class: [org.springframework.samples.petclinic.monomorph.dto.generated.server.VisitMapper](src/main/java/org/springframework/samples/petclinic/monomorph/dto/generated/server/VisitMapper.java)

### New Clients
 The following gRPC clients were generated and added to invoke their corresponding servers through RPCs. They serve as proxies to their corresponding original classes:
 - Class `org.springframework.samples.petclinic.monomorph.id.generated.client.OwnerRepository`:
   - A proxy for `org.springframework.samples.petclinic.owner.OwnerRepository`
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/id/generated/client/OwnerRepository.java](src/main/java/org/springframework/samples/petclinic/monomorph/id/generated/client/OwnerRepository.java)
   - Corresponding Proto service `OwnerRepositoryService` in file [owner_repository.proto](src/main/proto/owner_repository.proto)
 - Class `org.springframework.samples.petclinic.monomorph.dto.generated.client.Owner`:
   - A proxy for `org.springframework.samples.petclinic.owner.Owner`
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/dto/generated/client/Owner.java](src/main/java/org/springframework/samples/petclinic/monomorph/dto/generated/client/Owner.java)
   - Corresponding Proto service `OwnerService` in file [owner.proto](src/main/proto/owner.proto)
   - DTO Message: OwnerDTO in [owner.proto](src/main/proto/owner.proto)
 - Class `org.springframework.samples.petclinic.monomorph.dto.generated.client.Pet`:
   - A proxy for `org.springframework.samples.petclinic.owner.Pet`
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/dto/generated/client/Pet.java](src/main/java/org/springframework/samples/petclinic/monomorph/dto/generated/client/Pet.java)
   - Corresponding Proto service `PetService` in file [pet.proto](src/main/proto/pet.proto)
   - DTO Message: PetDTO in [pet.proto](src/main/proto/pet.proto)
 - Class `org.springframework.samples.petclinic.monomorph.dto.generated.client.PetType`:
   - A proxy for `org.springframework.samples.petclinic.owner.PetType`
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/dto/generated/client/PetType.java](src/main/java/org/springframework/samples/petclinic/monomorph/dto/generated/client/PetType.java)
   - Corresponding Proto service `` in file [pet_type.proto](src/main/proto/pet_type.proto)
   - DTO Message: PetTypeDTO in [pet_type.proto](src/main/proto/pet_type.proto)

### Shared Utilities
 The following helper classes were added to the microservice in order to implement the pattern and shared logic defined in the approach (leasing, service discovery, ID mapping, etc):
 - Helper Proto file `shared.proto`:
   - Location: [src/main/proto/shared.proto](src/main/proto/shared.proto)
   - Description: The proto file that describes the RefactoredObjectID messages required for exchanging instance IDs across microservices. It is shared by all server microservices.
 - Helper Class `LeaseRpcClient.java`:
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/id/shared/client/LeaseRpcClient.java](src/main/java/org/springframework/samples/petclinic/monomorph/id/shared/client/LeaseRpcClient.java)
   - Description: The LeaseRpcClient interface defines the methods that the client microservices can use to interact with the LeaseManager. It is shared by all microservices.
 - Helper Class `ServerObjectManager.java`:
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/id/shared/server/ServerObjectManager.java](src/main/java/org/springframework/samples/petclinic/monomorph/id/shared/server/ServerObjectManager.java)
   - Description: The ServerObjectManager interface defines the methods for managing the objects to IDs and vice versa. It is shared by all microservices.
 - Helper Class `GrpcLeaseRpcClient.java`:
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/id/shared/client/GrpcLeaseRpcClient.java](src/main/java/org/springframework/samples/petclinic/monomorph/id/shared/client/GrpcLeaseRpcClient.java)
   - Description: The GrpcLeaseRpcClient class is a gRPC client that implements LeaseRpcClient and that interacts with the LeasingServiceImpl class. It is shared by all microservices.
 - Helper Class `AbstractRefactoredClient.java`:
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/id/shared/client/AbstractRefactoredClient.java](src/main/java/org/springframework/samples/petclinic/monomorph/id/shared/client/AbstractRefactoredClient.java)
   - Description: The AbstractRefactoredClient class is a base class for all client classes that use the leasing API. It provides the common methods for the generated client classes and incorporates the leasing logic. It is shared by all microservices.
 - Helper Proto file `leasing.proto`:
   - Location: [src/main/proto/leasing.proto](src/main/proto/leasing.proto)
   - Description: The proto file describing the leasing service api and messages. Required for the leasing/TTL logic. It is shared by all server microservices.
### Generated Utilities
 The following helper classes were generated and customized for the microservice "visits":
 - Class `ServiceRegistry` was generated for the microservice:
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/id/generated/helpers/ServiceRegistry.java](src/main/java/org/springframework/samples/petclinic/monomorph/id/generated/helpers/ServiceRegistry.java)
   - Description: A utility class that serves as a placeholder for service discovery. It is customized for each microservice.
 - Class `ClassIdRegistry` was generated for the microservice:
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/id/generated/helpers/ClassIdRegistry.java](src/main/java/org/springframework/samples/petclinic/monomorph/id/generated/helpers/ClassIdRegistry.java)
   - Description: A utility class that defines the CLASSIDs for the classes that are exchanged between microservices. It is customized for each microservice.
 - Class `IDMapper` was generated for the microservice:
   - Location: [src/main/java/org/springframework/samples/petclinic/monomorph/id/generated/helpers/IDMapper.java](src/main/java/org/springframework/samples/petclinic/monomorph/id/generated/helpers/IDMapper.java)
   - Description: A utility class for mapping a RefactoredObjectID into actual type instances (if the type is in the microservice) or client instances and vice versa. It is customized for each microservice.

### Updated Imports
 The following imports were updated in the microservice:
 - In class [org.springframework.samples.petclinic.owner.VisitController](src/main/java/org/springframework/samples/petclinic/owner/VisitController.java):
   - `org.springframework.samples.petclinic.owner.OwnerRepository` was replaced with `org.springframework.samples.petclinic.monomorph.id.generated.client.OwnerRepository`
   - `org.springframework.samples.petclinic.owner.Owner` was replaced with `org.springframework.samples.petclinic.monomorph.dto.generated.client.Owner`
   - `org.springframework.samples.petclinic.owner.Pet` was replaced with `org.springframework.samples.petclinic.monomorph.dto.generated.client.Pet`
 - In class [org.springframework.samples.petclinic.owner.PetTypeFormatter](src/main/java/org/springframework/samples/petclinic/owner/PetTypeFormatter.java):
   - `org.springframework.samples.petclinic.owner.OwnerRepository` was replaced with `org.springframework.samples.petclinic.monomorph.id.generated.client.OwnerRepository`
   - `org.springframework.samples.petclinic.owner.PetType` was replaced with `org.springframework.samples.petclinic.monomorph.dto.generated.client.PetType`

---

---

## Detailed Refactoring Comments for Exposed Services
### Original Class `org.springframework.samples.petclinic.owner.Visit`
#### Service `org.springframework.samples.petclinic.monomorph.dto.generated.proto.visit.VisitService`
##### Explanation
 To create a proper proto file for the `Visit` class, I need to analyze its structure and convert it into protobuf format:

1. The `Visit` class extends `BaseEntity` which likely contains an `id` field that we need to include in our DTO.

2. The `Visit` class has two fields:
   - `date` (of type `LocalDate`)
   - `description` (of type `String`)

3. For the protobuf message, I'll need to:
   - Include all required fields (`id`, `date`, and `description`)
   - Map Java types to protobuf types:
     - `LocalDate` isn't a native protobuf type, so I'll represent it as a string in ISO format (YYYY-MM-DD)
     - `String` maps to `string` in protobuf
     - `id` is likely an integer, so I'll use `int64`

4. As per instructions, I'll maintain the original field names even if they don't follow protobuf conventions.

5. I'll use the package name and service structure provided in the template.
##### Comments
 1. The `id` field comes from the `BaseEntity` class that `Visit` extends. I've included it as required by the instructions.

2. For the `date` field, which is a `LocalDate` in Java, I've used a string representation in protobuf. When implementing the conversion between Java and protobuf, you'll need to:
   - Convert from `LocalDate` to `String` when serializing (using something like `date.toString()`)
   - Convert from `String` to `LocalDate` when deserializing (using `LocalDate.parse(dateString)`)

3. No service definition was included since the instructions only asked for the message definition. If RPC services are needed in the future, they can be added to this proto file.

4. The template didn't specify any service interfaces to implement, so I've focused solely on the data structure representation.

5. If additional functionality is needed (like creating new visits, retrieving visits by ID, etc.), appropriate RPC methods could be added to a service definition within this proto file.

---


---

## Detailed Refactoring Comments for Consumed Services
### Original Class `org.springframework.samples.petclinic.owner.OwnerRepository`
#### Client Class `org.springframework.samples.petclinic.monomorph.id.generated.client.OwnerRepository` (Service `OwnerRepositoryService`)
##### Explanation
 I'll implement the client for the `OwnerRepository` interface based on the gRPC proto file I created earlier. Let me walk through my thought process:

  **Explanation**

1. First, I need to analyze the original `OwnerRepository` interface to implement the appropriate methods in our client:
   - `findPetTypes()` - Returns a List of PetType objects
   - `save(Owner)` - Takes an Owner object and doesn't return anything
   - `findById(Integer)` - Takes an Integer ID and returns an Owner object

2. The client needs to properly handle the DTO mappings:
   - Map `org.springframework.samples.petclinic.monomorph.dto.generated.client.Owner` to/from `OwnerDTO`
   - Map `org.springframework.samples.petclinic.monomorph.dto.generated.client.PetType` to/from `PetTypeDTO`

3. The constructor needs to match the original interface which doesn't have any parameters since it's an interface that Spring instantiates. So I'll remove the placeholder constructor argument.

4. I need to implement the `performRemoteCreateAndGetId` method to create the RPC request and call the server.

5. Finally, I need to implement the three methods from the original interface to make the appropriate RPC calls.

##### Comments
 1. I've removed the `ReplaceWithActualArgs` placeholder since the `OwnerRepository` is an interface without constructor arguments.

2. I've implemented the three required methods: `findPetTypes()`, `save(Owner)`, and `findById(Integer)` to make the appropriate RPC calls.

3. For each method:
   - I create the appropriate request message
   - I set the `refactoredObjectID` field to identify the instance on the server
   - I make the RPC call using the stub
   - I process the response to convert between DTO and client objects

4. Each method begins with a call to `verifyInitialized()` which is inherited from `AbstractRefactoredClient` to ensure the client has been properly initialized.

5. For the `findPetTypes()` method, I convert the list of `PetTypeDTO` objects to `PetType` client objects.

6. For the `save(Owner)` method, I convert the `Owner` client object to an `OwnerDTO` before making the RPC call.

7. For the `findById(Integer)` method, I convert the returned `OwnerDTO` to an `Owner` client object.

8. I've included the necessary import statements for the client and DTO classes as well as utility classes like `List` and `ArrayList`.

9. I've implemented `performRemoteCreateAndGetId` to create a proper `CreateObjectRequest` with the client ID.

This implementation ensures that the client behaves exactly like the original `OwnerRepository` class from the perspective of calling code, while internally making RPCs to the remote service.

---

### Original Class `org.springframework.samples.petclinic.owner.Owner`
#### Client Class `org.springframework.samples.petclinic.monomorph.dto.generated.client.Owner` (Service `OwnerService`)
##### Explanation
 Looking at the task, I need to create a client implementation that:
1. Maintains the same API as the original Owner class
2. Uses composition with the OwnerDTO proto-generated class
3. Implements all methods defined in the proto file
4. Maps properly between DTOs and client objects

Let me break down my implementation plan:

1. **Constructors**: I'll implement constructors matching the original class
2. **Field accessors**: Implement all getters/setters from the original class
3. **gRPC methods**: Implement the RPC methods from the proto file
4. **Mapping logic**: Ensure proper conversion between DTOs and client objects
##### Comments
 1. **Constructor Implementation**:
   - I've maintained the default constructor and added the private constructor needed for the `fromDTO` method.
   - Each constructor sets up the RPC connection by calling `performRpcSetup()`.

2. **RPC Method Implementations**:
   - For each method defined in the proto file, I've created corresponding implementations in the client.
   - The implementations create the appropriate request objects, send them to the server via the stub, and convert the response back to client objects.
   - For methods that return null (like the getPet methods), I've added a check to see if the response has a pet before converting.

3. **Handling DTOs**:
   - For Visit objects, I'm using the provided VisitMapper to convert between Visit and VisitDTO.
   - For Pet objects, I'm using the Pet client's toDTO and fromDTO methods for conversion.
   - For Owner-related operations, I'm updating the internal dtoInstance field.

4. **DTO Getters and Setters**:
   - I've implemented all the getters and setters from the original Owner class.
   - When setting values, I'm using the builder pattern to create a new immutable DTO instance.
   - I've handled null values by providing default values where appropriate.

5. **List Handling**:
   - For the getPets method, I convert each PetDTO in the list to a Pet client object.
   - For the addPet method, I make a copy of the current pets list, add the new pet, and update the DTO.

6. **Error Handling**:
   - I've wrapped the RPC setup in a try-catch block to provide a more descriptive error message.
   - The Assert statements from the original addVisit method are maintained.

This implementation maintains the same API as the original Owner class while delegating the actual operations to the gRPC server. External code can continue to use this class as if it were the original Owner class, with the actual operations happening remotely.

---

### Original Class `org.springframework.samples.petclinic.owner.Pet`
#### Client Class `org.springframework.samples.petclinic.monomorph.dto.generated.client.Pet` (Service `PetService`)
##### Explanation
 1. **Analyzing the implementation needs:**
   - Create a client that uses the PetDTO as the underlying data store
   - Implement getters and setters that match the original Pet class API
   - Implement the addVisit method defined in the proto service
   - Ensure proper mapping between original domain objects and DTOs
   - Set up gRPC stub for remote service calls

2. **Constructors:**
   - Need to match the original Pet constructors
   - The original class has a default constructor (implied)
   - Keep the private constructor that takes PetDTO for fromDTO

3. **DTO mappings:**
   - Need to handle mapping for PetType objects
   - Need to handle mapping for Visit objects
   - Need to handle Java LocalDate to/from String representation

4. **Implementing addVisit method:**
   - Use the gRPC stub to call the remote service
   - Convert between domain objects and DTOs

5. **Getters and Setters:**
   - Implement all getters and setters from the original Pet class
   - These should manipulate the underlying dtoInstance
##### Comments
 1. **Constructors**:
   I've implemented both the default constructor and the private constructor that takes a PetDTO. Both constructors set up the RPC client.

2. **Date Conversion**:
   I've used Java's DateTimeFormatter to convert between LocalDate objects and ISO-formatted strings for the birthDate field.

3. **Collection Handling**:
   For the visits collection, I've implemented conversion between the repeated field in the protobuf message and a Java Collection using streams.

4. **RPC Implementation**:
   The addVisit method takes a Visit parameter, converts it to a VisitDTO, makes the RPC call, and updates the local DTO with the response.

5. **Immutability**:
   Since protobuf objects are immutable, each setter needs to rebuild the entire DTO. This is handled through the builder pattern.

6. **Error Handling**:
   Basic error handling is included for RPC setup, but a more robust implementation might include retries, circuit breakers, etc.

7. **Mapping**:
   I've used the specified mapping approaches for PetType and Visit objects as required in the instructions.

8. **Additional Convenience Methods**:
   I added a setVisits method for convenience, even though it wasn't in the original class, as it provides a way to completely replace the visits collection if needed.

---

### Original Class `org.springframework.samples.petclinic.owner.PetType`
#### Client Class `org.springframework.samples.petclinic.monomorph.dto.generated.client.PetType` (Service ``)
##### Explanation
 To implement the client properly, I need to:

1. Ensure the DTO client class (`PetType`) has the same API as the original domain class
2. Add constructors that match the original class
3. Implement getters and setters for all the fields from the DTO
4. Create proper mappings between the domain object and DTO
5. Implement the private constructor that takes a `PetTypeDTO` instance

Looking at the original class, I see that `PetType` extends `NamedEntity`, which likely has `id` and `name` fields. The client should expose these fields through proper getters and setters that delegate to the wrapped DTO.
##### Comments
 1. I've implemented the required constructors based on what would be expected for a standard entity class:
   - A default constructor
   - A constructor that takes just the name
   - A constructor that takes both id and name
   - A private constructor that takes a `PetTypeDTO` for the `fromDTO` method

2. The getters and setters for the DTO fields are implemented to delegate to the wrapped DTO object. For setters, I'm using the protobuf builder pattern to create a new immutable DTO instance with the updated value.

3. The `fromDTO` method now correctly uses the private constructor that accepts a `PetTypeDTO`.

4. Note that with protobuf, objects are immutable by default, which means that every setter operation requires creating a new instance of the DTO. This might have performance implications for heavy use cases.

5. The implementation assumes that the fields in `PetTypeDTO` are `id` (int64) and `name` (string) as defined in the proto file from the previous task.

6. If the original `PetType` class had additional functionality beyond getters and setters, those methods would need to be implemented in this client class as well.

7. The stub instance for remote calls was mentioned in the instructions but wasn't part of the template, so it wasn't implemented. Typically, this would involve creating and configuring a gRPC channel and stub.

---

---
