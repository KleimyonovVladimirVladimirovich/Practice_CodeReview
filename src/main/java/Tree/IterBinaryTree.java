package Tree;

import Stack.SimpleStack;

public class IterBinaryTree {
    public static void main(String[] args) {

        tree root =
                new tree(20,
                        new tree(7,
                                new tree(4, null,new tree(6)), new tree(9)),
                        new tree(35,
                                new tree(31,new tree(28), null),
                                new tree(40,
                                        new tree(38),
                                        new tree(52))));

        System.out.println(tree.sumDeep(root));
    }
    static class tree {
        int value;
        tree left;
        tree right;

        public tree(int value, tree left, tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public tree(int value) {
            this.value = value;
        }
        // Рекурсивный обход в глубину.
        public static int sumDeep(tree root) {
            SimpleStack<tree> stack = new SimpleStack<tree>();
            stack.push(root);

            int summ = 0;
            while (!stack.isEmpty()) {
                tree node = stack.pop();
                System.out.println(node.value);
                summ += node.value;

                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }

            return summ;
        }
    }
}
