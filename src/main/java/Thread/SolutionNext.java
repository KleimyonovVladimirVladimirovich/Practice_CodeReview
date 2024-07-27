package Thread;

import javax.management.loading.ClassLoaderRepository;

public class SolutionNext {
    //пример кода
    public static void main(String[] args) throws InterruptedException {

        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();
        Thread.sleep(2000);
        //clockThread.interrupt();


       /* Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        System.out.println(clockThread.getName());
        new Thread(() -> {
            try {
                clockThread.start();
                Thread.sleep(2000);
               // clockThread.interrupt();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }).start(); */


    }
}

class Clock implements Runnable {
    @Override
    public void run() {
        Thread curr = Thread.currentThread();
        while (!curr.isInterrupted()) {
            try {
                Thread.sleep(1000);
                System.out.println("Tick");
            }
            catch (InterruptedException e) {
                e.getStackTrace();
                //curr.interrupt(); //остановка
            }
        }
        System.out.println("Tick");

    }
}
