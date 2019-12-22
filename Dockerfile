FROM openjdk:8-jdk
ADD target/stock.jar stock.jar
EXPOSE 8083
ENTRYPOINT [ "java", "-jar", "stock.jar" ]
