FROM openjdk:11.0.1-jdk
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=./build/libs/springboot-metrics-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} springboot-metrics.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springboot-metrics.jar"]