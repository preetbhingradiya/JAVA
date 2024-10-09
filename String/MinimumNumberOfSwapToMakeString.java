/** here close the evry bracket and make balance string how many swap to make all
 * string are cloe with bracket
 * bracket is "[" ANd "]"
 */
public class MinimumNumberOfSwapToMakeString {

    public static void main(String[] args){
        String s = "]][[[]]][[]][][[";
        System.out.println(minSwaps(s));
    }

    public static int minSwaps(String s) {
        int openBracket = 0;
        int closeBracket = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '['){
                //if the bracket is open found incerese the openBracket++
                openBracket++;
            }else{
                if(openBracket <= 0){ //here check if no any openbracket inceres the clostbracke
                    closeBracket++;
                }else{ //otherwise decrese the openbracket
                    openBracket--;
                }
            }
        }

        return (closeBracket + 1) / 2;
    }
    
}