import java.util.ArrayList;
import java.util.List;

public class K_Lexicographical_small_num {

    public static void main(String[] args){
        int n = 9885387;
        int k = 8786251;
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=9; i++){
            dfs(i, n, list);
        }

        System.out.println( list.get(k-1));
    }

    public static void dfs(int curr, int n, List<Integer> list){
        if(curr > n) return;

        list.add(curr);

        for(int i=0; i<=9; i++){
            int next = curr * 10 + i;

            if(next > n) return;

            dfs(next, n, list);
        }
    }
}
