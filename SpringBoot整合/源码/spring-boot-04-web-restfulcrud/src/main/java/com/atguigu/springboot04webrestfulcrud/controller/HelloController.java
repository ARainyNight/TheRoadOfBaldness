package com.atguigu.springboot04webrestfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 *  ClassName : HelloController
 *  Author    : lin
 *  Date      : 2018/12/12 11:06    
 *  Remark    : 
 */

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "helloWorld";
    }
}
