import java.util.Scanner;

public class print_name {

    public static void printName(String name) {
        System.out.println("Your Name is "+ name );
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name :- ");
        String name=sc.next();

        printName(name);
    }
    
}