FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8800

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} myapp.jar

RUN echo "Creation of your docker image is in progress, please hold on for a moment"

ENTRYPOINT ["java", "-jar", "myapp.jar"]

