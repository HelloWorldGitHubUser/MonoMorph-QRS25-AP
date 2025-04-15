# **Microservice "library" ("library") Report**
## Microservice Summary
 The microservice "library"  contains a total of **43** classes and files:
  - **21** classes were selected from the decomposition file
  - **15** new classes were added or generated
  - **7** new proto files were added or generated

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
 - `com.coveros.training.library.domainobjects.Book` was copied to [src/main/java/com/coveros/training/library/domainobjects/Book.java](src/main/java/com/coveros/training/library/domainobjects/Book.java)
 - `com.coveros.training.library.domainobjects.Borrower` was copied to [src/main/java/com/coveros/training/library/domainobjects/Borrower.java](src/main/java/com/coveros/training/library/domainobjects/Borrower.java)
 - `com.coveros.training.library.domainobjects.LibraryActionResults` was copied to [src/main/java/com/coveros/training/library/domainobjects/LibraryActionResults.java](src/main/java/com/coveros/training/library/domainobjects/LibraryActionResults.java)
 - `com.coveros.training.library.LibraryBookListAvailableServlet` was copied to [src/main/java/com/coveros/training/library/LibraryBookListAvailableServlet.java](src/main/java/com/coveros/training/library/LibraryBookListAvailableServlet.java)
 - `com.coveros.training.library.LibraryBookListSearchServlet` was copied to [src/main/java/com/coveros/training/library/LibraryBookListSearchServlet.java](src/main/java/com/coveros/training/library/LibraryBookListSearchServlet.java)
 - `com.coveros.training.library.LibraryBorrowerListSearchServlet` was copied to [src/main/java/com/coveros/training/library/LibraryBorrowerListSearchServlet.java](src/main/java/com/coveros/training/library/LibraryBorrowerListSearchServlet.java)
 - `com.coveros.training.library.LibraryLendServlet` was copied to [src/main/java/com/coveros/training/library/LibraryLendServlet.java](src/main/java/com/coveros/training/library/LibraryLendServlet.java)
 - `com.coveros.training.library.LibraryRegisterBookServlet` was copied to [src/main/java/com/coveros/training/library/LibraryRegisterBookServlet.java](src/main/java/com/coveros/training/library/LibraryRegisterBookServlet.java)
 - `com.coveros.training.library.LibraryRegisterBorrowerServlet` was copied to [src/main/java/com/coveros/training/library/LibraryRegisterBorrowerServlet.java](src/main/java/com/coveros/training/library/LibraryRegisterBorrowerServlet.java)
 - `com.coveros.training.library.LibraryUtils` was copied to [src/main/java/com/coveros/training/library/LibraryUtils.java](src/main/java/com/coveros/training/library/LibraryUtils.java)
 - `com.coveros.training.library.domainobjects.Loan` was copied to [src/main/java/com/coveros/training/library/domainobjects/Loan.java](src/main/java/com/coveros/training/library/domainobjects/Loan.java)

### New Services
 The following gRPC services were generated and added to expose their corresponding classes to other microservices:
 - Class `com.coveros.training.monomorph.dto.generated.proto.book.BookService`:
   - Exposes the API of [com.coveros.training.library.domainobjects.Book](src/main/java/com/coveros/training/library/domainobjects/Book.java)
   - Corresponding Proto service `BookService` in file [book.proto](src/main/proto/book.proto)
   - DTO Message: BookDTO in [book.proto](src/main/proto/book.proto)
   - Mapper class: [com.coveros.training.monomorph.dto.generated.server.BookMapper](src/main/java/com/coveros/training/monomorph/dto/generated/server/BookMapper.java)
 - Class `com.coveros.training.monomorph.dto.generated.proto.borrower.BorrowerService`:
   - Exposes the API of [com.coveros.training.library.domainobjects.Borrower](src/main/java/com/coveros/training/library/domainobjects/Borrower.java)
   - Corresponding Proto service `` in file [borrower.proto](src/main/proto/borrower.proto)
   - DTO Message: BorrowerDTO in [borrower.proto](src/main/proto/borrower.proto)
   - Mapper class: [com.coveros.training.monomorph.dto.generated.server.BorrowerMapper](src/main/java/com/coveros/training/monomorph/dto/generated/server/BorrowerMapper.java)
 - Class `com.coveros.training.monomorph.dto.generated.proto.loan.LoanService`:
   - Exposes the API of [com.coveros.training.library.domainobjects.Loan](src/main/java/com/coveros/training/library/domainobjects/Loan.java)
   - Corresponding Proto service `` in file [loan.proto](src/main/proto/loan.proto)
   - DTO Message: LoanDTO in [loan.proto](src/main/proto/loan.proto)
   - Mapper class: [com.coveros.training.monomorph.dto.generated.server.LoanMapper](src/main/java/com/coveros/training/monomorph/dto/generated/server/LoanMapper.java)

### New Clients
 The following gRPC clients were generated and added to invoke their corresponding servers through RPCs. They serve as proxies to their corresponding original classes:
 - Class `com.coveros.training.monomorph.id.generated.client.CheckUtils`:
   - A proxy for `com.coveros.training.helpers.CheckUtils`
   - Location: [src/main/java/com/coveros/training/monomorph/id/generated/client/CheckUtils.java](src/main/java/com/coveros/training/monomorph/id/generated/client/CheckUtils.java)
   - Corresponding Proto service `CheckUtilsService` in file [check_utils.proto](src/main/proto/check_utils.proto)
 - Class `com.coveros.training.monomorph.dto.generated.client.User`:
   - A proxy for `com.coveros.training.authentication.domainobjects.User`
   - Location: [src/main/java/com/coveros/training/monomorph/dto/generated/client/User.java](src/main/java/com/coveros/training/monomorph/dto/generated/client/User.java)
   - Corresponding Proto service `` in file [user.proto](src/main/proto/user.proto)
   - DTO Message: UserDTO in [user.proto](src/main/proto/user.proto)

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
 The following helper classes were generated and customized for the microservice "library":
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
   - `com.coveros.training.helpers.CheckUtils` was replaced with `com.coveros.training.monomorph.id.generated.client.CheckUtils`
   - `com.coveros.training.authentication.domainobjects.User` was replaced with `com.coveros.training.monomorph.dto.generated.client.User`
 - In class [com.coveros.training.persistence.IPersistenceLayer](src/main/java/com/coveros/training/persistence/IPersistenceLayer.java):
   - `com.coveros.training.authentication.domainobjects.User` was replaced with `com.coveros.training.monomorph.dto.generated.client.User`

---

---

## Detailed Refactoring Comments for Exposed Services
### Original Class `com.coveros.training.library.domainobjects.Book`
#### Service `com.coveros.training.monomorph.dto.generated.proto.book.BookService`
##### Explanation
 I need to create a proto file based on the `Book` Java class to enable gRPC communication between microservices. Let's analyze what's needed:

1. **Field Identification**: From the `Book` class, I can see that it has two primary fields:
   - `title` - a String
   - `id` - a long

2. **Proto Mapping**: When mapping Java types to Protocol Buffers:
   - Java `String` maps to protobuf `string`
   - Java `long` maps to protobuf `int64`

3. **Message Structure**: I'll define a `BookDTO` message in the proto file with these fields, ensuring field names match exactly as in the Java class, even if they don't follow protobuf conventions.

4. **Package and Options**: I'll use the package and options provided in the template.

5. **Additional Considerations**:
   - The class has methods like `isEmpty()` and `createEmpty()` but these are behavioral and don't need to be represented in the data transfer object.
   - The class has `equals()`, `hashCode()`, and `toString()` methods which are standard Java methods and don't need specific representation in protobuf.
##### Comments
 1. **Field Ordering**: I've ordered the fields as they appear in the constructor of the original class, which is common practice.

2. **No RPC Methods Defined**: Since the original class doesn't expose any methods that would be called by external microservices (as mentioned in the instructions), I've included a placeholder `BookService` but without specific RPC methods defined.

3. **Protobuf Tags**: I've used sequential numbering for the protobuf field tags (1, 2). These tags are important for binary serialization and shouldn't be changed once in production.

4. **Empty Methods**: Methods like `createEmpty()` and `isEmpty()` aren't included as they represent behavior rather than data structure. If these functionalities are needed in the microservice architecture, they should be implemented in service classes that handle the DTOs.

5. **Future Expansion**: If additional fields or methods are added to the Book class in the future, the proto definition can be extended while maintaining backward compatibility (a key advantage of Protocol Buffers).

---

### Original Class `com.coveros.training.library.domainobjects.Borrower`
#### Service `com.coveros.training.monomorph.dto.generated.proto.borrower.BorrowerService`
##### Explanation
 To create the proto file for the `Borrower` class, I need to analyze the class structure and determine what fields and data types need to be represented in the protobuf definition.

Looking at the `Borrower` class:

1. It has two fields:
   - `id` - a long value representing the borrower's identifier
   - `name` - a String representing the borrower's name

2. Both fields are public and final, making them read-only after construction.

3. The class is immutable, meaning once a Borrower object is created, it cannot be changed.

For the proto file, I need to:
- Create a message called `BorrowerDTO` as specified
- Include fields for `id` and `name` with their appropriate protobuf types
- Maintain the same field names as the original Java class
- Use the package specified in the template

In protobuf:
- Java's `long` maps to protobuf's `int64`
- Java's `String` maps to protobuf's `string`

Since the Borrower class doesn't have any complex behaviors that need to be exposed as RPC methods (it's just a data container), I only need to define the message structure in the proto file, not any services.
##### Comments
 1. I've maintained the field names from the original Java class (`id` and `name`).

2. I've used appropriate protobuf types:
   - `int64` for the Java `long` type
   - `string` for the Java `String` type

3. I've added the comments from the original class to make the proto file more self-explanatory.

4. I did not need to create any additional messages or enums because the `Borrower` class is a relatively simple data structure without any complex nested objects or enumeration values.

5. I did not define any service methods because according to the instructions, we're only looking to represent the data structure of the `Borrower` class, not expose methods through gRPC.

6. When this proto file is compiled, it will generate Java code that can be used to serialize/deserialize Borrower objects between microservices using gRPC.

---

### Original Class `com.coveros.training.library.domainobjects.Loan`
#### Service `com.coveros.training.monomorph.dto.generated.proto.loan.LoanService`
##### Explanation
 Looking at the `Loan` class, I need to create a protobuf message that represents it as a DTO. Here's my reasoning for the different parts of the proto file:

1. **Basic Structure**: The template provides the package name, Java package options, and syntax declaration. I'll keep these as is.

2. **Field Analysis from Loan class**:
   - `checkoutDate`: This is a `java.sql.Date` type in Java. In protobuf, we don't have a direct Date type, so I'll use `int64` to store the timestamp (milliseconds since epoch).
   - `book`: This is a reference to a `Book` object. Based on the instructions, I need to replace this with a reference to `BookDTO`.
   - `borrower`: This is a reference to a `Borrower` object. Based on the instructions, I need to replace this with a reference to `BorrowerDTO`.
   - `id`: This is a `long` type in Java, which maps to `int64` in protobuf.

3. **Imports**: I need to import the proto files for `Book` and `Borrower` since the `Loan` class references them. According to the instructions:
   - `book.proto` for `BookDTO` in package `com.coveros.training.monomorph.dto.generated.proto.book`
   - `borrower.proto` for `BorrowerDTO` in package `com.coveros.training.monomorph.dto.generated.proto.borrower`

4. **Message Definition**: I'll define the `LoanDTO` message with all the fields from the `Loan` class, using appropriate protobuf types.
##### Comments
 1. I used `int64` for the `checkoutDate` field because protobuf doesn't have a native date type. When converting between the DTO and domain object, you'll need to convert between `java.sql.Date` and the timestamp value.

2. For the `book` and `borrower` fields, I'm using the fully qualified names of the DTO classes as specified in the instructions.

3. I've included field numbers (1, 2, 3, 4) which are required in protobuf definitions. These numbers identify fields in the binary encoding.

4. I've preserved the original field names from the Java class as instructed, even though protobuf conventions typically use snake_case for field names.

5. I've added comments from the original Java code to maintain clarity about the purpose of each field.

6. No service definition was requested in the instructions, so I didn't include one. If RPC methods are needed, they would be defined in a `service` block.

---


---

## Detailed Refactoring Comments for Consumed Services
### Original Class `com.coveros.training.helpers.CheckUtils`
#### Client Class `com.coveros.training.monomorph.id.generated.client.CheckUtils` (Service `CheckUtilsService`)
##### Explanation
 First, let me analyze what needs to be done for the client implementation:

1. **Class Structure Analysis**:
   - The original `CheckUtils` has only static methods and a private constructor.
   - The new client class will inherit from `AbstractRefactoredClient`.
   - We need to implement all methods from the proto file.

2. **Constructor Implementation**:
   - The original class has a private constructor with no arguments.
   - We need to retain the same API in the client.
   - We also need the private constructor that takes a `RefactoredObjectID`.

3. **Method Implementation**:
   - `StringMustNotBeNullOrEmpty` takes varargs of strings.
   - `IntParameterMustBePositive` takes a long parameter.
   - Both methods throw exceptions in certain conditions.

4. **RPC Setup and Cleanup**:
   - Need to implement `performRemoteCreateAndGetId` to make the createObject RPC call.
   - The RPC setup and cleanup are partially implemented in the template.

Let me now implement the client.
##### Comments
 1. **Static Method Handling**:
   - The original `CheckUtils` class uses static methods, which I've maintained in the client interface.
   - Internally, each static method creates an instance of the client, makes the RPC call, and then cleans up.

2. **Constructor Approach**:
   - Since the original class has a private constructor with no arguments, I've maintained the same approach.
   - The client constructor is private to match the original class.

3. **Exception Handling**:
   - The original methods throw `IllegalArgumentException` in specific cases.
   - I've wrapped the RPC calls with try-catch blocks to translate gRPC exceptions into the appropriate exceptions.

4. **RPC Call Pattern**:
   - For each method, I create an instance, set up the RPC connection, make the call, and then clean up.
   - This maintains the stateless nature of the original utility class.

5. **Cleanup**:
   - Each method ensures cleanup is called to release resources properly.

6. **Service ID**:
   - I've retained the service ID "authentication" from the template.

7. **Method Signatures**:
   - I've preserved the original method signatures to ensure compatibility with existing code.

This implementation should provide a seamless transition from the original class to the gRPC client, with the same API and exception behavior.

---

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

---
