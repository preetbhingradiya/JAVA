public class RemoveAllOccurenceOfSubString{
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        removeOccurrences(s, part);
    }

    public static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int m = part.length();
        for(char ch : s.toCharArray()){
            sb.append(ch); //append in sb

            //if the sb length greater than part length
            if(sb.length() >= m){
                //create subString in sb for  
                String sub = sb.substring(sb.length()-m);

                //if the sub equal part so set new length to remove this part
                if(sub.equals(part)){
                    sb.setLength(sb.length()-m);
                }
            }
        }
        return sb.toString();
    }
}