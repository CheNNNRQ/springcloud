package com.diodi.springcloudAlibaba.controller;

import com.diodi.springcloudAlibaba.domain.CommonResult;
import com.diodi.springcloudAlibaba.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author diodi
 * @create 2021-07-22-16:36
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId , Integer count) {
        storageService.decrease(productId , count);
        return new CommonResult(200 , "扣减库存成功！");
    }
}
