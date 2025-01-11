/* here check k time make plaindrop is present in S string or not
 * annabelle => anellena + b OR anna + elble 
 * here first chek k > n then return fals
 * so find frequeance of all s string character 
 * 
 * if all freq is not divide by 2 means this freq is odd 
 * all odd is smaller then k so return true otherwise false
 */

public class ConstructKPalindropString {

    public static void main(String[] args) {
        String s = "annabelle";
        int k = 2;
        System.out.println(canConstruct(s,k));
    }

    public static boolean canConstruct(String s, int k){
        int n = s.length();

        if (k > n)
            return false;

        int[] freq = new int[26];
        for (int i = 0; i < n; i++) 
            freq[s.charAt(i) - 'a']++;

        int oddCount = 0;
        for (int f : freq) 
            if (f % 2 != 0)
                oddCount++;
        
        return oddCount <= k;
    }
}