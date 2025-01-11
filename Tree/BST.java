public class BST {

    class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST() {

    }

    public int height(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value)
            node.left = insert(value, node.left);

        if (value > node.value)
            node.right = insert(value, node.right);

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null)
            return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, "Root Node : ");
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length - 1);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end)
            return;

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    private void display(Node node, String details) {
        if (node == null)
            return;

        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null)
            return;

        System.out.println(node.value + " "); // Node
        preOrder(node.left); // Left
        preOrder(node.right); // Right
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left); // Left
        System.out.println(node.value + " "); // Node
        inOrder(node.right); // Right
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null)
            return;
            
        postOrder(node.left); // Left
        postOrder(node.right); // Right
        System.out.println(node.value + " "); // Node
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = { 8, 4, 22, 6, 9, 11, 5, 6, 70, 11 };
        tree.populate(nums);
        tree.display();
        // System.out.println(tree.balanced());

        // int[] nums = {1,2,3,4,5,6,7,8,9,10};
        // tree.populatedSorted(nums);
        // tree.display();
    }
}
