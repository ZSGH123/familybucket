package com.zkong.familybucket.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * program: familybucket
 * description: 
 * author: zhongqiang@raycloud.com
 * create: 2020-11-12 20:04
 **/
@Controller
@RequestMapping("/outer")
public class HelloController {

    @RequestMapping("/boot")
    @ResponseBody
    public String hello() {
        return "洋哥牛逼!";
    }


}
