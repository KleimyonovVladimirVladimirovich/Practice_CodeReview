package Thread.ThreadPoolExecutors4.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduled {
    public static void main(String[] args) {
        ScheduledExecutorService myExecute = Executors.newScheduledThreadPool(3);
//ВОЗМОЖНО ВЫДЕЛИТЬ СКОЛЬКО МОЖНО ЯДЕР И УСТАНОВИТЬ ПО РАСПИСАНИЮ
        //ПОХОЖ НА FIXED НО С РАСПИСАНИЕМ НА СКОЛЬКО УГОДНО ВРЕМЕНИ

        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " " + (Long.MAX_VALUE % Long.MIN_VALUE));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        for (int i = 0; i < 50; i++) {
            //ЗАДЕРЖКА
            // TimeUnit.HOUR/DAY..
            myExecute.schedule(r, 1, TimeUnit.MICROSECONDS);
        }
        myExecute.shutdown();

    }
}
