public class solid_rombus {

    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            //space 
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=5;j++){
                System.out.print("*");
            }   
            System.out.println();
        }
    }    
}