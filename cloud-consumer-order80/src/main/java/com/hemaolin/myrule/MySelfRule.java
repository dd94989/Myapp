package com.hemaolin.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shkstart
 * @create 2022-10- 19- 18:44
 */
@Configuration
public class MySelfRule {
      @Bean
      public IRule myRule(){
          return new RandomRule();
      }
}
