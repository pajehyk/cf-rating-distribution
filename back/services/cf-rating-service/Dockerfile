FROM openjdk:21
COPY build/libs/cf-rating-service-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/cacerts cacerts
ENTRYPOINT ["java","-Djavax.net.ssl.trustStore=cacerts", "-jar","/app.jar"]