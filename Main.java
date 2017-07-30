/**
 * Created by dell on 2017/7/30.
 */
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Main {
    public static void main(String[] args) {
        threaddemo t = new threaddemo();
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        // 将线程放入池中进行执行
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        // 关闭线程池
        pool.shutdown();
    }
}