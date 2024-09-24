import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Extra_spacing_string {

    public static void main(String[] args){
        String  s = "sayhelloword";
        String[] dictionary = {"hello", "world"};

        HashSet<String> dictionarySet = new HashSet<>();

        for(String words : dictionary){
            dictionarySet.add(words);
        }

        System.out.println(minExtraChar(s, dictionarySet, 0));
    }

    public static int minExtraChar(String s, HashSet<String> dictionary, int index){
        if(index == s.length()) return 0;

        StringBuilder  sb = new StringBuilder();
        int minExtraChar = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            int extraChar = 0;
            if(!dictionary.contains(sb.toString())) extraChar = sb.length();
            int curExtra = minExtraChar(s, dictionary, i+1);
            minExtraChar = Math.min(minExtraChar, extraChar + curExtra);
        }

        return minExtraChar;
    }


}
