package Search;

public class binarySearch {
    public static void main(String[] args) {

        int index = recursiveBinarySearch(new int[]{1,2,4,10,15,19,21,25,29,30,34,36,37,39,50,57,58,60,70},0,19, 50);
        print(50, index);
    }
    public static int recursiveBinarySearch(int[] arr, int firstElement, int lastElement, int elementToSearch) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[mid] == elementToSearch)
                return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }
    public static void print(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println("element is not found");
        }
        else {
            System.out.println(elementToSearch + " is index : " + index);
        }
    }
}
