FROM openjdk:11-jre-slim
ADD ./partner-service.jar /opt/

ENV TZ=Asia/Shanghai
ENV SERVICE_HOST=${HOST_IP}
#ENV server.port=10007
ENV spring.profiles.active=dev
#ENV JAVA_OPTS=-Xmx512m -XX:G1ConcRefinementThreads=1
RUN chmod +x /opt/partner-service.jar
ENTRYPOINT ["java","-jar", "/opt/partner-service.jar"]