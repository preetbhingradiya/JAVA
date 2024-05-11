import java.util.Scanner;

public class prime {
    // prime number=2,3,5,7,11,13,17...
    public static boolean PrimeOrNot(int number) {
        // best completcity
        int i = 2;
        /*
         * in cas ex num = 17
         * so check only 2,3,4 only this vaue
         * 2*2 = 4
         * 3*3 = 9
         * 4*4 = 16
         * 5*5 = 25 condition will be false
         */
        while (i * i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the num : ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Not A Prime");
        }

        // for (int i = 2; i < number; i++) {
        //     if (number % i == 0) {
        //         System.out.println("not A Prime number");
        //         break;
        //     } else {
        //         System.out.println("Prime number");
        //     }
        // }

        boolean check = PrimeOrNot(number);
        if(check){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a Prime number");
        }
    }
}
