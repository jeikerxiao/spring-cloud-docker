FROM java:8
VOLUME /tmp
ADD ./target/sc-servicea.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8083
ENTRYPOINT ["java","-jar","/app.jar"]