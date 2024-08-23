import Tree.IterBinaryTree;

import java.util.LinkedList;
import java.util.List;

public class preorderTraversal144 {
    public static void main(String[] args) {
        //пример дерева
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null,new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31,new Tree(28), null),
                                new Tree(40,
                                        new Tree(38),
                                        new Tree(52))));
        System.out.println(Tree.preorderTraversal(root) + " <- Output"); // <-- 144 LeetCode
    }
    static class Tree {
        int value;
        Tree left;
        Tree right;
        public Tree(int value) {
            this.value = value;
        }
        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
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
