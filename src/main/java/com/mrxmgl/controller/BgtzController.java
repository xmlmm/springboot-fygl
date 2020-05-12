package com.mrxmgl.controller;

import com.mrxmgl.service.BgtzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bgtz")
public class BgtzController {

    @Autowired
    private BgtzService bgtzService;

    @RequestMapping(value = "/browse")
    public String browse(){
        System.out.println("request-----");
        System.out.println("request123-----");
//        try {
//            Thread.sleep(100000);
//        }catch (Exception e){
//            System.out.println(" hello two error"+e);
//        }
        return bgtzService.hiService("你好--");
    }

    /**
     * admin服务测试调用此方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/testFeign")
    public String testFeign(String name){
        System.out.println("testFeign：调用成功");
        return name+"--------------调用成功";
    }

}