package com.diodi.springcloud.service;

import com.diodi.springcloud.bean.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author diodi
 * @create 2021-06-26-17:37
 */
public interface PaymentService {
    int add(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
