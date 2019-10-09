package com.mrxmgl.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/7/15 0015.
 */
@FeignClient(value = "springboot-wlw", path="wlw/", fallback = FeignServiceHystric.class)//定义feign的客户端
public interface BgtzService {

    @RequestMapping(path = "/wlw/ryxx/browse", method= RequestMethod.POST, consumes = {"application/json;charset=UTF-8"}, produces= {"application/json;charset=UTF-8"})
     String hiService(@RequestParam(value = "name") String name);
}