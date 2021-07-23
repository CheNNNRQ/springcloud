package com.diodi.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author diodi
 * @create 2021-07-10-12:17
 */
public interface LoadBanlancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
