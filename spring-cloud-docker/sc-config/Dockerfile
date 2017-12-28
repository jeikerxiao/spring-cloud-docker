FROM java:8
VOLUME /tmp
ADD ./target/sc-config.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8882
ENTRYPOINT ["java","-jar","/app.jar"]