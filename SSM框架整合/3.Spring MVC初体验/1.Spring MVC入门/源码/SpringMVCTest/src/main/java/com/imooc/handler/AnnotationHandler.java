package com.imooc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/***
 *  ClassName : AnnotationHandler
 *  Author    : lin
 *  Date      : 2018/11/21 21:21    
 *  Remark    : 基于注解
 */

@Controller
public class AnnotationHandler {


    /**
     * 业务方法:ModelAndView完成数据的传递，视图的解析
     */
    @RequestMapping("/modelAndViewTest")
    public ModelAndView modelAndViewTest(){
        //创建ModelAndView对象
        ModelAndView modelAndView=  new ModelAndView();
        //填充模型数据
        modelAndView.addObject("name","xiaoma");
        //设置逻辑视图
        modelAndView.setViewName("show");
        return modelAndView;
    }


    /**
     * 业务方法：Model传值，String进行视图解析
     */
    @RequestMapping("/ModerTest")
    public String ModerTest(Model model){
        //填充模型数据
        model.addAttribute("name","xiaobai");
        //设置逻辑视图
        return "show";
    }

    /**
     * 业务方法：Map传值，String进行视图解析
     */
    @RequestMapping("/MapTest")
    public String MapTest(Map<String,String> map){
        //填充模型数据
        map.put("name","xiaozhang");
        //设置逻辑视图
        return "show";
    }


}
