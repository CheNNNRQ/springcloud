package com.diodi.springcloudAlibaba.service;

import com.diodi.springcloud.bean.CommonResult;
import com.diodi.springcloud.bean.Payment;
import com.diodi.springcloudAlibaba.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author diodi
 * @create 2021-07-21-16:47
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
