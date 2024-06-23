import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_all_duplicate {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        int  n = nums.length;
        while(i < n ){
            int current = nums[i] - 1;
            if(nums[i] != nums[current]){
                swap(nums , i , current);
            }else{
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int index=0;index<n;index++){
            if(nums[index] != index+1){
                list.add(nums[index]);
            }
        }

        return list;
    }

    
    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
