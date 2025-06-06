FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/order-service-0.0.1-SNAPSHOT.jar order-service.jar
EXPOSE 8070
ENTRYPOINT ["java", "-jar", "order-service.jar"]
