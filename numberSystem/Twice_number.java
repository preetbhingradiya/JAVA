
import java.util.Arrays;

public class Twice_number {//return not repetare number
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 2, 1, 4, 3, 6 };
        System.out.println(finTwice(arr));
    }

    public static int finTwice(int[] arr) {
        Arrays.sort(arr);
        //here use bitwize oparator or | menas [1,1,2,2,3,3,4,4,6]
        //arr[5] | arr[6] == arr[0]  => 100 | 100 == 100 binary
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            if (j < arr.length && (arr[i] | arr[j]) == arr[i]) {
                i = j;
                continue;
            }
            return arr[i];
        }
        return -1;


        // //seconde method use of ^ xor method
        // int unique =0;
        // for(int n : arr){
        //     unique ^= n;
        // }

        // return unique;
        // 0 ^= arr[0]  0 ^= 10 = 10
        // 10 ^= arr[1] 10 ^= 11 = 01
        // 1 ^= arr[2] 1 ^= 100  = 101
    }
}
