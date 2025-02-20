import java.util.ArrayList;
import java.util.Stack;

class PreOrderNode<E> {
    PreOrderNode left;
    PreOrderNode right;
    E value;

    public PreOrderNode(E val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }
}

public class IterativePreOrder {
    public static void main(String[] args) {
        PreOrderNode<Integer> root = new PreOrderNode<>(1);
        root.left = new PreOrderNode<>(2);
        root.right = new PreOrderNode<>(3);
        root.left.left = new PreOrderNode<>(4);
        root.left.right = new PreOrderNode<>(5);
        root.right.left = new PreOrderNode<>(6);
        root.right.right = new PreOrderNode<>(7);

        ArrayList<Integer> result = preOrder(root);
        System.out.println(result);
    }

    public static ArrayList<Integer> preOrder(PreOrderNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<PreOrderNode> stack = new Stack<>();  // Use Stack here

        if (root != null) 
            stack.push(root);

        while (!stack.isEmpty()) {  //Change the condition to !stack.isEmpty()
            PreOrderNode node = stack.pop();
            list.add((Integer) node.value); 

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return list;
    }
}
