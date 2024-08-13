package Thread.ThreadPoolExecutors4;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicDemo extends Thread{

    public static final AtomicInteger atomicService = new AtomicInteger(0);
    public static final AtomicReference<Phase> phase = new AtomicReference<>(Phase.NEW);

    @Override
    public void run() {
        System.out.println("Step 0: " + phase + " ");
        if (!phase.compareAndSet(Phase.NEW,Phase.INITIALIZING)) { //Пускает только один поток, а другие улетают в исключение
            throw new IllegalStateException("Already initialized.");
        }
        System.out.println("Step 1: " + phase);
        Phase prev = phase.getAndSet(Phase.INITIALIZED);
        System.out.println("Step 2: " + phase + " prev: " + prev );
        //Integer integer = atomicService.incrementAndGet(); //or getAddAdd(delta:1)
        atomicService.getAndAdd(1);
        System.out.println(atomicService.get());
    }

    public static void main(String[] args) throws InterruptedException {

        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new AtomicDemo());
            list.get(i).start();
        }

        for (Thread lists : list) lists.join(); {
            System.out.println("Atomic count: " + atomicService);
        }
    }
}
enum Phase {
    NEW, INITIALIZING, INITIALIZED
}