FROM openjdk:11
VOLUME /tmp
EXPOSE 8002
ADD ./target/api-man-socios-mongodb-ribbon-0.0.1-SNAPSHOT.jar api-man-socios-mongodb-ribbon.jar
ENTRYPOINT ["java","-jar","/api-man-socios-mongodb-ribbon.jar"]