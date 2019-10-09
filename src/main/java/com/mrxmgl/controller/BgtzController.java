package com.mrxmgl.controller;

import com.mrxmgl.service.BgtzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2019/7/12 0012 09:32
 */
@RestController
@RequestMapping(value = "/fygl/bgtz")
public class BgtzController {

    @Autowired
    private BgtzService bgtzService;

    @RequestMapping(value = "/browse")
    public String browse(){
        String aa = bgtzService.hiService("你好--");
        return aa;
    }

    @RequestMapping(value = "/index")
    public String index(Model model) {
        System.out.println("index------");
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(Model model) {
        System.out.println("login------");
        return "index";
    }
}