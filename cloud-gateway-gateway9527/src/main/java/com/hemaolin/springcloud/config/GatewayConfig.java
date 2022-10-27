package com.hemaolin.springcloud.config;

import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shkstart
 * @create 2022-10- 23- 20:12
 */
@Configuration
public class GatewayConfig {
     @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
         RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
         routes.route("path_route_hemaolin",r ->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();

         return routes.build();
     }
}
