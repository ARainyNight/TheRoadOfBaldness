package hn.reflect.test;

public class Person {

    public String name;
    private String sex ;

    public Person() {
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }

    public void eat(){
        System.out.println("eat吃。。。。。。");
    }

    private void run(){
        System.out.println("跑。。。。。");
    }

    public String sayHello(String name){
       return "hello"+name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
