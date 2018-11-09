package com.hn.ioc.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/***
 *  ClassName : Man
 *  Author    : lin
 *  Date      : 2018/11/9 15:01    
 *  Remark    : 
 */

public class Man implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    public void setName(String name) {
        System.out.println("第二步：设置属性");
        this.name = name;
    }

    public Man(){
        System.out.println("第一步：Man被实例化");
    }

    public void setup(){
        System.out.println("第七步：man被初始化");
    }

    public void teardown(){
        System.out.println("第十一步：Man被销毁了");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("第三步：设置Bean的名称 ---id的值："+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：了解工厂的信息");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置后");
    }

    public void run(){
        System.out.println("第九步：执行自身业务方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步：执行Spring的销毁方法");
    }
}
