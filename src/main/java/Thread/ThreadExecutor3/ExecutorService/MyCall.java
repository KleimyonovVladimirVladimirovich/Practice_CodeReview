package Thread.ThreadExecutor3.ExecutorService;

import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class MyCall implements Callable<String> {

    private final String s;

    public MyCall(String s) {
         this.s = s;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Работает поточный объект impl Callable " + s);
        return s;
    }
}
