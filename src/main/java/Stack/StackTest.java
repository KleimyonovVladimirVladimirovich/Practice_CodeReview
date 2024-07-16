package Stack;

public class StackTest {
    public static void main(String[] args) {
        testStack();
    }
    public static void testQueue() {
        SimpleQueue<Integer> list = new SimpleQueue<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            list.add(i);

        }
        System.out.println("\n");

        while (!list.isEmpty()) {
            System.out.println(list.remove());
        }
    }

    public static void testStack() {
        SimpleStack<Integer> stack = new SimpleStack<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            stack.push(i);
        }
        System.out.println("\n");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
