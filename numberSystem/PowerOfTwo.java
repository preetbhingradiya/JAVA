public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 31; //this number is count in binary only one time 1 is add 
        //32 in binary 100000 & 31 in binary 11111 == 0
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
