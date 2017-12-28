FROM java:8
VOLUME /tmp
ADD ./target/sc-gateway.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]