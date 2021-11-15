package BST;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

class BST {

    static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner scan = new Scanner(System.in);
        int[] array = new int[30];//new int[total];
        int total = array.length;//scan.nextInt();
        Tree tree = null;
        Random ran = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt();
        }
        for (int j : array) tree = add(tree, j);//array[i] = scan.nextInt();
        //System.out.println(getHeight(tree));
        print(tree, "", 0);
        BreathPrint(tree);
    }

    private static int getHeight(Tree tree) {
        if (tree == null) return 0;
        return Math.max(getHeight(tree.left), getHeight(tree.right)) + 1;
    }

    static void print(Tree tree, String gap, int child) {
        System.out.println(gap + tree.symbol[child] + tree.data);
        gap += tree.space[child];

        child = (tree.left != null ? 1 : 0) + (tree.right != null ? 1 : 0);
        if (tree.left != null) print(tree.left, gap, child--);
        if (tree.right != null) print(tree.right, gap, child);
    }

    static void BreathPrint(Tree tree) {
        Queue<Tree> next = new ArrayDeque<>();
        next.add(tree);

        for (Tree cur = next.poll(); cur != null; cur = next.poll()) {
            if (cur.left != null) next.add(cur.left);
            if (cur.right != null) next.add(cur.right);
            System.out.print(cur.data + " ");
        }
    }

    static Tree add(Tree tree, int elem) {
        if (tree == null) return new Tree(elem);
        else {
            Tree cursor;
            if (elem <= tree.data) {
                cursor = add(tree.left, elem);
                tree.left = cursor;
            } else {
                cursor = add(tree.right, elem);
                tree.right = cursor;
            }
            return tree;
        }
    }
}
