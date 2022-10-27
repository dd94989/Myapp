package com.hemaoli.springcloud.dao;


import com.hemaolin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shkstart
 * @create 2022-10- 17- 16:50
 */
@Mapper
public interface PaymentDao {
   public int create(Payment payment);
   public Payment getPaymentById(@Param("id")Long id);
}
