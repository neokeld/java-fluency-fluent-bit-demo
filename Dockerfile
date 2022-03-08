FROM maven:3.8-openjdk-17-slim as builder

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package

FROM eclipse-temurin:17-alpine

COPY --from=builder /usr/src/app/target/*-jar-with-dependencies.jar /usr/app/

ENTRYPOINT ["java", "-cp", "/usr/app/fluencydemo-1.0.0-jar-with-dependencies.jar", "in.dema.demo.Main"]
