import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the nuber who can finde factorial");
      int factorial=sc.nextInt();

      int i=1,fact=1;
      while (i<=factorial) {
        fact=fact*i;
        i++;
      }
      System.out.println("Factorial " +  factorial + " is " + fact);
    }
}
