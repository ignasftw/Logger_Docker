FROM maven
COPY ./Logger/artifacts/Logger_jar/Logger.jar .
EXPOSE 4500
ENTRYPOINT ["java","-jar","Logger.jar"]