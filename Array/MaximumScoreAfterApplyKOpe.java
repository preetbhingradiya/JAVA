//find the largest number for every time in priorityqueue
//Apply formula ceil(nums[i] / 3 in largest numfer stil k is not 0
// example = [1,10,3,3,3]  => 10 / 3 = (double) 3.33 = >4
//[1,4,3,3,3] => 4/3 = (double) 1.33 => 2
//[1,2,3,3,3] => 2/3 = (doble) 0.66 => 1
// k = 3 so output is maxmium of every list is 10 + 4 + 3 = 17

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumScoreAfterApplyKOpe {
    
    public static void main(String[] args) {
        int[] nums = {1,10,3,3,3};
        int k = 3;

        System.out.print(maxKelements(nums, k));
    }

    public static long maxKelements(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b - a;
            }
        });
        for(int num : nums){
            pq.add(num);
        }

        long score = 0;

        while(k > 0){
            
            int top = pq.poll();

            score += top;

            top = (int) Math.ceil((double)top / 3);
            pq.add(top);

            //use of any one formula
            // pq.add((top + 2) / 3);

            k--;
        }

        return score;
    }
}