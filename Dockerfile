FROM openjdk:8u312-jdk-oracle

LABEL AUTHOR="GOUTHAM"

EXPOSE 8080

CMD [ "mkdir /app" ]
COPY ./target/greeting.jar /app/app.jar

ENTRYPOINT [ "java", "jar", "/app/app.jar" ]
