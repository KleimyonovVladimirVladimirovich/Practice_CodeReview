package Tree;

import Stack.SimpleQueue;
import Stack.SimpleStack;

import java.util.LinkedList;
import java.util.List;

public class IterBinaryTree {
    public static void main(String[] args) {

        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null,new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31,new Tree(28), null),
                                new Tree(40,
                                        new Tree(38),
                                        new Tree(52))));

       // System.out.println(tree.sumDeep(root));
        System.out.println(Tree.WideDeep(root) + " : Count value");
        System.out.print(Tree.preorderTraversal(root) + " <- Output");
    }
    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }
        // Итеративный обход в глубину.
        public static int sumDeep(Tree root) {
            SimpleStack<Tree> stack = new SimpleStack<Tree>();
            stack.push(root);

            int summ = 0;
            while (!stack.isEmpty()) {
                Tree node = stack.pop();
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
            // Итеративный обход в глубину.
        }
        // Итеративный обход в ширину.
        public static int WideDeep(Tree root) {
            SimpleQueue<Tree> queue = new SimpleQueue<Tree>();
            queue.add(root);

            int summ = 0;
            while (!queue.isEmpty()) {
                Tree node = queue.remove();
                System.out.println(node.value);

                summ += node.value;


                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }

            }

            return summ;
            // Итеративный обход в ширину.
        }

        //ОТДАЕМ СПИСКОМ ЗНАЧЕНИЯ КОРНЯ И ВСЕХ ЕГО РЕБЕР
        //Сначала проходимся по right, потом по left для сохранения очередности списка
        public static List<Integer> preorderTraversal(Tree root) {
            LinkedList<Tree> stackTree = new LinkedList<>();
            List<Integer> output = new LinkedList<>();
            if (root == null) {
                return output;
            }

            stackTree.add(root);
            while (!stackTree.isEmpty()) {
                Tree node = stackTree.pollLast();
                output.add(node.value);
                if (node.right != null) {
                    stackTree.add(node.right);
                }
                if (node.left != null) {
                    stackTree.add(node.left);
                }
            }
            return output;
        }
    }
}
