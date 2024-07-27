package Thread;

public class SolutionThreadSyntaxSugar {
    public static void main(String[] args) {
//примеры вызова нитей
         MyThread myThread = new MyThread();
         //myThread.run(); //main
         myThread.start(); //thread 0

        Counter counter = new Counter(); //impl Runnable
        Thread thread = new Thread(counter);
        thread.start();

        //ЧЕРЕЗ АНОНИМ КЛАСС
        Runnable Run = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 101; i++) {
                    System.out.println(i + " : yep" + " and thread :" + Thread.currentThread().getName());
                }
            }
        };
        new Thread(Run).start();

        //через аноним класс вложенный в конструктор нити
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 401; i < 500; i++) {
                            System.out.println(i + " : yep" + " and thread :" + Thread.currentThread().getName());
                        }
                    }
                }
        ).start();

        //ЧЕРЕЗ ЛЯМБДУ
        new Thread(() -> {
            for (int i = 501; i < 600; i++) {
                System.out.println(i + " : yep" + " and thread :" + Thread.currentThread().getName());
            }
        }
        ).start();


        //Thread thread = Thread.currentThread();
        //System.out.println(thread.getName());
        for (int i = 102; i < 200; i++) {
            System.out.println(i + " : yep" + " and thread :" + Thread.currentThread().getName());
        }

    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 201; i < 300; i++) {
            System.out.println(i + " : yep" + " and thread :" + Thread.currentThread().getName());
        }
    }
}

class Counter implements Runnable {
    @Override
    public void run() {
        for (int i = 301; i < 400; i++) {
            System.out.println(i + " : yep" + " and thread :" + Thread.currentThread().getName());
        }
    }
}
