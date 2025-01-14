/* A prefix common array of A and B is an array res such that res[i] is equal to the      count of numbers that are present at or before the index i in both A and B.
 * check before i index in A and B how many common
 * so use fre if A elelemt freq == 2 count++ and if B element freq == 2 count++
 * beacuse only two array fro 0 -> N
 */

import java.util.Arrays;

public class FindCommonPrefixInTwoArray {
    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};

        System.out.println(Arrays.toString(findThePrefixCommonArray(A, B)));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;

        int[] freq = new int[n+1];
        int[] res = new int[n];
        int count = 0;

        for(int i=0; i < n; i++){

            //check if A  index element freq == 2 count++
            freq[A[i]]++;
            if(freq[A[i]] == 2) count++;

            //check if B  index element freq == 2 count++
            freq[B[i]]++;
            if(freq[B[i]] == 2) count++;

            res[i] = count;
        }
        return res;
    }
}
