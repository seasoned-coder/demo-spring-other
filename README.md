# demo-spring (multi-module)

This repository is a simple demo Spring Boot multi-module project, with two modules:

- `hello-lib` — a small library module that provides a `GreetingService` and demonstrates Guava and Commons Lang usage.
- `app` — a Spring Boot web application module that depends on `hello-lib` and exposes REST endpoints.

## Building

From the repository root run:

```bash
mvn -DskipTests package
```

This builds both modules. If you want to run the web app from the `app` module:

```bash
cd app
mvn spring-boot:run
```

The web app listens on port 9090 by default (see `app/src/main/resources/application.properties`).

## Running tests

From the repository root:

```bash
mvn test
```

Or to run only a module's tests:

```bash
mvn -pl hello-lib -am test
mvn -pl app -am test
```

## Notes

- Dependency versions for `guava` and `commons-lang3` are declared in the parent POM under `dependencyManagement` and used by both modules.
- The Jenkins pipeline used for releases is configured separately in `Jenkinsfile.release`.
This needs the following plugins installed into Jenkins:
- Pipeline Maven Integration
- AnsiColor