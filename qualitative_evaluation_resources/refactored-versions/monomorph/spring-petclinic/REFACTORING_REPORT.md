# Refactoring Report for application "spring-petclinic"
 This report contains some of the details of the refactoring process applied to the application. For more details on the refactoring changes, please refer to the reports `<ms_name>/REFACTORING_REPORT.md` for each microservice.
## Project Details
- **Application Name**: spring-petclinic
- **Package Name**: org.springframework.samples.petclinic
- **Decomposition**: manual
- **Programming Language**: java

- **Java Version**: 11
- **Build Tool**: Maven
- **Number of unique classes**: 23
- **Number of microservices**: 3
## Refactoring Details
- **Number of new API classes**: 5
- **Number of DTO-based API classes**: 4
- **Number of ID-based API classes**: 1

---

## Microservices
- **Microservice "customers"**:
  - Code name: `customers`
  - Path: "[customers](customers)"
  - Report: "[customers/REFACTORING_REPORT.md](customers/REFACTORING_REPORT.md)"
  - Listen Port: 50051
- **Microservice "visits"**:
  - Code name: `visits`
  - Path: "[visits](visits)"
  - Report: "[visits/REFACTORING_REPORT.md](visits/REFACTORING_REPORT.md)"
  - Listen Port: 50052
- **Microservice "vets"**:
  - Code name: `vets`
  - Path: "[vets](vets)"
  - Report: "[vets/REFACTORING_REPORT.md](vets/REFACTORING_REPORT.md)"

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
 - Class `org.springframework.samples.petclinic.owner.Owner`:
   - Decision: `DTO-Based`
   - Reasoning: The `Owner` class contains several String fields and a list of `Pet` objects. While the data structure is moderately complex due to the nested `Pet` relationships, most external consumers likely only require basic owner information (e.g., name, contact details) rather than the full `Pet` list. This suggests a DTO could encapsulate a subset of fields. The `Owner` class is primarily used within the `customers` microservice for CRUD operations and is not modified directly by external services. This suggests DTO-Based Sharing. The suggested DTO includes core owner identification and contact fields, excluding the `pets` list unless explicitly required by consumers.

---

 - Class `org.springframework.samples.petclinic.owner.OwnerRepository`:
   - Decision: `ID-Based`
   - Reasoning: The `Owner` class contains complex nested relationships and high mutability, making DTOs cumbersome. The dominant usage patterns require write access and transactional consistency, which is best achieved through ID-Based APIs. The `visits` microservice needs to add visits, justifying runtime coupling for data freshness.

---

 - Class `org.springframework.samples.petclinic.owner.Pet`:
   - Decision: `DTO-Based`
   - Reasoning: The decision is DTO-Based due to the read-heavy usage of the Pet class in the visits microservice. The PetType and Visit relationships introduce dependencies, but the lack of evidence of external state modification and the need for stable identifiers and basic pet details for display purposes in visit records make DTOs more efficient. The frequent access to stable fields like id, name, type, and birthDate supports this approach.

---

 - Class `org.springframework.samples.petclinic.owner.PetType`:
   - Decision: `DTO-Only`
   - Reasoning: Class org.springframework.samples.petclinic.owner.PetType was used within the fields/inputs/outputs of class org.springframework.samples.petclinic.owner.PetTypeFormatter from microservice vets.
Class org.springframework.samples.petclinic.owner.PetType was used within the fields/inputs/outputs of class org.springframework.samples.petclinic.owner.PetTypeFormatter from microservice visits.

---

 - Class `org.springframework.samples.petclinic.owner.Visit`:
   - Decision: `DTO-Only`
   - Reasoning: Class org.springframework.samples.petclinic.owner.Visit was used within the fields/inputs/outputs of class org.springframework.samples.petclinic.owner.Owner from microservice customers.
Class org.springframework.samples.petclinic.owner.Visit was used within the fields/inputs/outputs of class org.springframework.samples.petclinic.owner.Pet from microservice customers.

---


---

## Refactoring Metadata
- **run_id**: 5033d181
- **include_tests**: All test classes that were not already in the decomposition were excluded from the refactoring process
- **restrictive_mode**: Restrictive mode was enabled: All Java classes that were not already in the decomposition, were detected by the analysis tool and were not in the source package src/main/java were excluded from the execution