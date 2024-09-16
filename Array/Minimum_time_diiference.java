
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_time_diiference{
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        
        list.add("11:00");
        list.add("07:30");
        list.add("08:90");
        list.add("11:30");

        System.out.print(findMinDifference(list));
    }

    public static int findMinDifference(List<String> timePoints) {
        //11:00  07:30  08:90 11:30
        //660.   450.   570   690  ( (hours * 60) + min) 1 hours = 60min
        int[] mins = new int[timePoints.size()];

        for(int i=0; i<timePoints.size(); i++){
            String hours = timePoints.get(i).substring(0,2);
            String min = timePoints.get(i).substring(3);

            int minValue = Integer.parseInt(hours) * 60 + Integer.parseInt(min);
            mins[i] = minValue;
        }        

        Arrays.sort(mins);
        //after this => [450, 570, 660, 690]
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<timePoints.size()-1; i++){
            int minvalue = mins[i+1]- mins[i];
            ans = Math.min(ans, minvalue);
        }

        // in avergae case suppose 00:00 and 23:59 then 0 and 1439 => 1439 soans is not correct
        //bcz here 00:00 is count as 24:00 hours => 1440 - 1439 = 1 ANS
        return Math.min(ans, 24*60 - mins[mins.length-1] + mins[0]);
    }
}