package Search;

public class binarySearch {
    public static void main(String[] args) {
        int index = BinarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 27);
        print(27, index);
    }
    public static int BinarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

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
