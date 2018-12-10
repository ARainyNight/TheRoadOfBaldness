package sleep;

/***
 *  ClassName : Run2
 *  Author    : lin
 *  Date      : 2018/12/10 21:24    
 *  Remark    : 
 */

public class Run2 {
    public static void main(String []args){
        MyThread2 myThread2 = new MyThread2();
        System.out.println("begin="+System.currentTimeMillis());
        myThread2.start();
        System.out.println("end = "+System.currentTimeMillis());
    }
}
