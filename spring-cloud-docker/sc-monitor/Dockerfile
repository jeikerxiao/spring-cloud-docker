FROM java:8
VOLUME /tmp
ADD ./target/sc-monitor.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8883 8041
ENTRYPOINT ["java","-jar","/app.jar"]