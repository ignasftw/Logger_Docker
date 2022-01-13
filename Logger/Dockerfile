FROM maven
COPY ./target/classes/ /tmp
WORKDIR /tmp
COPY pom.xml .
RUN mvn dependency:go-offline
ENTRYPOINT ["java","Main"]