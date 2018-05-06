FROM frolvlad/alpine-oraclejdk8:slim
ADD target/demka.war demka.war
ENTRYPOINT ["java","-jar","demka.war"]