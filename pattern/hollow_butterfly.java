/**
 * hollow_butterfly
 */
public class hollow_butterfly {

    public static void main(String[] args){

        //upper half
        for(int i=1;i<=5;i++){
            System.out.print("*");
            for(int j=1;j<=i-2;j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }
            
            //between space
            for(int j=1; j<=2*(5-i); j++){
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //lower half
        for(int i=5;i>=1;i--){
            System.out.print("*");
            for(int j=1;j<=i-2;j++){
                System.out.print(" ");
            }
            if(i>1){
                System.out.print("*");
            }
            
            //between space
            for(int j=1; j<=2*(5-i); j++){
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}