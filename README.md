# Java Fluency Fluent Bit Demo
A demo of a Java jar sending events to Fluent Bit using Fluency library. Featuring a builder pattern in the Dockerfile.

## Stack

* OpenJdk 17 (eclipse-temurin)
* Maven 3.8
* maven-assembly-plugin to build an uber jar
* Fluency 2.6
* Fluent Bit 1.8

## Run it

```
docker-compose up
```

Fluent Bit is then available on default port 24224 and fluencydemo service should send an event to it before stopping.
