# Refactoring Report for application "7ep-demo"
 This report contains some of the details of the refactoring process applied to the application. For more details on the refactoring changes, please refer to the reports `<ms_name>/REFACTORING_REPORT.md` for each microservice.
## Project Details
- **Application Name**: 7ep-demo
- **Package Name**: com.coveros.training
- **Decomposition**: manual
- **Programming Language**: java

- **Java Version**: 11
- **Build Tool**: Gradle
- **Number of unique classes**: 91
- **Number of microservices**: 4
## Refactoring Details
- **Number of new API classes**: 5
- **Number of DTO-based API classes**: 4
- **Number of ID-based API classes**: 1

---

## Microservices
- **Microservice "authentication"**:
  - Code name: `authentication`
  - Path: "[authentication](authentication)"
  - Report: "[authentication/REFACTORING_REPORT.md](authentication/REFACTORING_REPORT.md)"
  - Listen Port: 50051
- **Microservice "library"**:
  - Code name: `library`
  - Path: "[library](library)"
  - Report: "[library/REFACTORING_REPORT.md](library/REFACTORING_REPORT.md)"
- **Microservice "mathematics"**:
  - Code name: `mathematics`
  - Path: "[mathematics](mathematics)"
  - Report: "[mathematics/REFACTORING_REPORT.md](mathematics/REFACTORING_REPORT.md)"
- **Microservice "persistence"**:
  - Code name: `persistence`
  - Path: "[persistence](persistence)"
  - Report: "[persistence/REFACTORING_REPORT.md](persistence/REFACTORING_REPORT.md)"

---

## Approach Description
The "MonoMorph" refactoring process generates a ID and DTO based microservices architecture using an agentic approach combining LLMs and Modeling to transform a monolithic application into a microservices architecture. In the ID based design, each microservice is responsible for the lifecycle of the class it owns. The rest consume it through its unique ID and calls to the corresponding API. In this implementation, the interaction between microservices is done through gRPC. The lifecycle of the classes is managed by a leasing/TTL (time-to-live) system. The DTO based design is a more traditional approach where each microservice exposes its own API and  the classes are transferred through the network in each interaction. To combine the simplicity of the DTO approach when possible and the ID based approach when needed, the MonoMorph process generates a hybrid architecture where the selection of the refactoring approach for each candidate API class is done by the LLM.

The process is divided into the following steps:
1. **Dependency Analysis**: The process starts by analyzing the dependencies between the classes in the monolithic application.
2. **Detecting new APIs**: The process detects the new APIs that need to be created for each microservice.
3. **Approach Selection**: The process selects the approach for each API class using the agentic LLM.
4. **Post-decision**: The process analyzes the inter-service interactions, taking into account the selected approach to find any potential new API classes (which will be asigned to the DTO method).
5. **Refactoring**: For each new API class, the process uses a LLM to generate a protocol buffer definition and its corresponding gRPC server and client implementations. The implementation and design differ based on the chose approach.
6. **Configuration Generation**: The process generates and adds the helper classes to the microservices. It updates as well the dependencies of the build tool.
7. **Entrypoint Generation**: The process generates the entry point for each microservice ensuring that each gRPC server is configured and integrates the process into the original main if needed.
8. **Report Generation**: The current report is generated for the project and each microservice ensuring tracing of the transformations and their explanations.

---


---

## Decisions and Explanations
 The following section provides the reasoning behind the decisions made for the refactoring approach:
 - Class `com.coveros.training.helpers.CheckUtils`:
   - Decision: `ID-Based`
   - Reasoning: The class CheckUtils is purely a set of in-process, static validation helpers. It does not fit the DTO-Based style for inter-service communication as it does not have fields or state. Instead, it belongs in a shared 'common-utils' JAR/module that each service depends on. No DTO is required because there are no fields to serialize—these are in-process validation routines. Therefore, the decision is to extract CheckUtils into a shared 'common-utils' JAR/module.

---

 - Class `com.coveros.training.authentication.domainobjects.User`:
   - Decision: `DTO-Only`
   - Reasoning: Class com.coveros.training.authentication.domainobjects.User was used within the fields/inputs/outputs of class com.coveros.training.persistence.PersistenceLayer from microservice library.
Class com.coveros.training.authentication.domainobjects.User was used within the fields/inputs/outputs of class com.coveros.training.persistence.SqlDataTests from microservice persistence.
Class com.coveros.training.authentication.domainobjects.User was used within the fields/inputs/outputs of class com.coveros.training.persistence.PersistenceLayerTests from microservice library.
Class com.coveros.training.authentication.domainobjects.User was used within the fields/inputs/outputs of class com.coveros.training.persistence.IPersistenceLayer from microservice persistence.
Class com.coveros.training.authentication.domainobjects.User was used within the fields/inputs/outputs of class com.coveros.training.persistence.PersistenceLayer from microservice persistence.
Class com.coveros.training.authentication.domainobjects.User was used within the fields/inputs/outputs of class com.coveros.training.persistence.SqlDataTests from microservice library.
Class com.coveros.training.authentication.domainobjects.User was used within the fields/inputs/outputs of class com.coveros.training.persistence.IPersistenceLayer from microservice library.

---

 - Class `com.coveros.training.library.domainobjects.Book`:
   - Decision: `DTO-Only`
   - Reasoning: Class com.coveros.training.library.domainobjects.Book was used within the fields/inputs/outputs of class com.coveros.training.persistence.IPersistenceLayer from microservice authentication.
Class com.coveros.training.library.domainobjects.Book was used within the fields/inputs/outputs of class com.coveros.training.persistence.PersistenceLayer from microservice authentication.
Class com.coveros.training.library.domainobjects.Book was used within the fields/inputs/outputs of class com.coveros.training.persistence.IPersistenceLayer from microservice persistence.
Class com.coveros.training.library.domainobjects.Book was used within the fields/inputs/outputs of class com.coveros.training.persistence.PersistenceLayer from microservice persistence.

---

 - Class `com.coveros.training.library.domainobjects.Borrower`:
   - Decision: `DTO-Only`
   - Reasoning: Class com.coveros.training.library.domainobjects.Borrower was used within the fields/inputs/outputs of class com.coveros.training.persistence.IPersistenceLayer from microservice authentication.
Class com.coveros.training.library.domainobjects.Borrower was used within the fields/inputs/outputs of class com.coveros.training.persistence.PersistenceLayer from microservice authentication.
Class com.coveros.training.library.domainobjects.Borrower was used within the fields/inputs/outputs of class com.coveros.training.persistence.IPersistenceLayer from microservice persistence.
Class com.coveros.training.library.domainobjects.Borrower was used within the fields/inputs/outputs of class com.coveros.training.persistence.PersistenceLayer from microservice persistence.

---

 - Class `com.coveros.training.library.domainobjects.Loan`:
   - Decision: `DTO-Only`
   - Reasoning: Class com.coveros.training.library.domainobjects.Loan was used within the fields/inputs/outputs of class com.coveros.training.persistence.IPersistenceLayer from microservice authentication.
Class com.coveros.training.library.domainobjects.Loan was used within the fields/inputs/outputs of class com.coveros.training.persistence.PersistenceLayer from microservice authentication.
Class com.coveros.training.library.domainobjects.Loan was used within the fields/inputs/outputs of class com.coveros.training.persistence.IPersistenceLayer from microservice persistence.
Class com.coveros.training.library.domainobjects.Loan was used within the fields/inputs/outputs of class com.coveros.training.persistence.PersistenceLayer from microservice persistence.

---


---

## Refactoring Metadata
- **run_id**: bce46963
- **include_tests**: All test classes that were not already in the decomposition were excluded from the refactoring process
- **restrictive_mode**: Restrictive mode was enabled: All Java classes that were not already in the decomposition, were detected by the analysis tool and were not in the source package src/main/java were excluded from the execution