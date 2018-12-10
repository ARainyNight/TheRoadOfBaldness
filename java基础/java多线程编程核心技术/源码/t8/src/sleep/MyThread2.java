package sleep;

/***
 *  ClassName : MyThread2
 *  Author    : lin
 *  Date      : 2018/12/10 21:22    
 *  Remark    : 
 */

public class MyThread2 extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("run threadName = "+this.currentThread().getName()+"begin="
            + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName = "+this.currentThread().getName()+"end="
                    + System.currentTimeMillis());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
