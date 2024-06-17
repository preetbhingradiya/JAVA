import java.util.Arrays;

public class Two_sum_sorted {

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        System.out.print(Arrays.toString(sortedArray(nums , target)));
    }
    
    public static int[] sortedArray(int[] nums , int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            
            if(nums[start] + nums[end] == target){
                return new int[] {start+1 , end+1};
            }else if(nums[start] + nums[end] < target){
                start++;
            }else{
                end--;
            }
        }

        return new int[0];
    }
}
