package Thread.ThreadPoolExecutors4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //МОЖНО ПЕРЕОПРЕДЕЛИТЬ ФУНКЦИОНАЛЬНЫЙ ИНТЕРФЕЙС ЧЕРЕЗ ЛЯМБДУ НАЧИНАЯ С JAVA 8
//        Callable<Integer> callable = () -> {
//            Thread.sleep(1000);
//            return 440;
//        };
        Callable<Integer> callable = new Callable() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(1000);
                return 440;
            }
        };

        //FUTURETAST НАСЛЕДНИК FUTURE, РАБОТАЕТ БЕЗ ЭКЗЕКЬЮТОРА ЕГО НАДО ЗАПУСКАТЬ ПЕРЕДАВ CALLABLE
        //ПРИНИМАЕТ В СЕБЯ ОДИН ПОТОК И ПОЛНОСТЬЮ ЗАКРЫВАЕТСЯ НА ВРЕМЯ ЕГО РАБОТЫ.
        //ИМЕЕТ ВСТРОЕННЫЙ МЕТОД JOIN()
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        futureTask.run();

        try {
            System.out.println("Result: " + futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
