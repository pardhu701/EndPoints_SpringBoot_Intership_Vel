# Use a lightweight Java runtime image
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR into the container
COPY target/EndPoints-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app will run on (default 8080)
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java","-jar","app.jar"]
