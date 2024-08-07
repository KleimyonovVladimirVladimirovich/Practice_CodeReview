import java.util.Scanner;

public class SolutionYandex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(ToSum(A, B));
    }
    public static int ToSum(int A, int B) {
        return A + B;
    }
}
