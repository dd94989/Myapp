package com.hemaolin.springcloud.controller;

import com.hemaolin.springcloud.entities.CommonResult;
import com.hemaolin.springcloud.entities.Payment;
import com.hemaolin.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2022-10- 20- 15:12
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
       return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timout")
    public String getPaymenttimout() {
        return paymentFeignService.PaymentFeignTimout();
    }
}
