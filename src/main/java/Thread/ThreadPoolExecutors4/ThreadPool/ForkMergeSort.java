package Thread.ThreadPoolExecutors4.ThreadPool;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkMergeSort extends RecursiveTask<int[]> {
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

        }
     return compute();
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

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkMergeSort forkMergeSort = new ForkMergeSort(arr);
        arr = forkJoinPool.invoke(forkMergeSort);
        System.out.println(Arrays.toString(arr));
    }
}
