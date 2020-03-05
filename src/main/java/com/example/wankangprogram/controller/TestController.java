package com.example.wankangprogram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuxiaohei
 * @version 1.0
 * @date 2020-02-28 18:46
 */

@RestController
public class TestController {


    @RequestMapping("index")
    public String Index(){

        return "index";
    }

    @RequestMapping("hello")
    public String Hello(){

        return "Hello World";
    }



}
