package Thread.ThreadExecutor3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrioritiesFibonacchi {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\nProcess...");
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Thread thread = new Thread(PrioritiesFibonacchi::doLongTime);
            if (new Random().nextBoolean()) {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            threadList.add(thread);
        }
        for (Thread thread : threadList){
            thread.start();
        }

        for (Thread thread: threadList) {
            thread.join();  //дожидаемся выполнения потоков, потом выводим остатки потока main снизу
        }

        System.out.println("\nMain is finished");
    }

    private static void doLongTime() {
        long startTime = System.currentTimeMillis();
        long fibonacci = fib(40);
        long finishTime = System.currentTimeMillis();
        System.out.println("Thread name - " + Thread.currentThread().getName()
                + "\nPriority is - " + Thread.currentThread().getPriority()
                + "\nFibonacci - " + fibonacci
                + "\nDuration -" + (finishTime - startTime) + " ms.");
    }
    // 55 -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
    private static long fib(int n) {
        if (Thread.currentThread().isInterrupted()) {
            return -1;
        }
        if (n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
        //fib(5) -> fib(4) + fib(3) - >
        //                          fib(4) = fib(3) + fib(2) -> fib(2) + fib(1) && fib(1) + fib(0) -> fib(0) + fib(1)
        //                          fib(3) = fib(2) + fib(1) && fib(1) + fib(0) -> fib(0) + fib(1)
    }
}