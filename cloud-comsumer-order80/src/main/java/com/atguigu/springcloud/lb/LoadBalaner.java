package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

// 自己做的接口
public interface LoadBalaner {

    ServiceInstance instance(List<ServiceInstance> instances);
}
