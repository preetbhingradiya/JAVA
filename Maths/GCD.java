public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(4, 9)); 
        /* factor is 4 = 1,2,4
         * factor is 8 = 1,2,4,8
         * which is highst factor in comman return is so 4
         * 
         * factor is 4 = 1,2,4
         * factor is 9 = 1,3,6,9
         * which is highst factor in comman return is so 1
         */
    }

    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a , a);
    }

    //(9%4 , 4) = (1, 4)
    //(4%1 , 1) = (0, 1) return b=1 bcz a=0
}
