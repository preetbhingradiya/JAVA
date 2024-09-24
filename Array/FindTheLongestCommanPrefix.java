
import java.util.HashSet;

class Node{
    Node[] child;
    Node(){
        child = new Node[10]; //store 0 - 9 digite
    }
}

class Trie{
    Node root;
    Trie(){
        root = new Node();
    }

    public void  add(String word){
        Node temp = root;
        for(char ch :  word.toCharArray()){
            int index = ch - '0';
            
            //100 => root. -> root.1 -> root.1.0 -> root.1.0.0
            //if the current child is null add new node in this postion
            if(temp.child[index]==null) temp.child[index] = new Node();

            //move temp to ch child
            temp = temp.child[index];
        }
    }

    public int findPrefix(String word){
        Node temp = root;
        int len = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            int index = ch - '0';

            //1000 => root. -> root.1 -> root.1.0 -> root.1.0.0 -> root.1.0.0.0
            //if ch child is not present, then prefix cannot be found.
            if(temp.child[index] == null) break;

            temp = temp.child[index];
            len++;
        }
        return len;
    }
}

public class FindTheLongestCommanPrefix {
    
    public static void main(String[] args){
        int[] arr1 = {1, 10, 100};
        int[] arr2 = {1000};

        Trie trie = new Trie();
        int maxLength = Integer.MIN_VALUE;
        for(int arr : arr1){
            //store all the arr1 element in trie.add
            //[1, 10, 100] => node(1) -> node(0) -> node(0) 
            trie.add(Integer.toString(arr));
        }

        for(int arr : arr2){
            int len = trie.findPrefix(Integer.toString(arr));
            maxLength = Math.max(maxLength, len);
        }

        System.out.println(maxLength);
        // System.out.println(findPrefixSum(arr1, arr2));
    }

    public static int findPrefixSum(int[] arr1, int[] arr2){
        HashSet<Integer> arr1Prefix = new HashSet<>();

        for(int val : arr1){
            while(!arr1Prefix.contains(val) && val > 0){
                arr1Prefix.add(val);

                //divide the value of agian chaeck it
                val /= 10;
            }
        }

        int longestPrefix = 0;

        for(int val : arr2){
            while(!arr1Prefix.contains(val) && val > 0){

                //divide the value of agian chaeck it
                val /= 10;
            }
            if(val > 0) longestPrefix = Math.max(longestPrefix, val);
        }

        StringBuilder str = new StringBuilder(String.valueOf(longestPrefix));
        return str.length();

    }
}
