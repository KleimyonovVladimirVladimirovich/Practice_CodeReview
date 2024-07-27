import java.util.LinkedList;
import java.util.List;

public class Collection {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(0, 2);
        System.out.println(list);
        System.out.println(list.indexOf(2));
        System.out.println(list.indexOf(1));


        //Стереть ниже
        new Thread(() -> {

        }
        ).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }
        ).start();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        thread1.start();
    }
}
class MyThread implements Runnable {

    @Override
    public void run() {

    }
}



//элька дружит с Лизой.




