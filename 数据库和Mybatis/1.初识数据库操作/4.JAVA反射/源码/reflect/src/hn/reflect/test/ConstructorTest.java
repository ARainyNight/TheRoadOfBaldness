package hn.reflect.test;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ConstructorTest {

    @Test
    /***
     *获得无参数的构造方法
     */
    public void demo1() throws Exception {
        Class class1 =Class.forName("hn.reflect.test.Person");
        Constructor c = class1.getConstructor();
        Person person = (Person)c.newInstance();  // Person person = new Person();
        person.eat();
    }

    @Test
    /**
     * 获得有参数的构造方法
     * */
    public void demo2() throws Exception {
        Class class2 = Class.forName("hn.reflect.test.Person");
        Constructor c = class2.getConstructor(String.class,String.class);
        Person person = (Person) c.newInstance("张三","男");   // Person person = new Person(String name,String sex);
      System.out.println(person);
    }
}
