package Thread.ThreadExecutor3.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {

    public static void main(String[] args) throws Exception {
        MyCall myCall = new MyCall("Hello ");
        //myCall.call(); // main
        //System.out.println(call);

        // Execute - .exe

        //ПУЛ ПОТОКОВ
        //НЕ ПРЕКРАЩАЕТ САМА РАБОТУ
        ExecutorService executorService = Executors.newFixedThreadPool(10); //Создание пула потоков

        MyCall myCall1 = new MyCall("F");
        MyCall myCall2 = new MyCall("S");
        MyCall myCall3 = new MyCall("T");


        Future<String> submit1 = executorService.submit(myCall1);
        submit1.get();
        Future<String> submit2 = executorService.submit(myCall2);
        submit2.get();
        Future<String> submit3 = executorService.submit(myCall3);
        submit3.get();



        for (int i = 0; i < 25; i++) {
            Future<String> submit = executorService.submit(new MyCall(String.valueOf(i)));
            System.out.println(submit.get());

        }
    }
}
