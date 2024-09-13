
import java.util.Arrays;
/* int every queries 1 ele of is index of arr and 2 ele is index of arr
 * ex queries = {0,1} arr = [1,3] = > 1 ^ 3
 * queries = {1,2} arr = [3,4] = > 3 ^ 4
 * queries = {0,,3} arr [1,3,4,8] => 1 ^ 3 ^ 4 ^ 8
 */
public class XOR_queries_subarr {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1},{1,2},{0,3},{3,3}};

        //SLOW TRICK
        // int[] res = new int[queries.length];
        // int k = 0;
        // for(int[] q : queries){
        //     int xor = 0;
        //     for(int i=q[0]; i<=q[1]; i++){
        //         xor = xor ^ arr[i];
        //     }
        //     res[k++] = xor;
        // }

        int[] ans = XORArray(arr, queries);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] XORArray(int[] arr, int[][] queries){
        int xors[] = new int[arr.length];
        int total = 0;
        //store all arr ele to cover into xor in xors[]
        //arr[1,3,4,8] => (0^1 = 1) = > (1 ^ 3 = 2) => (2 ^ 4 = 6) => (6 ^ 8 = 14) 
        //xors[1,2,6,14]
        for(int i=0; i<arr.length; i++){
            total ^= arr[i];
            xors[i] = total;
        }

    
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            res[i] = xors[y] ^ (x==0 ? 0 : xors[x-1]);
        }

        return res;
    }
}
