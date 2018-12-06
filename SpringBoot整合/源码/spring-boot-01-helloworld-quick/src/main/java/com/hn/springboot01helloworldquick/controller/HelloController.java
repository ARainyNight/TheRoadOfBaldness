package com.hn.springboot01helloworldquick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/***
 *  ClassName : HelloController
 *  Author    : lin
 *  Date      : 2018/12/6 8:44    
 *  Remark    : 
 */

//这个类的所有方法返回的数据直接写给浏览器（如果是对象还能转成json数据）
//@ResponseBody
//@Controller
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "阿飞";
    }
}
