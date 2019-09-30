FROM openjdk:8-jdk
ADD target/stock.jar stock.jar
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "stock.jar" ]