package com.hemaolin.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2022-10- 19- 16:38
 */
@RestController
public class OrderConsulController {
    public static final String INVOKE_URL="http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/consul")
    public String get(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
    }
}
