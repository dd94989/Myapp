package com.hemaolin.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author shkstart
 * @create 2022-10- 18- 21:51
 */


@Slf4j
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/zk")
    public String payment(){
        return "Springcloud with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
