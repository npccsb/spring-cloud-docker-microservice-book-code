package com.itmuch.cloud.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 可支持刷新的config server客户端使用示例
 * @description 
 *    若要获取config server端更新后的值，需要post方式发送到 http://ip:port/refresh
 *    例如：http://localhost:8081/refresh
 * @author Spring Cao
 * @date 2017年6月3日 下午2:17:06
 */
@RestController
@RefreshScope
public class ConfigClientController {
  @Value("${profile}")
  private String profile;

  @GetMapping("/profile")
  public String hello() {
    return this.profile;
  }
}
