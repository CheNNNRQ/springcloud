package com.diodi.springcloud.service.impl;

import com.diodi.springcloud.bean.Payment;
import com.diodi.springcloud.dao.PaymentDao;
import com.diodi.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author diodi
 * @create 2021-06-26-17:38
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    public int add(Payment payment){
        return paymentDao.add(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
