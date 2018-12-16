package com.atguigu.springboot.config;

import com.atguigu.springboot.component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/***
 *  ClassName : MyMvcConfig
 *  Author    : lin
 *  Date      : 2018/12/15 11:00    
 *  Remark    : 
 */

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
    //使用@EnableWebMvc全面接管SpringMVC
//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        //浏览器发送 /atguigu也可以跳转到success界面
        registry.addViewController("/atguigu").setViewName("success");
    }


    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean  //将组件注册到容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
       WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
           @Override
           public void addViewControllers(ViewControllerRegistry registry) {
               registry.addViewController("/").setViewName("login");
               registry.addViewController("/index.html").setViewName("login");
           }
       };
       return adapter;
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }
}
