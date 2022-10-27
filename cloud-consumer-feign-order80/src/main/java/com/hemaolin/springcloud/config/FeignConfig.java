package com.hemaolin.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author shkstart
 * @create 2022-10- 20- 15:54
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLeve(){
        return Logger.Level.FULL;
    }
}
