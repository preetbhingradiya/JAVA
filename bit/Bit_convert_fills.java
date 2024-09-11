public class Bit_convert_fills {
    public static void main(String[] args){
        int start = 10;
        int goal = 7;
        int ans = minBitFlips(start, goal);

        System.out.println(ans);
    }

    public  static int minBitFlips(int start, int goal) {
        // int xor = start ^ goal;
        // int count = 0;
        // while(xor > 0){
        //     xor = (xor & (xor-1));
        //     count++;
        // }

        // return count;

        int count = 0;
        while (start > 0 || goal > 0) {
            // Increment count if the current bits differ
            if ((start & 1) != (goal & 1)) {
                count++;
            }
            
            // Shift both numbers to the right to check the next bits
            start >>= 1;
            goal >>= 1;
        }
        return count;
    }
}
