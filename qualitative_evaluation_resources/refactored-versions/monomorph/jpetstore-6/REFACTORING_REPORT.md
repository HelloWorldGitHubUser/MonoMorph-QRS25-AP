# Refactoring Report for application "jpetstore-6"
 This report contains some of the details of the refactoring process applied to the application. For more details on the refactoring changes, please refer to the reports `<ms_name>/REFACTORING_REPORT.md` for each microservice.
## Project Details
- **Application Name**: jpetstore-6
- **Package Name**: org.mybatis.jpetstore
- **Decomposition**: manual
- **Programming Language**: java

- **Java Version**: 11
- **Build Tool**: Maven
- **Number of unique classes**: 24
- **Number of microservices**: 3
## Refactoring Details
- **Number of new API classes**: 13
- **Number of DTO-based API classes**: 8
- **Number of ID-based API classes**: 5

---

## Microservices
- **Microservice "account"**:
  - Code name: `account`
  - Path: "[account](account)"
  - Report: "[account/REFACTORING_REPORT.md](account/REFACTORING_REPORT.md)"
  - Listen Port: 50051
- **Microservice "order"**:
  - Code name: `order`
  - Path: "[order](order)"
  - Report: "[order/REFACTORING_REPORT.md](order/REFACTORING_REPORT.md)"
  - Listen Port: 50052
- **Microservice "catalog"**:
  - Code name: `catalog`
  - Path: "[catalog](catalog)"
  - Report: "[catalog/REFACTORING_REPORT.md](catalog/REFACTORING_REPORT.md)"
  - Listen Port: 50053

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
 - Class `org.mybatis.jpetstore.service.CatalogService`:
   - Decision: `DTO-Based`
   - Reasoning: The `CatalogService` is primarily used for read-only data retrieval across services, with consumers needing stable subsets of data. DTO-Based Sharing minimizes runtime coupling while accommodating eventual consistency for non-critical fields. Exposing DTOs with key product/item metadata allows the `account` microservice to operate independently, reducing direct dependencies on the `catalog` service’s internal data structures.

---

 - Class `org.mybatis.jpetstore.domain.Item`:
   - Decision: `ID-Based`
   - Reasoning: The `order` microservice requires real-time access to mutable fields like `quantity` and `status` to prevent overselling and ensure accurate order fulfillment. ID-Based API ensures the latest state of items is fetched during critical operations.

---

 - Class `org.mybatis.jpetstore.web.actions.CartActionBean`:
   - Decision: `ID-Based`
   - Reasoning: The `CartActionBean` manages a mutable, transactionally critical resource (user cart) with direct ties to inventory checks. The order microservice’s need for real-time cart data during checkout mandates the ID-Based approach. This ensures the catalog service maintains control over cart state and guarantees consistency for order placement.

---

 - Class `org.mybatis.jpetstore.mapper.ItemMapper`:
   - Decision: `ID-Based`
   - Reasoning: The `ItemMapper` is used for state-changing operations (`updateInventoryQuantity`) by the OrderService, violating service autonomy. Refactor to: expose `GET /inventory/{itemId}` and `POST /inventory/{itemId}/decrement` APIs from catalog. OrderService calls these APIs using `itemId`, eliminating direct data access. DTOs are unsuitable here because inventory updates require transactional control and real-time consistency—DTO replication would introduce staleness risks. ID-Based ensures the catalog service remains the sole authority for inventory logic.

---

 - Class `org.mybatis.jpetstore.domain.Product`:
   - Decision: `DTO-Only`
   - Reasoning: Class org.mybatis.jpetstore.domain.Product was used within the fields/inputs/outputs of class org.mybatis.jpetstore.web.actions.AccountActionBean from microservice account.

---

 - Class `org.mybatis.jpetstore.web.actions.CatalogActionBean`:
   - Decision: `DTO-Only`
   - Reasoning: Class org.mybatis.jpetstore.web.actions.CatalogActionBean was used within the fields/inputs/outputs of class org.mybatis.jpetstore.web.actions.AccountActionBean from microservice account.

---

 - Class `org.mybatis.jpetstore.domain.Account`:
   - Decision: `DTO-Based`
   - Reasoning: The `Account` class is primarily consumed for read-only data snapshots in order processing. DTO-based sharing: - ✅ Decouples order service from account API - ✅ Preserves historical accuracy (orders reflect address at placement time) - ✅ Reduces payload by excluding sensitive/volatile fields (password, status) - ❗ Requires event-driven updates for address changes to maintain eventual consistency

---

 - Class `org.mybatis.jpetstore.web.actions.AccountActionBean`:
   - Decision: `ID-Based`
   - Reasoning: The class manages session state and security-sensitive operations, requiring real-time authentication checks. Sharing a DTO with authentication status would risk stale data. The ID-Based approach ensures freshness and consistency.

---

 - Class `org.mybatis.jpetstore.domain.Cart`:
   - Decision: `ID-Based`
   - Reasoning: The `Cart` class is highly mutable and requires centralized ownership for consistency in operations like quantity updates. The `catalog` microservice performs write operations and needs the latest state to reflect changes. Direct access via ID-based API ensures real-time updates and avoids stale data issues.

---

 - Class `org.mybatis.jpetstore.domain.CartItem`:
   - Decision: `DTO-Based`
   - Reasoning: DTO-Based sharing is recommended to decouple the `catalog` and `order` microservices. The `order` service needs a snapshot of the cart state for order processing, while the `catalog` service can tolerate slight staleness for displaying the cart. Sharing only necessary fields like `itemId`, `quantity`, `inStock`, and `total` minimizes data payload and service coupling.

---

 - Class `org.mybatis.jpetstore.mapper.CategoryMapper`:
   - Decision: `DTO-Only`
   - Reasoning: Class org.mybatis.jpetstore.mapper.CategoryMapper was used within the fields of org.mybatis.jpetstore.service.CatalogService.

---

 - Class `org.mybatis.jpetstore.mapper.ProductMapper`:
   - Decision: `DTO-Only`
   - Reasoning: Class org.mybatis.jpetstore.mapper.ProductMapper was used within the fields of org.mybatis.jpetstore.service.CatalogService.

---

 - Class `org.mybatis.jpetstore.domain.Category`:
   - Decision: `DTO-Only`
   - Reasoning: Class org.mybatis.jpetstore.domain.Category was used within the fields of org.mybatis.jpetstore.web.actions.CatalogActionBean.

---


---

## Refactoring Metadata
- **run_id**: dfb6a0fd
- **include_tests**: All test classes that were not already in the decomposition were excluded from the refactoring process
- **restrictive_mode**: Restrictive mode was enabled: All Java classes that were not already in the decomposition, were detected by the analysis tool and were not in the source package src/main/java were excluded from the execution