package Thread.ThreadPoolExecutors4.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fixed {
    public static void main(String[] args) {
        ExecutorService myExecute = Executors.newFixedThreadPool(10);
//ПО 10 ПОТОКОВ СОЗДАЕМ И ЩЕЛКАЕМ (ЗНАЧЕНИЕ nThreads)
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " " + (Long.MAX_VALUE % Long.MIN_VALUE));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        for (int i = 0; i < 20; i++) {
            myExecute.submit(r);
        }
        myExecute.shutdown();
    }
}
