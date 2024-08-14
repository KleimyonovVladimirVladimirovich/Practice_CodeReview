package Concurrent;

import java.util.concurrent.SynchronousQueue;

public class SyncronousQueue {

    public static void main(String[] args) {
        //СОЗДАЛИ СИНХРОННУЮ ОЧЕРЕДЬ
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();

        Thread producer = new Thread("ПРОИЗВОДИТЕЛЬ") {
            public void run() {
                String event = "СОБЫТИЕ";
                System.out.println("Событие: " + Thread.currentThread().getName() + " " + event);
                try {
                    synchronousQueue.put(event); //тред заблокируется в этой точке
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        producer.start();
        //ПОТРЕБИТЕЛЬ ВЫТАСКИВАЕТ ИЗ ОЧЕРЕДИ
        Thread consumer = new Thread("ПОТРЕБИТЕЛЬ") {
            public void run() {
                try {
                    String event = synchronousQueue.take(); //тред заблокируется в этой точке
                    System.out.println("Вывод: " + Thread.currentThread().getName() + " " + event);

                }catch (InterruptedException e) {
                    e.getStackTrace();
                }
            }
        };
        consumer.start();
    }


}
