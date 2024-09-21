
import java.util.ArrayList;
import java.util.List;

/* n number for sorted list
 * ex = 13 = [1,11,12,13,2,3,4,5,6,,7,8,9]
 */

/**
 * Lexicographica_number
 */
public class Lexicographica_number {

    public static void main(String[] args){
        int n = 13;
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            dfs(i, n, result);
        }

        System.out.println(result);
    }

    public static void dfs(int curr, int n, List<Integer> res){
        if(curr > n) return;

        res.add(curr);

        for(int i=0; i<=9; i++){
            int next = curr *10 + i;

            if(next > n) return;

            dfs(next, n, res);
        }
    }
}