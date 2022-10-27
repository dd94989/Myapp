package com.hemaolin.springcloud.controller;

import com.hemaolin.springcloud.entities.CommonResult;
import com.hemaolin.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2022-10- 19- 15:39
 */
@RestController
@Slf4j
public class OrderZKController {
  public static final String INVOKE_URL="http://cloud-provider-payment";
  @Autowired
  private RestTemplate restTemplate;
  @RequestMapping("/consumer/payment/zk")
  public String  get(){
      return  restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
  }
}
