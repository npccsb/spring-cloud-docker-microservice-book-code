############################################################

# 构建基础镜像 pulsepointinc/centos7-java8:latest + Eureka

############################################################

#基础镜像
FROM pulsepointinc/centos7-java8:latest

#定义作者
MAINTAINER caosibin "caosibin@yxqiche.com"

#设置日志卷
VOLUME ["/tmp"]

#添加Config Server的jar
ADD microservice-config-server-0.0.1-SNAPSHOT.jar app.jar

#生成app.jar
RUN bash -c 'touch /app.jar'

#暴露端口给容器
EXPOSE 8080

#容器启动时执行的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
