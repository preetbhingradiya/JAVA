import java.util.ArrayList;
import java.util.Stack;

class InOrderNode {
    InOrderNode left;
    InOrderNode right;
    int value;

    public InOrderNode(int val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }
}


public class IterativeInOrder {
    public static void main(String[] args) {
        InOrderNode root = new InOrderNode(1);
        root.left = new InOrderNode(2);
        root.right = new InOrderNode(3);
        root.left.left = new InOrderNode(4);
        root.left.right = new InOrderNode(5);
        root.right.left = new InOrderNode(6);
        root.right.right = new InOrderNode(7);
    }

    public static ArrayList<Integer> inOrder(InOrderNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<InOrderNode> stack = new Stack<>();  // Use Stack here
        InOrderNode current  = root;

        if (root != null) {
            stack.push(root);
        }

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Process the top node from the stack
            current = stack.pop();
            list.add(current.value);  // Add the node value to the list

            // Move to the right subtree
            current = current.right;
        }

        return list;
    }
}
