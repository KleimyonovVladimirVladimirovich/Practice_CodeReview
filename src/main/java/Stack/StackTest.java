package Stack;

public class StackTest {
    public static void main(String[] args) {
        testQueue();
    }
    public static void testQueue() {
        SimpleQueue<Integer> list = new SimpleQueue<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            list.add(i);

        }
    }
}
