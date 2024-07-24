public class Reverse_num {
    public static void main(String[] args) {
        int n = 434;
        System.out.println(ReverseNu(n, 0));

        //Check the Palindrom
        if(ReverseNu(n, 0) == n){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not Palindrome number");
        }
    }

    static int ReverseNu(int n, int reversed) {
        if (n == 0)
            return reversed;

        // int lastDigit = n % 10;
        return ReverseNu(n / 10, reversed * 10 + (n % 10));
        // sometimes you might need some additional varibe in the recursion fun so make
        // new func as pass tha argument
    }
}
