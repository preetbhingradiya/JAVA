/*ex "abc"
1) prefiex "a" => a is in "abc" and also in "ab" = 2
2) prefiex "ab" =>ab is in "abc" and also in "ab" = 2
3) prefiex "abx" => abc is in "abc" = 1 
[5]

"ab"
1) prefiex "a" => a is in "ab" and also in "abc" = 2
2) prefiex "ab" => ab is in "ab" and als in "abc" = 3
[4]

"bc"
1) prefiex "b" => b is in "bc" and also in "b" = 2
2) prefiex "bc" =>  bc is in "bc" = 1
[3]

"b"
1) prefiex "b" => b is in "b" and also in "bc" = 2
[2]
*/
import java.util.Arrays;

class Node{
    Node[] child;
    int score;
    Node(){
        //create new node child of 26 character of a-z
        child = new Node[26];
        score = 0;
    }
}

class Trie{
    Node root;
    Trie(){
        root = new Node();
    }

    public void addElement(String word){
        Node temp = root;

        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            
            //add evey character in child[index] and that place create new node()
            if(temp.child[index]==null) temp.child[index] = new Node() ;

            // temp can move to the current child index
            temp = temp.child[index];

            // increse the score of this character
            temp.score++;
        }
    }

    public int findPrefixOfSum(String word){
        Node temp = root;
        int store = 0;

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);

            //if the child index is not found break it not prefiex
            if(temp.child[ch - 'a'] == null) break;

            temp = temp.child[ch-'a'];

            //all the string score pass in store
            store += temp.score;
        }

        return store;
    }
}



public class FindSumOfPrefixString {
    
    public static void main(String[] args) {
        String[] words = {"abc","ab","bc","b"};
        Trie trie = new Trie();

        for(String word : words){
            trie.addElement(word);
        }

        int[] result = new int[words.length];
        int i =0;
        for(String word : words){
            result[i++] = trie.findPrefixOfSum(word);
        }

        System.out.println(Arrays.toString(result));
    }
}
