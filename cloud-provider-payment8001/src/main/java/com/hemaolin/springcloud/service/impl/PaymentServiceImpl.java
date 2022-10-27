package com.hemaolin.springcloud.service.impl;

import com.hemaolin.springcloud.dao.PaymentDao;
import com.hemaolin.springcloud.entities.Payment;
import com.hemaolin.springcloud.service.PaymentService;
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
