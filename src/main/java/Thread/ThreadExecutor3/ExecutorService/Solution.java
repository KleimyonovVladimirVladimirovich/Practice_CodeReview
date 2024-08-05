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
        ExecutorService executorService = Executors.newFixedThreadPool(1); //Создание пула потоков

        for (int i = 0; i < 25; i++) {
            Future<String> submit = executorService.submit(new MyCall(String.valueOf(i)));
           // System.out.println(submit.get());

        }
    }
}
