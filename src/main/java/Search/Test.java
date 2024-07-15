package Search;

public class Test {

    /*public static void main(String[] args) {
        int index = linerSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99,54,8790,12,3464,780,234}, 89);
        print(89, index);
    }

    public static int linerSearch(int[] array, int elementToSearch) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == elementToSearch)
                return index;
        }
        return -1;
    }

        public static void print (int elementToSearch, int index){
            if (index == -1) {
                System.out.println(elementToSearch + " не был найден. Попробуйте добавить элементы в массив.");
            } else {
                System.out.println(elementToSearch + " был найден с " + index + ".");
            }
        }*/ //complete 1 (LinearSearch)

    /*public static void main(String[] args) {
        int index = linearSearch(new int[]{1,2,3,4,5,6,7,8,9,0}, 0);
        ArraySeachPrint(0,index);
        int index1 = linearSearch(new int[]{1,2,3,4,5,6,7,8,9,0}, 9);
        ArraySeachPrint(9,index1);
        int index2 = linearSearch(new int[]{1,2,3,4,5,6,7,8,9,0}, 8);
        ArraySeachPrint(8,index2);
        int index3 = linearSearch(new int[]{1,2,3,4,5,6,7,8,9,0}, 7);
        ArraySeachPrint(7,index3);

    }

    public static int linearSearch(int[] Array, int elementToSearch) {
        for (int index = 0; index < Array.length; index++) {
            if (Array[index] == elementToSearch)
                return index;
        }
        return -1;
    }

    public static void ArraySeachPrint(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println("Элемент не найден");
        }
        else {
            System.out.println(elementToSearch + " found in :  " + index);
        }
    } */ //complete 2 (LinearSearch)

    /*public static void main(String[] args) {
      int index = recursiveBinarySearch(new int[]{1,23,54,67,89,121,143,156,178,199,200},0,11,67);
      print(67,index);
    }

    public static int recursiveBinarySearch(int[] array, int firstElement, int lastElement, int elementToSearch) {
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (array[mid] == elementToSearch)
                return mid;

            if (array[mid] > elementToSearch)
                return recursiveBinarySearch(array, firstElement, mid - 1, elementToSearch);
            else
              return recursiveBinarySearch(array, mid+1, lastElement, elementToSearch);

            }
            return -1;
        }

        public static void print (int elementToSearch, int index) {
         if (index == -1) {
             System.out.println("element is not found");
         }
         else {
             System.out.println(elementToSearch + " is most of " + index);
         }

    }*/ //binarySearch

}
