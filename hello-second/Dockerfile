## Container stage
FROM openjdk:11
ARG JAR_FILE=target/*.jar
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
