package com.diodi.springcloudAlibaba.service.impl;

import com.diodi.springcloud.bean.CommonResult;
import com.diodi.springcloud.bean.Payment;
import com.diodi.springcloudAlibaba.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author diodi
 * @create 2021-07-21-16:49
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
