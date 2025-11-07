# Use a lightweight JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Maven wrapper and source
COPY . .

# Build the Spring Boot JAR
RUN ./mvnw clean package -DskipTests

# Run the JAR
CMD ["java", "-jar", "$(ls target/*.jar | head -n 1)"]
