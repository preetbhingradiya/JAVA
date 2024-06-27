public class Valid_palidrop {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(('a' <= ch || 'A' <=ch) && ('z' >= ch || 'Z' >= ch)){
                builder.append(ch);
            }
        }
        String str = builder.toString().toLowerCase();

        int start =0;
        int end = str.length()-1;
        boolean palidrop = true;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                palidrop = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(palidrop);
    }
}
