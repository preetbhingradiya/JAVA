class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Linklist_in_binary_tree {

    public static void main(String[] args) {
        // Example linked list: 4 -> 2 -> 8
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(8)));

        // Example binary tree:
        //       1
        //      / \
        //     4   4
        //    /     \
        //   2       8
        //  / \
        // 1   6
        TreeNode root = new TreeNode(1,
            new TreeNode(4,
                new TreeNode(2,
                    new TreeNode(1), 
                    new TreeNode(6)),
                null),
            new TreeNode(4,
                null,
                new TreeNode(8))
        );

        boolean result = dfs(head, head, root);
        System.out.println(result);  // Output should be true
    }

    public static boolean dfs(ListNode head, ListNode curr, TreeNode root){
        //travel all linklist node then return true
        if(curr == null) return true;

        //if the root tree is over and no match found return false
        if(root == null) return false;

        //linkList current node and tree current are match
        if(curr.val == root.val) curr = curr.next;

        //If no match, but tree node match to head of linklist
        else if(head.val == root.val) head = head.next;

        //reset curr to head
        else curr = head;

        return dfs(head, curr, root.left) || dfs(head, curr, root.right);
    }
}
