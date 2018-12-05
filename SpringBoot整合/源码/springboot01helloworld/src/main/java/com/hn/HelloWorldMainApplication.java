package com.hn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 *  ClassName : HelloWorldMainApplication
 *  Author    : lin
 *  Date      : 2018/12/5 10:05    
 *  Remark    : 
 */

/**
 * @SpringBootApplication:来标注一个主程序类，说明这是一个SpringBoot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String []args){

        SpringApplication.run(HelloWorldMainApplication.class,args);

    }
}
