FROM maven:3.5.4-jdk-11-slim as maven
COPY ./pom.xml ./pom.xml
COPY ./src ./src
RUN mvn dependency:go-offline -B
RUN mvn package
FROM openjdk:11-jre-slim
WORKDIR /hepsiburada
COPY --from=maven target/MarsRover-*.jar ./hepsiburada/MarsRover.jar
CMD ["java", "-jar", "./hepsiburada/MarsRover.jar"]