package sleep;

/***
 *  ClassName : MyThread1
 *  Author    : lin
 *  Date      : 2018/12/10 21:09    
 *  Remark    : 
 */

public class MyThread1 extends Thread{

    @Override
    public void run() {
        try{
            System.out.println("run threadName="+this.currentThread().getName()+"begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+"end");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
