# jetty-jaxrs-gradle-docker-boilerplate

## Usage:
```bash
./gradlew buildDocker
docker run -d -p 8080:8080 jetty-jaxrs-gradle-docker-boilerplate
```
Then go to either of these
* [http://localhost:8080/hello/YourName](http://localhost:8080/hello/YourName)
* [http://localhost:8080/hello/greet/YourName](http://localhost:8080/hello/greet/YourName)

## Places to rename stuff:
* README.md
* settings.gradle
* src/main/java
* src/main/resources/logback.xml
