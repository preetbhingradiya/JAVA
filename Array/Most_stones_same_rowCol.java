import java.util.Stack;

public class Most_stones_same_rowCol {
   public static void main(String[] args) {
        int[][] nums = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
        System.out.println(possibleStone(nums));
   } 

   public static int possibleStone(int[][] stones){
        int count = 0;
        int n = stones.length;
        boolean[] visited = new boolean[n];

        for(int i=0; i < n; i++){
            if(!visited[i]){
                removeStones(stones, visited, i);
                count++;
            }
        }

        return n - count;
   }

   public static void removeStones(int[][] stones, boolean[] visited, int index){
        Stack<Integer> stack = new Stack<>();
        stack.push(index);
        visited[index] = true;

        while (!stack.isEmpty()) {
            int current = stack.pop();
            int[] stone = stones[current];

            for (int i = 0; i < stones.length; i++) {
                int a = stones[i][0]; // itteration row number
                int b = stone[0]; // curret row number
                int c = stones[i][1];  // itteration col number
                int d = stone[1];  // current col number
                if(!visited[i] && (a==b || c==d)){
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
   }
}
