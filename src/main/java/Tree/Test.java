package Tree;

import Stack.SimpleQueue;
import Stack.SimpleStack;

public class Test {

    public static void main(String[] args) {
        Tree root = new Tree(9,
                new Tree(6,
                        new Tree(3,
                                new Tree(1, null, new Tree(2)),
                                new Tree(4, null, new Tree(5))),
                        new Tree(8, new Tree(7), null)),
                new Tree(17,
                        new Tree(16,
                                new Tree(12,
                                        new Tree(11, new Tree(10), null),
                                        new Tree(14, new Tree(13), new Tree(15))), null),
                        new Tree(20,
                                new Tree(19, new Tree(18), null),
                                new Tree(21, null, null))));

        System.out.println(Tree.sumDeep(root));
    }

    /*static class Tree {
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
        public int Tree_recurse() {
            int summ = value;
            if (left != null) {
             summ += left.Tree_recurse();
            }
            if (right != null) {
                summ += right.Tree_recurse();
            }
            return summ;
        }
    }
    */
     static class Tree {
         int value;
         Tree left;
         Tree right;

         public Tree(int value, Tree left,Tree right) {
             this. value = value;
             this. left = left;
             this. right = right;
         }
         public Tree(int value) {
             this. value = value;
         }
         /*public int Tree_recurse() {
             int sum = value;
             if (left != null) {
                 sum += left.Tree_recurse();
             }
             if (right != null) {
                 sum += right.Tree_recurse();
             }
             return sum;
         } */

        //итер в глубину
        public static int sumDeep(Tree root) {
            MyStack<Tree> stack = new MyStack<Tree>();
            stack.push(root);

            int sum = 0;
            while (!stack.isEmpty()) {
                Tree node = stack.pop();
                sum += node.value;

                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
            return sum;
        }
    }

}
