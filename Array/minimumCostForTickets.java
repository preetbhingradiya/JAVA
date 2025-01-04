/* here costs size is 3 fix and day for cost is 1,7,30
 *  a 1-day pass is sold for costs[0] dollars,
    a 7-day pass is sold for costs[1] dollars, and
    a 30-day pass is sold for costs[2] dollars.
    
    find minimum number of dollar for travel tickets
 */

import java.util.Arrays;
import java.util.HashSet;

public class minimumCostForTickets {

    //top to bottom approach use of dp memorize

    private static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args){
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};
    }

    public static int mincostTickets(int[] days, int[] costs) {
        // int maxDays = days[days.length - 1] + 30;
        // int[] dp = new int[maxDays + 1];
        // Arrays.fill(dp, -1);

        // for(int day : days)
        //     set.add(day);
        
        // return recur(days, costs, days[0], dp); //start from 1 days value

        // Bottom to top approach in dp
        int lastDay = days[days.length - 1] + 30;
        int dp[] = new int[lastDay + 1];
        for(int day : days)
            set.add(day);
        
        for(int day = days[days.length - 1]; day>=0; day--){
            if (!set.contains(day)) {
                dp[day] = dp[day + 1]; //recur(dp, days, costs, day + 1); 
                continue;
            }
            int oneDay = costs[0] + dp[day+1]; //recur(dp, days, costs, day + 1);
            int sevenDay = costs[1] + dp[day+7]; //recur(dp, days, costs, day + 7);
            int thirtyDay = costs[2] + dp[day+30]; //recur(dp, days, costs, day + 30);
            dp[day] = Math.min(oneDay, Math.min(sevenDay, thirtyDay));
        }
        return dp[days[0]];
    }

    private static int recur(int[] days, int[] costs, int currDay, int[] dp){
        if(currDay > days[days.length-1]){
            dp[currDay] = 0;
            return 0;
        }

        if(dp[currDay] != -1)
            return dp[currDay];

        if(!set.contains(currDay)){
            dp[currDay] = recur(days, costs, currDay + 1, dp);
            return dp[currDay];
        }
        
        int oneDay = costs[0] + recur(days, costs, currDay + 1, dp);
        int secondDay = costs[1] + recur(days, costs, currDay + 7, dp);
        int thirdDay = costs[2] + recur(days, costs, currDay + 30, dp);

        dp[currDay] = Math.min(oneDay, Math.min(secondDay, thirdDay));
        return dp[currDay];
    }
}
