public class Sum_of_digit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1342)); //1+3+4+2 =10
    }

    public static int sumOfDigit(int num) {
        if (num == 0)
            return num;
        return sumOfDigit(num / 10) + (num % 10);
    }

    /* 1342
     * 134 + (previous reminder 8 + 2 = 10)
     * 13 + (previous reminder 4 + 4 = 8 )
     * 1 + (previous reminder 3 + 1 =4)
     * 0 + (previous reminder 1 + 0 = 1)
     */
}
