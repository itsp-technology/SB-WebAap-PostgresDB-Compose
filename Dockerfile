FROM openjdk:21
COPY target/web-app.jar .
EXPOSE 8080
ENTRYPOINT [ "java","-jar" ,"web-app.jar" ]