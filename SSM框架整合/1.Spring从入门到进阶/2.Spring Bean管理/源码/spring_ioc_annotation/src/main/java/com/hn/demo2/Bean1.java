package com.hn.demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/***
 *  ClassName : Bean1
 *  Author    : lin
 *  Date      : 2018/11/9 20:12    
 *  Remark    : 
 */

@Component("bean1")
public class Bean1 {

    @PostConstruct
    public void init(){
        System.out.println("init bean");
    }

    public void say(){
        System.out.println("say...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Destory bean");
    }
}
