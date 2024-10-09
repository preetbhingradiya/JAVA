public class MinimumParenthse {
    
    public static void main(String[] args) {
        
    }

    public static  int minAddToMakeValid(String s) {
        int openParentheses = 0;
        int closeParentheses = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){  //here found the open ( perenthese
                openParentheses++;  
            }else{
                if(openParentheses > 0){  //otherwise foundclose ) so decrese-- all open ( still not zero bcz all are pair
                    openParentheses--;
                }else{
                    closeParentheses++;  //at the end unmatched perenthese 
                }
            }
        }

        return (openParentheses + closeParentheses);
    }

}
