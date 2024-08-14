package Thread.ThreadPoolExecutors4.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Single {
    public static void main(String[] args) {
        ExecutorService myExecute = Executors.newSingleThreadExecutor();
//ПО ОЧЕРЕДИ
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " " + (Long.MAX_VALUE % Long.MIN_VALUE));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        for (int i = 0; i < 50; i++) {
            myExecute.submit(r);
        }
        myExecute.shutdown();


    }
}
