FROM java:8
VOLUME /tmp
ADD ./target/sc-registry.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8881
ENTRYPOINT ["java","-jar","/app.jar"]