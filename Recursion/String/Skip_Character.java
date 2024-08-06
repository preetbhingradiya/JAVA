public class Skip_Character {
    public static void main(String[] args) {
        String str = "baccad";

        // A is Skip in str
        // skipAInStr("", str);

        
        char duplicate = findFirstDupicate(str, 0, 1);
        System.out.println(skipChar(str, 0, duplicate));
    }

    public static void skipAInStr(String newStr, String str) {
        if (str.length() == 0) {
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            skipAInStr(newStr, str.substring(1));
        } else {
            skipAInStr(newStr + ch, str.substring(1));
        }
    }

    static char findFirstDupicate(String str, int i, int j){
        if(i==str.length()) return ' ';

        if(j < str.length() && i < j){
            if(str.charAt(i)==str.charAt(j)){
                return str.charAt(i);
            }
            return findFirstDupicate(str, i, j+1);
        }

        return findFirstDupicate(str, i+1, i+2);
    }

    static StringBuffer newStr = new StringBuffer();
    static String skipChar(String str, int i, char duplicate){
        if(i==str.length()) return newStr.toString();

        if(str.charAt(i)==duplicate){
            return skipChar(str, i+1, duplicate);
        }

        newStr.append(str.charAt(i));
        return skipChar(str, i+1, duplicate);
    }
}
