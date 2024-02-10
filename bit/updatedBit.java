import java.util.Scanner;

public class updatedBit {   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 0 Or 1 :- ");
        int oper=sc.nextInt();

        int n=5,posi=1;    
        int bitMask=1<<posi;
        if(oper==1){
            //set bit (updated 1 of position)
            int updatedBit=bitMask | n;
            System.out.println(updatedBit);
        }
        else{;
            int notOpration=~(bitMask);
            int updatedBit=notOpration & n;
            System.out.println(updatedBit);
        }
    }

}
