package com.hemaolin.springcloud.server;

import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2022-10- 23- 16:47
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK  o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_Timeout  o(╥﹏╥)o";
    }
}
