public class Twice_3 {
    public static void main(String[] args) {
        int []arr = {2,3,2,2,5,5,6,5,6,6};
        int ones = 0;
        int twos = 0;

        for (int num : arr) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        /* 0 ^ 10 => 10 & ~0 => 10 & 1 => 10   ones
         * 0 ^ 10 => 10 & ~10 => 10 & 01 => 00 two
         */

        System.out.println(ones);
    }
}
