# PII Notice — Run Metadata

This directory contains MonoMorph run metadata files (logs, configuration, and reports) that were generated during the experiments and are provided for transparency and reproducibility.

## Files containing absolute paths

The following files contain absolute filesystem paths from the machine on which the experiments were run. These paths include a username and should be reviewed before public release if full anonymisation is required.

### Log files (`refactoring_logs.log`)

Each log file records the full execution trace of a MonoMorph run. Several log lines reference the absolute path to the Java gRPC import-parser JAR and to intermediate output directories, for example:

```
monomorph DEBUG grpc.py - Starting Java gRPC server process from JAR: /Users/<username>/…/monomorph/resources/java-import-parser.jar
monomorph INFO  docker.py - Resuming from microservice path: /Users/<username>/…/data_important/…
```

Affected files:
- `monomorph/7ep-demo/refactoring_logs.log`
- `monomorph/jpetstore-6/refactoring_logs.log`
- `monomorph/spring-petclinic/refactoring_logs.log`

### Configuration files (`args.json`)

The `args.json` files contain only **relative** paths (e.g. `./data/repositories/…`) and **do not** expose any absolute or personal paths. No action required.

## Other notes

The source code files inside `../generated_microservices/monomorph/7ep-demo/` (specifically `build.gradle`, `gradle.properties`, and `docs/ci_and_cd/`) contain example paths such as `C:/Users/byron/…` and `C:/Users/foo/…`. These are placeholder comments from the **original 7ep-demo benchmark repository** and are unrelated to the authors of this paper.
