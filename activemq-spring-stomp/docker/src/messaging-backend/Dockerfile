FROM openjdk:8u131-jre-alpine
MAINTAINER Maksim Kostromin <daggerok@gmail.com>
RUN apk --no-cache add busybox-suid bash curl \
  && addgroup app-group \
  && adduser -h /home/app -s /bin/bash -D -u 1025 app app-group
USER app
WORKDIR /home/app
ENTRYPOINT ["java", "-jar", "./app.jar"]
EXPOSE 8080
HEALTHCHECK --interval=30s --timeout=30s --retries=10 CMD curl -f http://127.0.0.1:8080/health || exit 1
COPY ./messaging-backend/build/libs/*.jar ./app.jar
