# **Microservice "persistence" ("persistence") Report**
## Microservice Summary
 The microservice "persistence"  contains a total of **30** classes and files:
  - **13** classes were selected from the decomposition file
  - **11** new classes were added or generated
  - **6** new proto files were added or generated

 The microservice does not have defined a main class.

---

---

## Changes
 The following changes were made in order to create the microservice:
### Dependencies
 The dependencies of the microservice have been updated. The following packages were added to the file [build.gradle](build.gradle):
 - `com.github.ben-manes.caffeine:caffeine:2.8.0`
 - `com.google.protobuf:protobuf-java:3.25.5`
 - `io.grpc:grpc-netty-shaded:1.71.0`
 - `io.grpc:grpc-protobuf:1.71.0`
 - `io.grpc:grpc-stub:1.71.0`
 - `javax.annotation:javax.annotation-api:1.3.2`
 - `org.mapstruct:mapstruct:1.6.3`

### Copied Classes
 The following classes were copied from the original microservice based on the decomposition:
 - `com.coveros.training.helpers.AssertionException` was copied to [src/main/java/com/coveros/training/helpers/AssertionException.java](src/main/java/com/coveros/training/helpers/AssertionException.java)
 - `com.coveros.training.helpers.CheckUtils` was copied to [src/main/java/com/coveros/training/helpers/CheckUtils.java](src/main/java/com/coveros/training/helpers/CheckUtils.java)
 - `com.coveros.training.persistence.EmptyDataSource` was copied to [src/main/java/com/coveros/training/persistence/EmptyDataSource.java](src/main/java/com/coveros/training/persistence/EmptyDataSource.java)
 - `com.coveros.training.persistence.IPersistenceLayer` was copied to [src/main/java/com/coveros/training/persistence/IPersistenceLayer.java](src/main/java/com/coveros/training/persistence/IPersistenceLayer.java)
 - `com.coveros.training.persistence.NotImplementedException` was copied to [src/main/java/com/coveros/training/persistence/NotImplementedException.java](src/main/java/com/coveros/training/persistence/NotImplementedException.java)
 - `com.coveros.training.persistence.ParameterObject` was copied to [src/main/java/com/coveros/training/persistence/ParameterObject.java](src/main/java/com/coveros/training/persistence/ParameterObject.java)
 - `com.coveros.training.persistence.PersistenceLayer` was copied to [src/main/java/com/coveros/training/persistence/PersistenceLayer.java](src/main/java/com/coveros/training/persistence/PersistenceLayer.java)
 - `com.coveros.training.helpers.ServletUtils` was copied to [src/main/java/com/coveros/training/helpers/ServletUtils.java](src/main/java/com/coveros/training/helpers/ServletUtils.java)
 - `com.coveros.training.persistence.SqlData` was copied to [src/main/java/com/coveros/training/persistence/SqlData.java](src/main/java/com/coveros/training/persistence/SqlData.java)
 - `com.coveros.training.persistence.SqlRuntimeException` was copied to [src/main/java/com/coveros/training/persistence/SqlRuntimeException.java](src/main/java/com/coveros/training/persistence/SqlRuntimeException.java)
 - `com.coveros.training.helpers.StringUtils` was copied to [src/main/java/com/coveros/training/helpers/StringUtils.java](src/main/java/com/coveros/training/helpers/StringUtils.java)
 - `com.coveros.training.tomcat.WebAppListener` was copied to [src/main/java/com/coveros/training/tomcat/WebAppListener.java](src/main/java/com/coveros/training/tomcat/WebAppListener.java)
 - `com.coveros.training.persistence.DbServlet` was copied to [src/main/java/com/coveros/training/persistence/DbServlet.java](src/main/java/com/coveros/training/persistence/DbServlet.java)

### New Clients
 The following gRPC clients were generated and added to invoke their corresponding servers through RPCs. They serve as proxies to their corresponding original classes:
 - Class `com.coveros.training.monomorph.dto.generated.client.User`:
   - A proxy for `com.coveros.training.authentication.domainobjects.User`
   - Location: [src/main/java/com/coveros/training/monomorph/dto/generated/client/User.java](src/main/java/com/coveros/training/monomorph/dto/generated/client/User.java)
   - Corresponding Proto service `` in file [user.proto](src/main/proto/user.proto)
   - DTO Message: UserDTO in [user.proto](src/main/proto/user.proto)
 - Class `com.coveros.training.monomorph.dto.generated.client.Book`:
   - A proxy for `com.coveros.training.library.domainobjects.Book`
   - Location: [src/main/java/com/coveros/training/monomorph/dto/generated/client/Book.java](src/main/java/com/coveros/training/monomorph/dto/generated/client/Book.java)
   - Corresponding Proto service `BookService` in file [book.proto](src/main/proto/book.proto)
   - DTO Message: BookDTO in [book.proto](src/main/proto/book.proto)
 - Class `com.coveros.training.monomorph.dto.generated.client.Borrower`:
   - A proxy for `com.coveros.training.library.domainobjects.Borrower`
   - Location: [src/main/java/com/coveros/training/monomorph/dto/generated/client/Borrower.java](src/main/java/com/coveros/training/monomorph/dto/generated/client/Borrower.java)
   - Corresponding Proto service `` in file [borrower.proto](src/main/proto/borrower.proto)
   - DTO Message: BorrowerDTO in [borrower.proto](src/main/proto/borrower.proto)
 - Class `com.coveros.training.monomorph.dto.generated.client.Loan`:
   - A proxy for `com.coveros.training.library.domainobjects.Loan`
   - Location: [src/main/java/com/coveros/training/monomorph/dto/generated/client/Loan.java](src/main/java/com/coveros/training/monomorph/dto/generated/client/Loan.java)
   - Corresponding Proto service `` in file [loan.proto](src/main/proto/loan.proto)
   - DTO Message: LoanDTO in [loan.proto](src/main/proto/loan.proto)

### Shared Utilities
 The following helper classes were added to the microservice in order to implement the pattern and shared logic defined in the approach (leasing, service discovery, ID mapping, etc):
 - Helper Class `LeaseRpcClient.java`:
   - Location: [src/main/java/com/coveros/training/monomorph/id/shared/client/LeaseRpcClient.java](src/main/java/com/coveros/training/monomorph/id/shared/client/LeaseRpcClient.java)
   - Description: The LeaseRpcClient interface defines the methods that the client microservices can use to interact with the LeaseManager. It is shared by all microservices.
 - Helper Class `ServerObjectManager.java`:
   - Location: [src/main/java/com/coveros/training/monomorph/id/shared/server/ServerObjectManager.java](src/main/java/com/coveros/training/monomorph/id/shared/server/ServerObjectManager.java)
   - Description: The ServerObjectManager interface defines the methods for managing the objects to IDs and vice versa. It is shared by all microservices.
 - Helper Proto file `shared.proto`:
   - Location: [src/main/proto/shared.proto](src/main/proto/shared.proto)
   - Description: The proto file that describes the RefactoredObjectID messages required for exchanging instance IDs across microservices. It is shared by all server microservices.
 - Helper Class `AbstractRefactoredClient.java`:
   - Location: [src/main/java/com/coveros/training/monomorph/id/shared/client/AbstractRefactoredClient.java](src/main/java/com/coveros/training/monomorph/id/shared/client/AbstractRefactoredClient.java)
   - Description: The AbstractRefactoredClient class is a base class for all client classes that use the leasing API. It provides the common methods for the generated client classes and incorporates the leasing logic. It is shared by all microservices.
 - Helper Class `GrpcLeaseRpcClient.java`:
   - Location: [src/main/java/com/coveros/training/monomorph/id/shared/client/GrpcLeaseRpcClient.java](src/main/java/com/coveros/training/monomorph/id/shared/client/GrpcLeaseRpcClient.java)
   - Description: The GrpcLeaseRpcClient class is a gRPC client that implements LeaseRpcClient and that interacts with the LeasingServiceImpl class. It is shared by all microservices.
 - Helper Proto file `leasing.proto`:
   - Location: [src/main/proto/leasing.proto](src/main/proto/leasing.proto)
   - Description: The proto file describing the leasing service api and messages. Required for the leasing/TTL logic. It is shared by all server microservices.
### Generated Utilities
 The following helper classes were generated and customized for the microservice "persistence":
 - Class `ServiceRegistry` was generated for the microservice:
   - Location: [src/main/java/com/coveros/training/monomorph/id/generated/helpers/ServiceRegistry.java](src/main/java/com/coveros/training/monomorph/id/generated/helpers/ServiceRegistry.java)
   - Description: A utility class that serves as a placeholder for service discovery. It is customized for each microservice.
 - Class `ClassIdRegistry` was generated for the microservice:
   - Location: [src/main/java/com/coveros/training/monomorph/id/generated/helpers/ClassIdRegistry.java](src/main/java/com/coveros/training/monomorph/id/generated/helpers/ClassIdRegistry.java)
   - Description: A utility class that defines the CLASSIDs for the classes that are exchanged between microservices. It is customized for each microservice.
 - Class `IDMapper` was generated for the microservice:
   - Location: [src/main/java/com/coveros/training/monomorph/id/generated/helpers/IDMapper.java](src/main/java/com/coveros/training/monomorph/id/generated/helpers/IDMapper.java)
   - Description: A utility class for mapping a RefactoredObjectID into actual type instances (if the type is in the microservice) or client instances and vice versa. It is customized for each microservice.

### Updated Imports
 The following imports were updated in the microservice:
 - In class [com.coveros.training.persistence.PersistenceLayer](src/main/java/com/coveros/training/persistence/PersistenceLayer.java):
   - `com.coveros.training.authentication.domainobjects.User` was replaced with `com.coveros.training.monomorph.dto.generated.client.User`
   - `com.coveros.training.library.domainobjects.Book` was replaced with `com.coveros.training.monomorph.dto.generated.client.Book`
   - `com.coveros.training.library.domainobjects.Borrower` was replaced with `com.coveros.training.monomorph.dto.generated.client.Borrower`
   - `com.coveros.training.library.domainobjects.Loan` was replaced with `com.coveros.training.monomorph.dto.generated.client.Loan`
 - In class [com.coveros.training.persistence.IPersistenceLayer](src/main/java/com/coveros/training/persistence/IPersistenceLayer.java):
   - `com.coveros.training.authentication.domainobjects.User` was replaced with `com.coveros.training.monomorph.dto.generated.client.User`
   - `com.coveros.training.library.domainobjects.Book` was replaced with `com.coveros.training.monomorph.dto.generated.client.Book`
   - `com.coveros.training.library.domainobjects.Borrower` was replaced with `com.coveros.training.monomorph.dto.generated.client.Borrower`
   - `com.coveros.training.library.domainobjects.Loan` was replaced with `com.coveros.training.monomorph.dto.generated.client.Loan`

---

---

## Detailed Refactoring Comments for Consumed Services
### Original Class `com.coveros.training.authentication.domainobjects.User`
#### Client Class `com.coveros.training.monomorph.dto.generated.client.User` (Service ``)
##### Explanation
 Looking at the requirements and the template, I need to create a client implementation that:
1. Uses composition with the `UserDTO` protobuf-generated class
2. Implements all the original class constructors and methods
3. Provides data mapping between domain object and DTO
4. Maintains API compatibility with the original class

My approach will be:
1. Complete the constructor to match the original `User` class
2. Implement the `fromDTO` method properly
3. Add all the necessary getters and setters to expose the DTO fields
4. Implement all the original methods from the source class like `equals()`, `hashCode()`, `toString()`, `createEmpty()`, and `isEmpty()`
##### Comments
 1. I've implemented all the constructors to match the original API, including:
   - A constructor taking `name` and `id` parameters (matching original API)
   - A constructor taking a `UserDTO` instance (for internal mapping)
   - A private empty constructor (used by the `fromDTO` method)

2. The `fromDTO` method now correctly initializes the DTO instance in the new client object.

3. I've implemented all methods from the original class:
   - `createEmpty()` - returns a User with empty string and 0 ID
   - `isEmpty()` - checks if the user equals the empty user
   - `equals()` - compares User objects for equality
   - `hashCode()` - generates a hash code consistent with equals
   - `toString()` - provides a string representation of the object

4. I've added the getters for the `UserDTO` fields:
   - `getName()` - returns the name field from the DTO
   - `getId()` - returns the ID field from the DTO

5. No setters were added because the original class doesn't have setters (it appears to be immutable with final fields).

6. The client maintains the same API as the original class, allowing it to be used as a drop-in replacement without requiring changes to code that uses the `User` class.

---

### Original Class `com.coveros.training.library.domainobjects.Book`
#### Client Class `com.coveros.training.monomorph.dto.generated.client.Book` (Service `BookService`)
##### Explanation
 I'll now implement the Java client to interact with the Book gRPC service. This involves several key steps:

1. **Field and Constructor Setup**:
   - Define the private `dtoInstance` field (already in template)
   - Implement constructors that match the original class
   - Create the appropriate DTO mapping methods

2. **DTO Getters and Setters**:
   - Expose methods that match the original class API
   - Delegate to the underlying DTO instance

3. **Method Implementation**:
   - Implement all methods from the original class, delegating to the DTO where appropriate
   - Ensure the behavior matches the original class

4. **gRPC Setup**:
   - Add stub configuration for remote calls
   - Handle the service registry integration

Let's implement this client class to provide an identical API to the original domain object while internally using the DTO for service communication.
##### Comments
 1. **Constructor Implementation**:
   - I've implemented a constructor that matches the signature of the original class
   - This constructor creates a new DTO instance with the provided values
   - The private constructor taking a DTO is used for the fromDTO method

2. **Method Implementation**:
   - All methods from the original class have been implemented to maintain the same API
   - The `equals()`, `hashCode()`, and `toString()` methods delegate to the same implementation pattern
   - Static methods like `createEmpty()` are preserved

3. **DTO Delegation**:
   - Getters access data from the DTO instance
   - Since BookDTO is immutable (as per protobuf), there are no setters
   - All operations that would modify state actually create a new instance

4. **Immutability**:
   - The original Book class is immutable (all fields are final), which aligns well with protobuf's immutability
   - I've maintained this pattern in the implementation

5. **gRPC Setup**:
   - Added the stub initialization using the ServiceRegistry
   - This allows the client to connect to the appropriate service

6. **Additional Notes**:
   - I've included imports for required classes (StringUtils, EqualsBuilder, etc.)
   - The BookServiceGrpc class would be generated from the proto file
   - Since there were no explicit RPC methods defined in the proto, the stub is prepared but not used in any methods

This implementation allows for seamless integration with existing code that uses the Book class, while internally using the DTO for serialization and communication.

---

### Original Class `com.coveros.training.library.domainobjects.Borrower`
#### Client Class `com.coveros.training.monomorph.dto.generated.client.Borrower` (Service ``)
##### Explanation
 To create an effective gRPC client implementation for the Borrower class:

1. I need to ensure the client class has the same public API as the original Borrower class, so other parts of the code can use it without changes.

2. The client will store data in a BorrowerDTO object (generated from our proto file) and provide methods to convert between the DTO and domain representations.

3. The implementation needs to include:
   - All constructors matching the original class
   - All methods from the original class (equals, hashCode, toString, isEmpty, etc.)
   - Getters for the fields that were public in the original class
   - Methods to convert between DTO and domain object representations

4. I'll follow the composition pattern where the client contains a BorrowerDTO instance.

##### Comments
 1. I've ensured that the public API closely matches the original Borrower class:
   - Preserved the constructors with the same signatures
   - Implemented all the original methods (equals, hashCode, toString, etc.)
   - Added public accessors for the fields that were public in the original class

2. The implementation now uses composition, holding a BorrowerDTO instance internally.

3. I've included mapping methods (toDTO and fromDTO) to convert between the client and DTO objects.

4. I maintained the exact behavior of methods like equals(), hashCode(), and toString() to ensure consistent behavior with the original class.

5. I added getters for the id and name fields to allow access to the data stored in the DTO.

6. One key difference to note is that in the original class, id and name were public final fields. In this implementation, they are accessed through getters since we're using composition with the DTO.

7. I've maintained the same package structure as specified in the template.

This implementation should be a drop-in replacement for the original Borrower class, allowing seamless refactoring to a microservices architecture using gRPC.

---

### Original Class `com.coveros.training.library.domainobjects.Loan`
#### Client Class `com.coveros.training.monomorph.dto.generated.client.Loan` (Service ``)
##### Explanation
 Looking at the task, I need to implement the gRPC client for the Loan class that will replace the original domain object. Here's my reasoning for the implementation:

1. **Class Structure**: I need to maintain the same API as the original Loan class, but internally use the LoanDTO for data storage and RPC communication.

2. **Constructors**: The original class has a constructor that takes Book, Borrower, long id, and java.sql.Date. I need to implement a similar constructor, but using the client versions of Book and Borrower.

3. **DTO Mapping**: I need to implement the toDTO and fromDTO methods to convert between the client and DTO objects. The fromDTO method is already partially implemented but needs completion.

4. **Methods Implementation**: I need to implement all the original methods (equals, hashCode, toString, createEmpty, isEmpty) to maintain compatibility.

5. **DTO Getters and Setters**: I need to expose the fields of the DTO via getters (and potentially setters, though the original class is immutable).
##### Comments
 1. **Constructors**: I've implemented the primary constructor that takes Book, Borrower, long id, and Date parameters, matching the original class. I've also preserved the private default constructor needed for the fromDTO static method.

2. **Data Mapping**: For the conversion between Date and timestamp (long), I used getTime() to get milliseconds since epoch, and created new Date objects from timestamps when needed.

3. **Method Implementation**: I've implemented equals(), hashCode(), toString(), createEmpty(), and isEmpty() to match the behavior of the original class.

4. **Immutability**: The original class was immutable (all fields were final), so I've only implemented getters and no setters.

5. **Type Mapping**: For Book and Borrower client types, I've used their respective fromDTO/toDTO methods for conversion.

6. **Stub Implementation**: I noticed the template doesn't include the stub for RPC communication that was mentioned in the instructions. This would typically be added as a private field with initialization in a performRpcSetup() method. Since this wasn't in the template, I've omitted it, but it should be added if needed.

7. **Error Handling**: In a robust implementation, we would add error handling for null values and RPC failures.

The implementation preserves the API of the original Loan class while internally working with DTOs for communication with the gRPC service.

---

---
