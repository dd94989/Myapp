package com.hemaolin.springcloud.dao;

import com.hemaolin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScans;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-10- 17- 16:50
 */
@Mapper
public interface PaymentDao {
   public int create(Payment payment);
   public Payment getPaymentById(@Param("id")Long id);
}
