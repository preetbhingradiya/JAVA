public class Palindropme_substring {
    public static void main(String[] args) {
        String s = "abbd"; // "a" "b" "b" "d" "bb" 5 palindop and substring

        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            count += validPalindropme(s, i, i);
            count += validPalindropme(s, i, i + 1);
        }

        System.out.println(count);
    }

    public static int validPalindropme(String str, int start, int end){
        int count = 0;
        while(start >= 0 && end < str.length() && str.charAt(start)==str.charAt(end)){
            count++;
            start--;
            end++;
        }
        return count;
    }

}
