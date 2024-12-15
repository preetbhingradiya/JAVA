/* give the n for 0 -> n-1 for find shortes path
 * find parth on queries[i][0] and queries[i][1]
 * 
 * After the addition of the road from 2 to 4, the length of the shortest path from 0 to 4 is 3
 * After the addition of the road from 0 to 2, the length of the shortest path from 0 to 4 is 2.
 * After the addition of the road from 0 to 4, the length of the shortest path from 0 to 4 is 1.
 
  Url = https://leetcode.com/problems/shortest-distance-after-road-addition-queries-i/description/
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortDistanceAfterRoadAddition {
    public static void main(String[] args){
        int[][] queries = {{2,4},{0,2},{0,4}};
        int n = 5;
        System.out.println(Arrays.toString(shortestDistanceAfterQueries(n, queries))); 
    }

    public static int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        
        int[] res = new int[queries.length];
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(new ArrayList<>()); //create new list for every index
            if(i < n-1){
                list.get(i).add(i+1);  //every index value is inddex+1
            }
        }


        for(int i=0; i<queries.length; i++){
            int ui = queries[i][0];
            int vi = queries[i][1];

            list.get(ui).add(vi);  //store extrea path in index -> value

            res[i] = dfs(n, list);
        }

        return res;
    }

    private static int dfs(int n, List<List<Integer>> list){

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.offer(0);
        visited[0] = true;
        int distance = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                int curr = queue.poll();

                if(curr == n-1) return distance; //shortest path is foud

                for(int neighbour : list.get(curr)){
                    if(!visited[neighbour]){
                        visited[neighbour] = true;
                        queue.offer(neighbour);
                    }
                }
            }

            distance++;
        }

        return -1;
    }
    
}
