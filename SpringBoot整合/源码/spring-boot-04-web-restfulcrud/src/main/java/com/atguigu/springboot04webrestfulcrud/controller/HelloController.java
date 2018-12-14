package com.atguigu.springboot04webrestfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

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

    //查出一些数据，在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","小飞");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
}
