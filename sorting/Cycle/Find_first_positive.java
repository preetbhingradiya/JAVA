public class Find_first_positive {
    public static void main(String[] args) {
        int []  nums = {3,4,-1,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;

        while(i < n){
            int current = nums[i] - 1; 

            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[current]){
                swap(nums, i , current);    
            }else{
                i++;
            }
        }

        for(int index=0;index<n;index++){
            if(nums[index] != index+1){
                return index+1;
            }
        }

        return n + 1;
    }

    public static void swap(int[]  nums , int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
