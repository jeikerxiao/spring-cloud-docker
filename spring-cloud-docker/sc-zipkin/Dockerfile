FROM java:8
VOLUME /tmp
ADD ./target/sc-zipkin.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8884
ENTRYPOINT ["java","-jar","/app.jar"]