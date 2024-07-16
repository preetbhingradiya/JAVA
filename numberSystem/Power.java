public class Power {
    /* power 6 in base 110
     * 0  is not qeaul 1 so base *= base 3*3 = 9
     * 11 >> 1
     * 1 == 1 so ans *= base 1*9  (ans=9) and base = 9*9 (base=81)
     * 1 >> 1
     * 1 == 1 so ans *= base 9*81 (ans=729) ans base = 81*81 (base=6561)
     */
    public static void main(String[] args) {
        int base = 3;
        int power = 6;

        int ans = 1;
        while (power > 0) {
            if((power & 1)==1){ //check if the last number is 1
                ans *= base;
            }

            base *= base;
            power = power >> 1; //right shift 
        }

        System.out.println(ans);
    }

}
