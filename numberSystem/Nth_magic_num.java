public class Nth_magic_num {
    /* 6 in binary 110
     * 1*5.power(3) + 1*5.power(2) + 0*5.power(1)
     * 1*125 + 1*25 + 0
     * 125 + 25 = 150
     */
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int lastEle = n & 1;  //every time find last index of number (0)
            n = n >> 1;  //ignore the last element in move right (11)
            ans += lastEle *base;
            base = base * 5; 
        }

        System.out.println(ans);
    }
}
