package com.hn.config.config;

import com.hn.config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 *  ClassName : MyAppConfig
 *  Author    : lin
 *  Date      : 2018/12/7 17:18    
 *  Remark    : 
 */

/**
 * @Configuration:指明当前类是一个配置类，就是来替代之前的Spring配置文件
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中：容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new HelloService();
    }
}
