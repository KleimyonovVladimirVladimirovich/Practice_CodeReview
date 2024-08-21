package ReflectionAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Person {
    @Name(name = "JRU-0", id = "10")
    private String name;
    public static Thread mythread;
    @Number()
    private List<Integer> id;
    @Name(name = "JRU", id = "11")
    public boolean isMale;
    public static final int MAX_ID = 10000;
    protected int[] MINIMUM = {0};

    public String getName(int a) {
        return name;
    }

    public static Thread compute() throws InterruptedException {
        Runnable r = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        int maxPriority = Thread.MAX_PRIORITY;
        int minPriority = Thread.MIN_PRIORITY;
        Thread thread = new Thread(r);
        List<Thread> threadList = new ArrayList<Thread>();
        threadList.add(thread);
        for (Thread threads : threadList) {
            threads.start();
            for (int i = 0; i < 1; i++) {
                if (threads.isAlive()) {
                    System.out.println("Priority: " + maxPriority);
                } else {
                    System.out.println("Priority: " + minPriority);
                }
            }

        }
        return thread;
    }

    public static void main(String[] args) throws InterruptedException {
            System.out.println("Запуск потоков...");
            System.out.println(compute().getName());
            System.out.println(compute().getName());
            System.out.println(compute().getName());
            System.out.println(compute().getName());
            System.out.println(Thread.currentThread().getName()); //просто main поток
    }
}
