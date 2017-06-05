package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hystrix的不执行fallback示例
 * @description 
 * 验证当抛出HystrixBadRequestException时不触发Hystrix的fallback动作
 * 
 * @author Spring Cao
 * @date 2017年6月5日 上午10:06:14
 */
@SpringBootApplication
@EnableCircuitBreaker
public class ConsumerMovieApplication {
  @Bean
  @LoadBalanced
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(ConsumerMovieApplication.class, args);
  }
}
