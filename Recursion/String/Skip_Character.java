public class Skip_Character {
    public static void main(String[] args) {
        String str = "baccad";

        //A is Skip in str
        // skipAInStr("", str);


        System.out.println(skipCharacter(str, 0, str.length()-1, '!'));
    }

    public static void skipAInStr(String newStr, String str){
        if(str.length()==0) {
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(0);
        if(ch=='a'){
            skipAInStr(newStr, str.substring(1));
        }
        else{
            skipAInStr(newStr + ch, str.substring(1));
        }
    }

    static StringBuffer newStr = new StringBuffer();
    static Boolean isAvailable = false;
    public static String skipCharacter(String str, int i, int j, char dupicatChar) {
        if(i==str.length()) return newStr.toString();

        if ( i < j){
            if(str.charAt(j) != dupicatChar){
                dupicatChar = str.charAt(i);
                return skipCharacter(str, i, j-1, dupicatChar);
            }else{
                isAvailable = true;
                return skipCharacter(str, i, j-1, dupicatChar);
            }
        }

        if(!isAvailable){
            newStr.append(str.charAt(i));
            isAvailable = false;
        }
        return skipCharacter(str, i+1, str.length()-1, dupicatChar);
    }
}
