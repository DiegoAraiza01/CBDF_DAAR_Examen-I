FROM amazoncorretto:23-alpine-jdk
COPY target/practica1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]