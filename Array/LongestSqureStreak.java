
import java.util.Arrays;
import java.util.HashMap;

public class LongestSqureStreak {

    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 16, 8, 2};
        System.out.print(longestSquareStreak(nums));
    }

    public static int longestSquareStreak(int[] nums) {
        Arrays.sort(nums); //sort the array first

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = -1;

        //travel for last of
        for (int i = nums.length - 1; i >= 0; i--) {
            int current = nums[i];
            if (map.containsKey(current * current)) {
                map.put(current, map.get(current * current) + 1); //if sequre of current is presetn in map update the vale of it
            } else {
                map.put(current, 1); //otherwise just add one
            }

            max = Math.max(max, map.get(current));
        }

        if (max == 1) return -1;

        return max;
    }

}
