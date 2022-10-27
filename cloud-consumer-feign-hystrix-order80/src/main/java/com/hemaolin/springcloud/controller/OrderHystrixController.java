package com.hemaolin.springcloud.controller;

import com.hemaolin.springcloud.server.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2022-10- 22- 20:33
 */
@RestController
@DefaultProperties(defaultFallback = "payment_Global_fallbackMethod")
public class OrderHystrixController {
    @Autowired
   private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String s = paymentHystrixService.paymentInfo_OK(id);
        return s;
    }

//    @HystrixCommand(
//            fallbackMethod ="paymentInfo_TimeOutHandler",
//            commandProperties = {
//                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//            }
//    )
    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id){
        int i=10/0;
        String s = paymentHystrixService.paymentInfo_Timeout(id);
        return s;
    }
    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池"+Thread.currentThread().getName()+"paymentInfo_TimeOutHandler: "+id+"o(╥﹏╥)o";

    }
    public String payment_Global_fallbackMethod(){
        return "Global异常处理信息，请稍后再试，ヾ(◍°∇°◍)ﾉﾞ";
    }


}
