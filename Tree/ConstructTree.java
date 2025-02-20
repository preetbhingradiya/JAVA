/* int preStartInd = preOrder start index
    int preEndInd = preorder end index
    int inStartInd = inOrder start index 
    int inEndIndex = inOrder end index

    in PreOrder root is fixed
    in inOrder if konw of root, we will easliy find left and right
 */

import java.util.HashMap;

class ConstructTreeNode {
    ConstructTreeNode left;
    ConstructTreeNode right;
    int value;

    public ConstructTreeNode(int val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }
}

public class ConstructTree {
    public static void main(String[] args) {
        int[] inorder = {};
        int[] preorder = {};
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        //stor the inorder value with index
        for(int i=0; i<inorder.length; i++)
            indexMap.put(inorder[i], i);
        
        int n = preorder.length -1;
        int m = inorder.length -1;
        ConstructTreeNode root = tree(preorder, inorder, indexMap, 0, n, 0, m);
    }

    public static ConstructTreeNode tree(int[] preorder, int[] inorder, HashMap<Integer, Integer> indexMap,int preStartInd, int preEndInd, int inStartInd, int inEndInde){

        //Handle the base (if start index  > end index break)
        if((preStartInd > preEndInd) || (inStartInd > inEndInde)){
            return null;
        }

        int rootData = preorder[preStartInd];  //find root 
        int i = indexMap.get(rootData); //find root index

        ConstructTreeNode root = new ConstructTreeNode(rootData); //create root node

        //inOrder array left = (0, i - 1) AND right = (i+1, inorder.length)

        /* preOrder array 
         * left = indeorder instarIndex TO rootIndex - 1 How many value (0, i-1) ??
         * left = ( upper limit - 1) - lower limit + 1  == -1 + 1 cancel
         * 
         * right = inOrder  inendIndex TO rootIndex + 1 How many value (m , i +1)??
         * right = upperLimit - (lowerLimit + 1) + 1  == -1 + 1cancel
         */
        int leftSize = i - inStartInd;
        int rightSize = inEndInde - i;

        root.left = tree(preorder, inorder, indexMap, preStartInd + 1, preStartInd + leftSize, inStartInd, i - 1);

        root.left = tree(preorder, inorder, indexMap, preStartInd + leftSize + 1,  preStartInd + leftSize + rightSize, i + 1, inEndInde);

        return root;
    }
}
