/* find the fargetFriend chair number here all time[0] is unique
so targetFriend = 1 = {1,4} here 1 is time[0]
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class NumberOfOcuripdChair {

    public static void main(String[] args){
        int[][] times = {{1,4}, {2,3}, {4,6}};
        int targetFriend = 1;

        System.out.print(smallestChair(times, targetFriend));
    }

    public static int smallestChair(int[][] times, int targetFriend) {
        int targetArrive = times[targetFriend][0];

        //sort the array
        Arrays.sort(times, new Comparator<int[]>(){
            public int compare(int a[], int b[]){
                return a[0] - b[0];
            }
        });

        //[ArriveItem, chairNo] in sorted order
        PriorityQueue<int[]> occupied = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });

        //Available chair
        PriorityQueue<Integer> available = new PriorityQueue<>();
        int chairNo = 0;

        for(int time[] : times){
            int arrTime = time[0]; //Time when frd is come
            int leavingTime = time[1]; //Time when frd is out


            //here check store occupid time is grater than current time pull previous time
            while(!occupied.isEmpty() && occupied.peek()[0] <= arrTime){
                available.offer(occupied.poll()[1]); // push chair number
            }

            int currentChairNo = 0;

            if(available.isEmpty()){
                currentChairNo = chairNo;
                chairNo++;
            }else{
                currentChairNo = available.poll();
            }

            if(targetArrive == arrTime) return currentChairNo;

            //add time and chair no
            occupied.offer(new int[]{leavingTime, currentChairNo});
        }

        return -1;

    }
}