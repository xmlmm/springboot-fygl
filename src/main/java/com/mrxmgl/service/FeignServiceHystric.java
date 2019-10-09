package com.mrxmgl.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements BgtzService {

    /**
     * Hystrix 熔断 返回错误信息
     */
    @Override
    public String hiService(String name) {
        return  name+" hiService error!";
    }
}
