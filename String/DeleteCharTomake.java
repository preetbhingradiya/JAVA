//remove charcter this is repeate three time
//output is aabaa

//https://leetcode.com/problems/delete-characters-to-make-fancy-string/

public class DeleteCharTomake{
    public static void main(String[] args) {
        String s = "aaabaaaa";
        System.out.println(makeFancyString(s));
    }

    public static String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(i > 0 && ch == s.charAt(i-1)){
                count++;
            }else{
                count = 0;
            }
   
            if(count < 2){
                str.append(ch);
            }
        }

        return str.toString();
    }
}