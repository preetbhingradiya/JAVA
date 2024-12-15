/* here every 2d array [passStudent, TotalStudent]
 * find every array rasio with passStudent / TotalStudent
 * so store the different betweeb current resio and afer adding 1 in bothe pass and total than resio
 * also check extraStudent != 0 still same a bove process
 * In Last all queue value and this total resio will return 
 * 
 * https://leetcode.com/problems/maximum-average-pass-ratio/description/
 */

import java.util.PriorityQueue;

public class MaximumPassResio {
    public static void main(String[] args){
        Solution sb = new Solution();

        int classes[][] = {{1,2}, {3,5}, {2,2}};
        int extraStudents = 2;
    
        System.out.println(sb.maxAverageRatio(classes, extraStudents));
    }
}


class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        
        //[diff, pass, total]
       PriorityQueue<double[]> pq = new PriorityQueue<>( (a,b) -> Double.compare(b[0],a[0]));
        //store differrent in desacding order (High Low)
        
        for(int arr[] : classes){
            int pass = arr[0];
            int total = arr[1];
            double diff = findDeff(pass, total);
            pq.offer(new double[]{diff, pass, total});
        }

        //include extra student in that class which will have highest pass redio
        while(extraStudents > 0){
            double arr[] = pq.poll();
            int pass = (int)arr[1] + 1;
            int total = (int)arr[2] + 1;
            double diff = findDeff(pass, total);
            pq.offer(new double[]{diff, pass, total});
            extraStudents -- ;  
        }

        double totalPassRatio = 0;
        while(!pq.isEmpty()){
            double arr[] = pq.poll();
            double pass = arr[1];
            double total = arr[2];
            totalPassRatio += (pass / total);            
        }

        return totalPassRatio / classes.length;
    }


    public double findDeff(int pass, int total){
        //add new pass and find diff
        return ((double) (pass + 1) / (total + 1)) - ((double) pass / total);
    }
}