#### 运行一个镜像（需要带版本，否则默认latest，基础镜像是centos7+oracle jdk8）

``` java
docker run -p ${容器内端口}:${对外暴露的端口} -t ${镜像名称}
```

#### 使用docker命令来进入运行中的容器的linux命令行

``` java
docker exec -i -t  ${容器ID} /bin/bash
``` 