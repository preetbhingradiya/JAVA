import java.util.Scanner;

public class user {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Email");
        String value=sc.next();
        
        String result=value.replace("@gmail.com", "");

        System.out.println("Your User Name is :- " + result);
    }
}
