
import java.util.HashMap;
import java.util.Map;

/* create map with index -1 and value 0
 * check if any a,e,i,o,u char find xor with this character
 * if this character is aleredy present in map update th ans value
 * otherwise just put value in map
 */

public class Longest_substring_contains_vowel_even {

    public static void main(String[] args){
        String s ="leetcodeisgreat";
        //here leetc ans becuse e repeat even time count vowel it repeat even time
        //ex = eleetminicoworoep => leetminicowor * e, i, o repeat 2 time even
        System.out.println(findTheLongestSubstring(s));
    }

    public static int findTheLongestSubstring(String s){
        int xor = 0, ans=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') 
                 xor ^= c;
            
            if(map.containsKey(xor))  ans = ans < i-map.get(xor) ? i-map.get(xor): ans;
            else map.put(xor, i);
        }

        return ans;

    }
    
}