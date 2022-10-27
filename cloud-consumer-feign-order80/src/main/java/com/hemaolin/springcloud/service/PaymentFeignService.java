package com.hemaolin.springcloud.service;

import com.hemaolin.springcloud.entities.CommonResult;
import com.hemaolin.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shkstart
 * @create 2022-10- 20- 15:06
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment>  getPaymentById(@PathVariable("id")Long id );
    @GetMapping("/payment/feign/timout")
    public String PaymentFeignTimout();
}
