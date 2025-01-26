/*      1
      / | \
     2  3  4
    / \
   5   6
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class NTreeNode {
    NTreeNode child[];
    int value;

    NTreeNode(NTreeNode child[], int value) {
        this.value = value;
        this.child = child;
    }
}

public class NArrayTreeBFS {

    public static void main(String[] args) {
        // Example of an N-ary tree:
        NTreeNode node5 = new NTreeNode(null, 5);
        NTreeNode node6 = new NTreeNode(null, 6);
        NTreeNode node2 = new NTreeNode(new NTreeNode[] { node5, node6 }, 2);
        NTreeNode node3 = new NTreeNode(null, 3);
        NTreeNode node4 = new NTreeNode(null, 4);
        NTreeNode root = new NTreeNode(new NTreeNode[] { node2, node3, node4 }, 1);

        // Running BFS on the N-ary tree
        ArrayList<Integer> result = NTree(root);
        System.out.println(result);
    }

    public static ArrayList<Integer> NTree(NTreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<NTreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            NTreeNode currentNode = queue.poll();
            list.add(currentNode.value); // Corrected to use currentNode.value

            if (currentNode.child != null) {
                for (NTreeNode child : currentNode.child) {
                    queue.offer(child);
                }
            }

        }

        return list;
    }

}
