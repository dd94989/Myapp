package com.hemaolin.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2022-10- 20- 17:10
 */
@Component
public interface PaymentService {
      String paymentInfo_OK(Integer id);
      String paymentInfo_TimeOut(Integer id);
      String paymentCircuitBreaker(Integer id);
}
