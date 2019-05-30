package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(value = "baseType")
    @ResponseBody
    public String baseType(int age){
        return "收到年龄：" + age;
    }
}
