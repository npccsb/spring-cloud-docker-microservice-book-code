package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 基于SpringCloudBus的ConfigServer刷新机制的服务器端
 * @description
 * 1.根据“根”上下文优先加载原则，resources下的bootstrap.yml会比application.yml中的内容提前加载
 * 所以，需要将config server地址放入在bootstrap.yml中实现提前加载
 * 2.本例采用rabbitmq(也可以是kafka，但需要修改pom依赖从amqp到kafka)来实现cloud bus，
 * rabbitmq直接pull自docker.io提供的官方rabbitmq镜像。
 * 3.使用postman发送post信息到http://localhost:8081/bus/refresh 来实现通知bus上的全部节点进行配置刷新
 * 
 * ps：若不需要cloud bus时只能通过指向具体的应用地址才能刷新这个应用的配置，http://localhost:8080/refresh
 *  
 * @author Spring Cao
 * @date 2017年6月5日 上午8:50:31
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigServerApplication.class, args);
  }
}
