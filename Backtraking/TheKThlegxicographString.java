public class TheKThlegxicographString{
    static String res;
    static int count;
    public static void main(String[] args){
        count = 0;
        res = "";
        int n = 3, k =9;

        //only use of a , b , c for character create three length string and return 9 string for lexicograph

        backtracking(n, k, new StringBuilder(""));
    }

    private static boolean backtracking(int n, int k, StringBuilder curr){
        if(curr.length() == n){
            count++;
            //if count match k menas find Kth legxicographical string
            if(count == k){
                res = curr.toString();
                return true;
            }
            return false;
        }

        for(char ch='a'; ch<='c'; ch++){
            int length = curr.length();
            if(length > 0 && curr.charAt(length - 1) == ch) continue;
            curr.append(ch);

            //if found true than return here
            if(backtracking(n, k, curr)) return true;

            //otherwise beactrack and remove last character in curr
            curr.deleteCharAt(curr.length() - 1);
        }

        return false;
    }
}