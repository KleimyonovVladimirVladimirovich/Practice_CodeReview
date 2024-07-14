package Search;
//  /////
//    Временная сложность линейного поиска равна O(N). (Практически не используется)
//  /////
public class LinearSearch {

    public static void main(String[] args) {
        int index0 = linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 89);
        print(89, index0);
        int index1 = linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 57);
        print(57, index1);
        int index2 = linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 91);
        print(91, index2);
        int index3 = linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 47);
        print(47, index3);
        int index4 = linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 95);
        print(95, index4);
    }
    public static int linearSearch(int[] arr, int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }
    public static void print(int elementToSearch, int index) {
        if (index == -1){
            System.out.println(elementToSearch + " not found.");
        }
        else {
            System.out.println(elementToSearch + " found at index: " + index);
        }
    }
}
