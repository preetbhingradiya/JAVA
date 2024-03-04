public class string_comparation {

    public static String compression(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer cout =1;
            while(i<str.length()-1  && str.charAt(i) == str.charAt(i+1)){
                cout++;
                i++;
            }
            newStr += str.charAt(i);
            if(cout>1){
                newStr += cout.toString();
            }
        }

        return newStr;
    }
    
    public static void main(String[] args){

        String str = "aaabbcccdd";
        System.out.println(compression(str));
    }
}
