import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.*;

class Solution {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<int[]> callable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int low = 1;
            int high = 100;
            int maxsize = 100;

            int[] array = new Random()
                    .ints(low,high)
                    .limit(maxsize)
                    .toArray();
            for (int i = 0; i < 1; i++) {
                Arrays.sort(array);
                System.out.println(Arrays.toString(array));
            }
            return array;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<int[]> future = executorService.submit(callable);
        future.get();
        executorService.shutdown();
    }
}

