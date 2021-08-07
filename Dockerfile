FROM amazoncorretto:11
ARG JAR_FILE=build/libs/*.jar
WORKDIR /app
ENV name=Stakater
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]