package SortAlgoritms;

import java.util.Arrays;

public class Sort {
    //***
    //Fast Sort
    //***
    public static void main(String[] args) {
        int[] array ={9,5,7,4,6,0,1,3,2};
        int temp;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i+1]) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                System.out.println(Arrays.toString(array));
            }
        }



    }
}
