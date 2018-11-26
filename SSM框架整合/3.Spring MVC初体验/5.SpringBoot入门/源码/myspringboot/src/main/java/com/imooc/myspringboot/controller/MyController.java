package com.imooc.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 *  ClassName : MyController
 *  Author    : lin
 *  Date      : 2018/11/26 10:18    
 *  Remark    : 
 */

@Controller
public class MyController {

    @RequestMapping("/out")
    @ResponseBody
    public String out() {

        return "success";
    }
}
