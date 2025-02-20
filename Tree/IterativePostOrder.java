import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class PostOrderNode {
    PostOrderNode left;
    PostOrderNode right;
    int value;

    public PostOrderNode(int val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }
}


public class IterativePostOrder{
    public static void main(String[] args) {
        PostOrderNode root = new PostOrderNode(1);
        root.left = new PostOrderNode(2);
        root.right = new PostOrderNode(3);
        root.left.left = new PostOrderNode(4);
        root.left.right = new PostOrderNode(5);
        root.right.left = new PostOrderNode(6);
        root.right.right = new PostOrderNode(7);

        List<Integer> ans = postOrder(root);
        System.out.println(ans);
    }

    public static List<Integer> postOrder(PostOrderNode root){
       List<Integer> res = new ArrayList<>();
       Stack<PostOrderNode> stack = new Stack<>();

       PostOrderNode node = root;
       while (node != null || !stack.isEmpty()) {
            //move to left still not found null
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            //now iterate the right side node
            if(stack.peek().right != null){  //if stack peek.right node is availble move
                node = stack.peek().right;
            }else{
                PostOrderNode temp = stack.pop();   //here right not found so left and right both iterative add in res
                res.add(temp.value);
                while(!stack.isEmpty() && temp == stack.peek().right){
                    temp = stack.pop();
                    res.add(temp.value);
                }
            }
        }

        return  res;
    }
}