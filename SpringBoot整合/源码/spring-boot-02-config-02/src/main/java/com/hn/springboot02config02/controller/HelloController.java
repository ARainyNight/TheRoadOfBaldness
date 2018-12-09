package com.hn.springboot02config02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *  ClassName : HelloController
 *  Author    : lin
 *  Date      : 2018/12/9 11:18    
 *  Remark    : 
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
