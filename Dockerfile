#
# Build stage
#
FROM maven:3.8.3-openjdk-11-slim AS build
COPY . /home/app
RUN mvn --settings /home/app/settings.xml -f /home/app/pom.xml clean package -Dmaven.test.skip=true

#
# Package stage
#
FROM adoptopenjdk/openjdk16:jre-16.0.1_9-alpine
# define time zone
ENV TZ=Europe/Zurich
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN echo "$PWD"
COPY --from=build /home/app/demo-launcher/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
