package hn.reflect.test;

import org.junit.Test;

import java.lang.reflect.Method;

public class MethodTest {
    @Test
    /**
     * 测试公有方法
     * */
    public void demo1() throws Exception {
        Class class1 = Class.forName("hn.reflect.test.Person");

        //实例化
        Person person = (Person) class1.newInstance();
        //获得公有的方法
        Method method = class1.getMethod("eat");

        //执行方法
        method.invoke(person);   //person.eat();
    }

    @Test
    /**
     * 测试私有方法
     * */
    public void demo2() throws Exception {
        Class class2 = Class.forName("hn.reflect.test.Person");

        //实例化
        Person person = (Person) class2.newInstance();

        Method method = class2.getDeclaredMethod("run");

        //设置私有的属性的访问权限
        method.setAccessible(true);

        //执行方法
        method.invoke(person);
    }

    @Test
    /**
     * 测试私有的方法带参数
     * */
    public void demo3() throws Exception {
        Class class3 = Class.forName("hn.reflect.test.Person");

        //实例化
        Person person = (Person) class3.newInstance();

        //获得方法
        Method method = class3.getDeclaredMethod("sayHello", String.class);

        //设置访问权限
        method.setAccessible(true);

        Object obj =method.invoke(person,"TOM");
        System.out.println(obj);
    }
}
