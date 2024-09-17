import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* add  string s1 and s2 value in MAP, also store key, value pair
 * key is string value and value is cout of string
 * in list add only one time present value of string
 * map is how like
 * {this :  2
 *  apple : 2
 *  is :    2
 *  sweet : 1
 *  sour :  1}
 * return [sweet, sour]
 */

public class Uncommon_words_to_senstence {
    
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        Map<String, Integer> map = new HashMap<>();
        for(String word : s1.split(" ")){
            map.put(word, map.getOrDefault(word, 0) +1);
        }

        for(String word : s2.split(" ")){
            map.put(word, map.getOrDefault(word, 0) +1);
        }

        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }


        String[] res = new String[list.size()];
        list.toArray(res);
        
        System.out.println(Arrays.toString(res));
    }
}
