FROM openjdk:8-alpine
# VOLUME /tmp
ADD app.jar app.jar
RUN sh -c 'touch /app.jar'

EXPOSE 8383
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
