package Concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Начинаем работу потоков!");

        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        //БЛОКИРУЮЩАЯ ОЧЕРЕДЬ ПРИМЕР

        new Thread() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        arrayBlockingQueue.put(i);
                        System.out.println("Java эл. " + i + " добавлен!");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();


        new Thread() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("Java эл. " + arrayBlockingQueue.take() + " забрал");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();



    }
}
