package sleep;

/***
 *  ClassName : Run1
 *  Author    : lin
 *  Date      : 2018/12/10 21:11    
 *  Remark    : 
 */

public class Run1 {
    public static void main(String []args){
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin="+System.currentTimeMillis());
        myThread1.run();
        System.out.println("end ="+System.currentTimeMillis());
    }
}
