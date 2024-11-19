import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class HeightOfTreeAfterRemoveQueries {
    int max = 0;

    public int[] treeQueries(TreeNode root, int[] queries) {
        int[] leftRoot = new int[100001]; // constraints give 1 -> n
        int[] rightRoot = new int[100001];

        // Store all left height in leftRoot array
        max = 0;
        findFirstLeftHeight(root, leftRoot, 0);

        // Store all right height in rightRoot array with max=0
        max = 0;
        findFirstRightHeight(root, rightRoot, 0);

        for (int i = 0; i < queries.length; i++) {
            queries[i] = Math.max(leftRoot[queries[i]], rightRoot[queries[i]]);
        }

        return queries;
    }

    public void findFirstLeftHeight(TreeNode root, int[] leftPart, int height) {
        if (root == null) return;
        leftPart[root.val] = max;
        max = Math.max(max, height);  

        // Start height count from left then right
        findFirstLeftHeight(root.left, leftPart, height + 1);
        findFirstLeftHeight(root.right, leftPart, height + 1);
    }

    public void findFirstRightHeight(TreeNode root, int[] rightPart, int height) {
        if (root == null) return;
        rightPart[root.val] = max;
        max = Math.max(max, height);

        // Start height count from first right then left
        findFirstRightHeight(root.right, rightPart, height + 1);
        findFirstRightHeight(root.left, rightPart, height + 1);
    }

    // Helper function to build a tree from an array
    public TreeNode buildTree(Integer[] nodes) {
        if (nodes == null || nodes.length == 0) return null;
        return buildTree(nodes, 0);
    }

    private TreeNode buildTree(Integer[] nodes, int index) {
        if (index >= nodes.length || nodes[index] == null) return null;
        TreeNode root = new TreeNode(nodes[index]);
        root.left = buildTree(nodes, 2 * index + 1);
        root.right = buildTree(nodes, 2 * index + 2);
        return root;
    }

    public static void main(String[] args) {
        HeightOfTreeAfterRemoveQueries solution = new HeightOfTreeAfterRemoveQueries();
        Integer[] nodes = {5, 8, 9, 2, 1, 3, 7, 4, 6};
        TreeNode root = solution.buildTree(nodes);
        int[] queries = {3, 2, 4, 8};
        
        int[] results = solution.treeQueries(root, queries);
        System.out.println(Arrays.toString(results));
    }
}
