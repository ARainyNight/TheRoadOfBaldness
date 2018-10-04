package hn.reflect.test;

import org.junit.Test;

public class ClassTest {

    @Test
    /**
     * 获得Class对象
     * 1、通过类名.class();
     * 2.对象.getClass();
     * 3.Class.forName();
     * */
    public void demo1() throws ClassNotFoundException {
        //1
        Class class1 =Person.class;
        //2
        Person person = new Person();
        Class class2 = person.getClass();
        //3
        Class class3 = Class.forName("hn.reflect.test.Person");
    }
}
