//permutaions means all posible charcter r
//ex s1 = "ab"
// s1 permotaion is "ab" and "ba"
// find onr of the string s2 return true

public class permutaionsOfString {
    public  static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";
    }

    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        //any case s1 length is greater than s2 return false
        if(m < n) return false;

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];
        
        //add s1 character freaq in both arr
        for(int i=0; i<n; i++){
            s1Map[s1.charAt(i) - 'a']++; // incerese frequence of charcter
            s2Map[s2.charAt(i) - 'a']++;
        }

        if(isMatch(s1Map, s2Map)) return true;

        //s1.length = 2 and s2.length = 8
        // 8 - 2 = 6 

        //after use of i = 1;
        for(int i=1; i<=m-n; i++){
            //windows approach
            s2Map[s2.charAt(i-1) - 'a']--; //decrese previous
            s2Map[s2.charAt(i+n-1) - 'a']++; //add next ele

            if(isMatch(s1Map, s2Map)) return true;
        }

        return false;
    }

    public static boolean isMatch(int[] map1, int[] map2){
        for(int i=0; i<26; i++){
            if(map1[i] != map2[i]) return false;
        }

        return true;
    }
}