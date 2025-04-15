# Description:
To assess the quality of the refactored version of the benchmark monoliths, we define key evaluation aspects based on microservices principles and the scope of the refactoring approach. Each aspect is accompanied by guiding questions to facilitate the evaluation. However, you are encouraged to provide additional insights, highlight any issues encountered, and discuss aspects that may not be covered by the predefined questions. Finally, please assign a score from 1 to 10 to reflect how effectively the refactoring approach addressed each aspect.

# Benchmark Applications
- jpetstore-6
- petclinic-spring
- 7ep-demo

# Refactoring Approaches Under Evaluation
- MicroRefact (available in the directory "[microrefact](refactored-versions%2Fmicrorefact)")
- MonoMorph (available in the directory "[monomorph](refactored-versions%2Fmonomorph)")

# Provided data:
To help you with your evaluation, we provide the following details:
-	The monolithic application in the directory [repositories](repositories)
-	Its decomposition in the directory [decompositions](decompositions)
-	Its complete list of classes and methods (and more static analysis data) in the directory [static-analysis](static-analysis)
-	The list of inter-service interactions (at the class and method level) in the directory [inter-service-interactions](inter-service-interactions)
-	The steps needed to run the tests on the monolithic version (through a dockerfile) in the directory [dockerfiles](dockerfiles)

Note: For each application, we provide the list of inter-service interactions sorted by the source microservice. The interactions were categorized into 3 groups:
- **Expected Interactions**: Interactions that are expected to be present and transformed in the refactored version.
- **Potential Interactions**: Inter-service interactions that involve classes that were not part of the decomposition. Changes in these interactions depend on the refactoring approach.
- **Potential Test Interactions**: Inter-service interactions that involve test classes. These classes were not part of the decomposition, so their inclusion in the refactored version depends on the refactoring approach.

# Instructions
Evaluate the refactored versions for each monolithic applications using the following order. For each version and application, you can use the file [evaluation_comments_template.docx](evaluation_comments_template.docx) as a template to provide your feedback. Make sure to fill out the general details at the top of the document.
- **P1**: 7ep-demo, spring-petclinic, jpetstore-6
- **P2**: spring-petclinic, jpetstore-6, 7ep-demo
- **P3**: jpetstore-6, 7ep-demo, spring-petclinic
- **P4**: spring-petclinic, jpetstore-6, 7ep-demo
- **P5**: jpetstore-6, 7ep-demo, spring-petclinic

# Evaluation Aspects:
## 1) **Services Boundaries and Decompositions**: 
This aspect evaluates how much does the refactoring approach respect the input decomposition of the monolith:
1.	Are all of the classes in the application mapped to their correct microservices based on their decomposition?
2.	Are there classes that were not included in the decomposition but found in the monolith? How were they handled by the approach?
3.	Are there new classes added to the microservices? Do they still respect the single responsibility of these microservices?
4.	Has the dependency mapping between components been accurately preserved?

## 2) **Correctness & Functional Equivalence**: 
This evaluation aspect focuses on whether the business logic of the original monolith has been maintained throughout the refactoring process
1.	Does the refactored application produce the same outcomes as the original monolith?
2.	Have any functional behaviors been inadvertently altered during the transformation?
3.	Is the transformation strictly limited to modifying call mechanics, leaving the business logic unchanged?
4.	Do the transformed interactions maintain the same logical flow as in the monolith?

## 3) **Code Transformation and Remote Invocations**: 
This evaluation should ensure that the transformation correctly replaces local method invocations with remote call patterns without altering the business logic. It involves checking that dependencies and interactions between components are preserved and correctly redirected. It is critical that the refactored services correctly invoke their remote counterparts and that the data exchange, such as request parameters and responses, is accurately handled. This includes verifying that endpoints are correctly defined and reachable.

1.	Are all relevant local method calls successfully replaced by their remote call counterparts?
2.	Are the request and response structures consistent with the original local calls?
3.	Are there any issues such as missing object mappings or incorrect handling of requests and responses? 
4.	Is data correctly serialized and deserialized during remote calls?


## 4) **Data Handling and Consistency**:
 This aspect involves assessing how the refactoring approach changes the data handling when going from a monolithic to a distributed context. This involve handling existing data persistence mechanism or ensuring data remains consistent even in a distributed application.
1.	Is there an existing database in the monolith? How did the refactoring approach handle it?
2.	How is a shared state managed or synchronized across the services?
3.	Is there any data duplication? Do you think that it is justified?
4.	Is the data still consistent? Were there any new consistency mechanisms added if needed?

## 5) **Performance Overhead**:
 Going from a monolithic to a distributed context is bound to introduce a performance overhead. In this evaluation aspect, we wish to assess whether or not the overhead is within acceptable margins.
1.	Are there new mechanisms introduced to the refactored version that add overhead to existing interactions?
2.	Do you think that this overhead is justified? 
3.	What mechanisms you would replace if you had to modify the code manually?
4.	Are there any indications of over-segmentation leading to excessive inter-service communication?

## 6) **Code Maintainability & Readability Post-Transformation**: 
The refactoring approaches are a part of a larger process. The code generated by such approaches needs to be maintained and changed further by the developers in later stages. As such, this aspect evaluates the difficulty of maintaining the code after this transformation.
1.	Is the refactored code easy to understand and follow compared to the original monolith?
2.	Has the transformation introduced excessive boilerplate code or complexity?
3.	How difficult it is to replace the mechanisms introduced by the approach if need be?
4.	Does the approach include fault tolerance or error handling mechanisms? If not, how difficult it is to add them in the future?

## 7) **Execution and Packaging**: 
This aspect evaluates the implementation of the refactoring approach and whether it succeeds at generating a functional distributed version of the monolith.
1.	Does the refactored version compile and/or packages correctly? If there are complication errors, can you list some of the sources and reasons for these issues?
2.	Does the refactoring approach introduce new dependencies? Were these dependencies added correctly?
3.	Does the approach introduce any new deployment automation mechanisms (docker, k8s, etc)?