package com.diodi.springcloud.dao;

import com.diodi.springcloud.bean.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author diodi
 * @create 2021-06-26-16:42
 */
@Mapper
public interface PaymentDao {
    /**
     * 添加
     * @param payment
     * @return
     */
    int add(Payment payment);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
