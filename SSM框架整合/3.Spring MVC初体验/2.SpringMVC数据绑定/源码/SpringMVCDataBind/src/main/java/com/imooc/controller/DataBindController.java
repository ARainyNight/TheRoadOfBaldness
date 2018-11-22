package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 *  ClassName : DataBindController
 *  Author    : lin
 *  Date      : 2018/11/22 10:13    
 *  Remark    : 
 */

@Controller
public class DataBindController {

    @RequestMapping(value = "/baseType")
    @ResponseBody
    public String baseType(@RequestParam(value = "id") int id){
        return "id:"+id;
    }


    @RequestMapping(value = "/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value = "id") Integer id){
        return "id:"+ id ;
    }


    @RequestMapping(value = "/arrayType")
    @ResponseBody
    public String arrayType(String[] name){
          StringBuffer sbf = new StringBuffer();
        for (String item:
             name) {
            sbf.append(item).append(" ");
        }
        return sbf.toString();
    }

}
