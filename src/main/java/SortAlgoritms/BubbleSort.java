package SortAlgoritms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{54, 123, 78, 23, 45, 9, 23, 76, 12, 4, 87, 34, 23, 98, 45, 3, 8, 5, 6, 7, 23, 57, 9, 100};
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
