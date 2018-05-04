FROM frolvlad/alpine-oraclejdk8:slim
ADD target/demka.jar demka.jar
ENTRYPOINT ["java","-jar","demka.jar"]