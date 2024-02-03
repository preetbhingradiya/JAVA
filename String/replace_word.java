import java.util.Scanner;

public class replace_word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter String  :-");
        String string=sc.next();
        String result="";
        // String result=string.replace("e", "i");


        for(int i=0;i<string.length();i++){
           if(string.charAt(i)=='e'){
                result += 'i';
           }
           else{
            result+=string.charAt(i);
           }
        }

        System.out.print(result+" ");
    }    
}
