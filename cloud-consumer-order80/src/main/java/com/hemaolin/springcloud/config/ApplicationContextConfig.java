package com.hemaolin.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2022-10- 18- 15:47
 */
@Configuration
public class ApplicationContextConfig {
   @Bean
//   @LoadBalanced//使用 @LoadBalanced注解赋予了RestTemplate负载均衡的能力
   public RestTemplate getRestTemplate(){

     return new RestTemplate();
   }
}
