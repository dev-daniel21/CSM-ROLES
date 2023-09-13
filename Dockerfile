FROM bellsoft/liberica-openjdk-alpine:17.0.7-7

ENV JAVA_OPTS " -Xms512m -Xmx512m -Djava.security.egd=file:/dev/.urandom"

WORKDIR application

COPY target/csm-roles-0.0.1-SNAPSHOT.jar csm-roles.jar

ENTRYPOINT ["java", "-jar", "csm-roles.jar"]