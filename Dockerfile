FROM maven
COPY ./Logger/artifacts/Logger_jar/Logger.jar .
EXPOSE 3008
ENTRYPOINT ["java","-jar","Logger.jar"]