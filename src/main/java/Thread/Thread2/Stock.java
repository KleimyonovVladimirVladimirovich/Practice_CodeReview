package Thread.Thread2;
import java.util.ArrayList;
import java.util.List;

public class Stock {
    public volatile static Integer fee = 0; //komissia

    public static final Object monitor = new Object(); //вот так всегда должен выглядеть мютабл (static final)

    public static void main(String[] args) throws InterruptedException {

        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Task task = new Task();
            tasks.add(task);
            task.start();
           // System.out.println(Stock.fee);

        }
        System.out.println("All started");
        for (Task task: tasks) {
           task.join();
        }
        System.out.println(fee);
        System.out.println("end");
    }

}
class Task extends Thread {
    public void run() {
        //Class<Stock> stockClass = Stock.class;
        synchronized (Stock.monitor) { //Ждет объект монитора (не принимает примитивы)
            Stock.fee+=getOneFee();
        }

       // Stock.fee+=getOneFee(); //блок мьютабл
    }
    private Integer getOneFee() {
        return 1;
    }
}
