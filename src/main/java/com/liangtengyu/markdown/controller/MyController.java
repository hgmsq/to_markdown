package com.liangtengyu.markdown.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/test")
    public String test1(){
        return "test";
    }
}
