package Tree;

////*
////**
//// ***
//// Сложность log(n) - поиск, в лучшем случае.
//// ***
////**
////*

import Stack.SimpleStack;

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

        System.out.println(root.recurse_sum());

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

    }
}
