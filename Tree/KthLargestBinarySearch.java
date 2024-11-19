import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class KthLargestBinarySearch {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(6);

        KthLargestBinarySearch solution = new KthLargestBinarySearch();
        long result = solution.sumofLargestK(root, 2);
        System.out.println("The 2nd largest level sum is: " + result);
    }

    public long sumofLargestK(TreeNode root, int k){
        Queue<TreeNode> queue = new LinkedList<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                //store in queue evry temp left and right if it is available in tree
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
            }

            pq.offer(sum);  //store every level of sum in pq
            if (pq.size() > k) {  //mentane the pq sie is == k if pq size greate just poll the pq
                pq.poll();
            }
        }

        if (pq.size() < k) return -1;  //if the pq.size() is smaller than k return -1 no posible ans
        return pq.poll();
    }

}