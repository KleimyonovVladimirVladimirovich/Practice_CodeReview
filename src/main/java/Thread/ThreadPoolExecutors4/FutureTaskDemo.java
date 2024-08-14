package Thread.ThreadPoolExecutors4;

import java.util.concurrent.*;

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
            System.out.println("Result for FutureTask: " + futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        //ПРИМЕР FUTURE ЧЕРЕЗ ExecutorService
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future = executorService.submit(callable);
        System.out.println("Result for Future: " + future.get());
        executorService.shutdown();

    }
}
