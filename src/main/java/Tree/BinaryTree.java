package Tree;

////*
////**
//// ***
//// Сложность log(n) - поиск, в лучшем случае.
//// ***
////**
////*

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//Рекурсивный метод бинарного дерева.
public class BinaryTree {

    public static void main(String[] args) {

        BinaryTree_Code root = new BinaryTree_Code(8,
                new BinaryTree_Code(3,
                        new BinaryTree_Code(1),
                        new BinaryTree_Code(6,
                                new BinaryTree_Code(4),
                                new BinaryTree_Code(7))),
                new BinaryTree_Code(10, null,
                        new BinaryTree_Code(14, new BinaryTree_Code(13), null)));

        BinaryTree_Code root1 = null;
        System.out.println(root.recurse_sum());
        System.out.println(BinaryTree_Code.preorderTraversal144(root1)); //пример пустого дерева

    }
    static class BinaryTree_Code {
        int value;
        BinaryTree_Code left;
        BinaryTree_Code right;

        public BinaryTree_Code(int value, BinaryTree_Code left, BinaryTree_Code right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public BinaryTree_Code(int value) {
            this.value = value;
        }

        //Рекурсивный метод
        public int recurse_sum() {
            int summ = value;

            if (left != null) {
                summ += left.recurse_sum();
            }
            if (right != null) {
                summ += right.recurse_sum();
            }

            return summ;
        }

        public static List<Integer> preorderTraversal144(BinaryTree_Code root1) {
            Stack<BinaryTree_Code> stack = new Stack<>();
            List<Integer> output = new LinkedList<>();
            if (root1 == null) {
                return output;
            }

            stack.push(root1);
            while(!stack.isEmpty()) {
                BinaryTree_Code Node = stack.pop();
                output.add(Node.value);
                if (Node.left != null) {
                    stack.push(Node.left);
                }
                if (Node.right != null) {
                    stack.push(Node.right);
                }
            }

            return output;
        }

    }
}
