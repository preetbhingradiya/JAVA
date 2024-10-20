import java.util.*;

//find the reng of all list to cover minimum one element arer include in this range
// approach is  every list one-one element is check and get min and max value
//here = {4,0,0} - >. {0,1,0} -> {5,2,0}  ={element, listIndex, elemnetIbndex}
// min = 0 , max = 5 so still check no one list is empty
//min value can move next like =  {4,0,0} - >. {9,1,1} -> {5,2,0} update in 1 list

public class FindSmallestListToCoverAll{
    public static void main(String[] args){
        List<List<Integer>> nums = Arrays.asList(
            Arrays.asList(4, 10, 15, 24, 26),
            Arrays.asList(0, 9, 12, 20),
            Arrays.asList(5, 18, 22, 30)
        );

        int[] result = smallestRange(nums);
        System.out.println("Smallest Range: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] smallestRange(List<List<Integer>> nums) {

        //[Element, ListIndex, ElemrntIndex]
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];  //inc
            }
        });

        int k = nums.size();
        int max = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            int minValue = nums.get(i).get(0); //firsrt element of every list and add in pq
            pq.offer(new int[]{minValue, i, 0});
            max = Math.max(max, minValue);
        }

        int[] minRange = {0, Integer.MAX_VALUE};

        //infinite loop
        while(true){
            int top[] = pq.poll();
            int minElement = top[0], listIndex = top[1], elementIndex = top[2];

            if(max - minElement < minRange[1] - minRange[0]){
                minRange[0] = minElement;
                minRange[1] = max;
            }
            
            // if any of lst is empty break the loop
            if(elementIndex == nums.get(listIndex).size() - 1) break;

            int next = nums.get(listIndex).get(elementIndex + 1);// move next element of current list
            max = Math.max(max, next);

            pq.offer(new int[]{next, listIndex, elementIndex+1});
        }

        return minRange;

    }
}