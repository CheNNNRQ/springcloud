package com.diodi.springcloud.controller;

import com.diodi.springcloud.bean.CommonResult;
import com.diodi.springcloud.bean.Payment;
import com.diodi.springcloud.service.PaymentService;
import com.diodi.springcloud.service.impl.PaymentServiceImpl;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author diodi
 * @create 2021-06-26-17:46
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    PaymentService paymentService;
    @Resource
    DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/add")
    public CommonResult add(@RequestBody Payment payment) {
        int result = paymentService.add(payment);
        log.info("************结果"+result);
        if(result>0) {
            return new CommonResult(200 , "成功"+serverPort , result);
        } else {
            return new CommonResult(400 , "失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("************结果haha"+payment);

        if(null != payment) {
            return new CommonResult(200 , "成功"+serverPort , payment);
        } else {
            return new CommonResult(400 , "失败");
        }
    }

    @GetMapping("payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for(String service : services) {
            log.info("****************"+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getUri());

        }
        return discoveryClient;
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;//返回服务接口
    }
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "hi ,i'am paymentzipkin server fall back，welcome to here, O(∩_∩)O哈哈~";
    }
}
