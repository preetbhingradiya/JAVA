// BST = Breath First Search

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode<E> {
    TreeNode left;
    TreeNode right;
    E value;

    public TreeNode(E val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }
}

public class BFS {

    public static void main(String[] args) {
        // Create a simple binary tree for the example
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        root.right.left = new TreeNode<>(6);
        root.right.right = new TreeNode<>(7);

        // Run BFS and print the result
        ArrayList<Integer> result = BFSTechnique(root);
        System.out.println(result);
    }

    public static ArrayList<Integer> BFSTechnique(TreeNode<Integer> root) {

        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode<Integer>> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode<Integer> curreNode = queue.poll();
            res.add(curreNode.value);

            if (curreNode.left != null)
                queue.offer(curreNode.left);

            if (curreNode.right != null)
                queue.offer(curreNode.right);
        }

        return res;
    }

}
