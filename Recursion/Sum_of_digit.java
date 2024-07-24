public class Sum_of_digit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1342)); // 1+3+4+2 =10
    }

    public static int sumOfDigit(int num) {
        if (num == 0)
            return num;
        return sumOfDigit(num / 10) + (num % 10);
    }
    /*
     * f(1342)
     * f(134) + 2 wait (8+2 =10)
     * f(13) + 4 wait (4+4 =8)
     * f(1) + 3 wait (1+3 = 4)
     * f(0) + 1 wait (0+1 = 1)
     * f(0) return 0
     * 
     * 1342
     * 134 + (previous reminder 8 + 2 = 10)
     * 13 + (previous reminder 4 + 4 = 8 )
     * 1 + (previous reminder 3 + 1 =4)
     * 0 + (previous reminder 1 + 0 = 1)
     */
}
