package Search;

public class binarySearch {
    public static void main(String[] args) {
        int index = recursiveBinarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99},0,10, 27);
        print(27, index);
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
