package Thread.ThreadExecutor3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
        List<String> stringList = new ArrayList<>();
        //StringBuilder stringBuffer = new StringBuilder();
        Callable<List<String>> callable = () -> {
            for (int i = 0; i < 50; i++) {
                stringList.add(String.valueOf(i));
            }
            return stringList;
        };

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(runnable); //Ничего не возвращает, в отличие от Callable
        //Future - обертка между List<String>
        Future<List<String>> submit = executorService.submit(callable); //Всегда вызывать Future
        System.out.println(submit.get());


        executorService.shutdown(); //конец работы кеша потоков executorService


        //Скармливаем потокам задачи.

    }
}
