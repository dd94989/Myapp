package com.hemaoli.springcloud.service.impl;


import com.hemaoli.springcloud.dao.PaymentDao;
import com.hemaoli.springcloud.service.PaymentService;
import com.hemaolin.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2022-10- 17- 17:15
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {

        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
