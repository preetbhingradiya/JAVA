//allowed charcter are available in allwoed "ab"
//now next step is check ab is constitens in the words array return count
//here in words array "aaab" => ab AND seconde is "baa" => ab bcz it reverse constiens
public class Number_of_constinets {

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        boolean[] s= new boolean[26];
        for(char ch : allowed.toCharArray()){
            s[ch - 'a'] = true;
        }

        int count = 0;
        for(String w : words){
            if(check(w, s)) ++count;
        }

        System.out.println(count);
    }

    private static boolean check(String w, boolean [] s){
        for(int i=0; i<w.length(); i++){
            if(!s[w.charAt(i) - 'a']) return false;
        }
        return true;
    }
    
}