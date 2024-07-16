public class Find_set_of_bit {

    public static void main(String[] args) {
        int n = 9; //1001 how many time 1 is repate return this number
        int count = 0;
        while (n > 0) {
            if((n & 1) ==1){
                count++;
            }
            n = n>>1;
        }

        // while (n > 0) {
        //     count++;
        //     n = n & (n-1);  // here compare current value to previous n = 9 & 8
        // }
        System.out.println(Integer.toBinaryString(9));
        System.out.println(count);
    }
}