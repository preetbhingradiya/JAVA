public class Odd_even {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(oddEven(n));
    }

    public static String oddEven(int n){
        if((n & 1) == 1) return "Odd Number";
        return "Even Number";
    }
    /*in binary
    12 = 1100      13  = 1101
       &               & 
         0001            0001
    Ans  0000      ANS   0001
    */
}
