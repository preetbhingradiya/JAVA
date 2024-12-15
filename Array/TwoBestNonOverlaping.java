/*  sort array in start time
 *  here three value in every array like [startTime, EndTime, value]
 * 
 *  sort end time in Queue And
 *  find max with res OR res+Val
 * 
 *  url = https://leetcode.com/problems/two-best-non-overlapping-events/
 */



import java.util.Arrays;
import java.util.PriorityQueue;

public class TwoBestNonOverlaping {

    public static void main(String[] args){
        Result res = new Result();
        int[][] events = {{1,3,2}, {4,5,2}, {2,4,3}};
        
        System.out.println(res.maxTwoEvents(events));
    }
    
}

class Result{

    public static int maxTwoEvents(int[][] events) {

        //sort end time
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        //sort on start time
        Arrays.sort(events, (a,b) -> a[0] - b[0]);

        int prevMax = 0;
        int res = 0;

        for(int event[] : events){

            //find prevMax with queue is not empty && queueEnd time < current start time
            while(!queue.isEmpty() && queue.peek()[1] < event[0]){
                prevMax = Math.max(prevMax, queue.peek()[2]);
                queue.poll();   
            } 

            //find max res and prevMax + current[val]
            res = Math.max(res, prevMax + event[2]);
            queue.offer(event);
        }

        return res;
    }
}