FROM java:8
VOLUME /tmp
ADD ./target/sc-auth.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]