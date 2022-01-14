FROM maven
COPY ./Logger/target/classes/ /tmp
WORKDIR /tmp
COPY /Logger/pom.xml .
RUN mvn dependency:go-offline
ENTRYPOINT ["java","Main"]