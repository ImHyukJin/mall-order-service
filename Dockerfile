<<<<<<< HEAD
# �⺻ �̹����� OpenJDK ���
=======
# �⺻ �̹����� OpenJDK ���
>>>>>>> 2ef577961636ad8cebc57552c06ca7550a99a793
FROM openjdk:11-jdk-slim

ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV

<<<<<<< HEAD
# ����� JAR ������ �����̳ʿ� ����
COPY ${JAR_FILE} app.jar

# Spring Boot ���ø����̼� ����
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]

=======
# ����� JAR ������ �����̳ʿ� ����
COPY ${JAR_FILE} app.jar

# Spring Boot ���ø����̼� ����
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]
>>>>>>> 2ef577961636ad8cebc57552c06ca7550a99a793
