package Thread.ThreadPoolExecutors4.ThreadPool;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.*;

public class ForkMergeSort extends RecursiveTask<int[]>  {
    private final int[] array;

    public ForkMergeSort(int[] array) {
        this.array = array;
    }

    protected int[] compute() {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            ForkMergeSort rightMerge = new ForkMergeSort(right);
            ForkMergeSort leftMerge = new ForkMergeSort(left);

            rightMerge.fork();
            leftMerge.fork();
            
            //MERGE
            for (int i = 0, il = 0, jr = 0; i < array.length; i++) {
                array[i] = jr == right.length || (il < left.length && left[il] < right[jr]) ? left[il++] : right[jr++];
            }

        }
     return array;
    }


}

class Run {
    public static void main(String[] args) {
        int maxSize = 100;
        int low = 0;
        int high = 400;
        int[] arr = new Random()
                .ints(low,high)
                .limit(maxSize)
                .toArray();

        try {
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            ForkMergeSort forkMergeSort = new ForkMergeSort(arr);
            arr = forkJoinPool.invoke(forkMergeSort);
            System.out.println(Arrays.toString(arr));
        } catch (Exception e) {
            e.getStackTrace();
        }


//        ForkMergeSort forkMergeSort = new ForkMergeSort(arr);
//        arr = forkJoinPool.invoke(forkMergeSort);
//        System.out.println(Arrays.toString(arr));
    }
}

class Test implements Callable<int[]> {
    @Override
    public int[] call() throws Exception {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int low = 1;
        int high = 100;
        int maxsize = 100;

        int[] arr = new Random()
                .ints(low,high)
                .limit(maxsize)
                .toArray();
        for (int i = 0; i < 1; i++) {
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
