import java.util.ArrayList;

public class MaxSumWithK {
    
    public static void main(String[] args){
        int n = 4;
        int k = 2;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        // index 3 and 4 sum is maximum 300 + 400 = 700
        System.err.println(maximumSumSubarray(k, list, n));
    }

    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        long maxSum = 0;
        long sum = 0;
        
        
        int index = 0;
        //first found sum of first K size (k=2 so sum 100+200)
        while(index < N && index < K){
            sum += Arr.get(index);
            index++;
        }
        
        maxSum = sum;
        //after that every sum remove -1 prev value index than add +1 index value
        for(int i=1; i < N - K + 1; i++){
            int prevElement = Arr.get(i-1);
            int nextElement = Arr.get(i + K -1); //(4 - 2 + 1 = 3)
            sum = ((sum - prevElement) + nextElement);
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }

}
