package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 基于SpringCloudBus的ConfigServer刷新机制的服务器端
 * @description
 * 根据“根”上下文优先加载原则，resources下的bootstrap.yml会比application.yml中的内容提前加载
 * 所以，需要将config server地址放入在bootstrap.yml中实现提前加载
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
