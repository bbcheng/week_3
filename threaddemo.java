/**
 * Created by dell on 2017/7/30.
 */

public class threaddemo implements Runnable{
    private int sum = 500;
    Object obj = new Object();
    public void run(){
        while(true){
            synchronized (obj) {

                if (sum > 0)
                    System.out.println(Thread.currentThread().getName() + "---" + sum--);
            }
        }
    }

}
