package com.atguigu.springboot04webrestfulcrud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/***
 *  ClassName : MyMvcConfig
 *  Author    : lin
 *  Date      : 2018/12/15 11:00    
 *  Remark    : 
 */

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        //浏览器发送 /atguigu也可以跳转到success界面
        registry.addViewController("/atguigu").setViewName("success");
    }
}
