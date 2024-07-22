public class GCD {
    public static void main(String[] args) {
        // System.out.println(gcd(4, 9));
        /*
         * factor is 4 = 1,2,4
         * factor is 8 = 1,2,4,8
         * which is highst factor in comman return is so 4
         * 
         * factor is 4 = 1,2,4
         * factor is 9 = 1,3,6,9
         * which is highst factor in comman return is so 1
         */

        // LCM
        System.out.println(lcm(2, 7));
        /*
         * LCM means the minimun number is diveded by both (factor concept above)
         * 2 tables = 2,4,8,10,12,14,16,18,20
         * 7 table = 7,14,21,28,35...
         * here both table 14 is divide by both and it is minimum number
         */
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a); // Gcd(rem(b,a) , a) Eculidean Algoritham
    }

    // (9%4 , 4) = (1, 4)
    // (4%1 , 1) = (0, 1) return b=1 bcz a=0

    public static int lcm(int a, int b) { // List Common Multipal
        return a * b / gcd(a, b);
    }
}
