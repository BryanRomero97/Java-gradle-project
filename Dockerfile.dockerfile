FROM eclipse-temurin:21-jdk-alpine

EXPOSE 8080

WORKDIR /app

# Copia el archivo JAR de la aplicación al contenedor
COPY build/libs/java-gradle-project-0.0.1-SNAPSHOT.jar app.jar

WORKDIR $APP_HOME

ENTRYPOINT exec java -jar app.jar