
public class Missing_number {
    public static void main(String[] args) {
        int[] nums = { 4, 0, 2, 1 };
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;

        while(i < n){
            int current = nums[i];   //array rang wil be 0 -> n menas index queal

            if(nums[i] < n && nums[i] != nums[current]){   // 4 < 4  && 4 != nums[4] = 4 != 1   // here also check the element is equal to length so not swap any other skipp and i++
                swap(nums, i , current);
            }else{
                i++;
            }
        }

        for(int index=0;index<n;index++){
            if(nums[index] != index){   // after sorted [0 , 1 , 2 , 4] all elemnet is equel to index if no any one return this index
                return index;
            }
        }

        return n;
    }

    public static void swap(int[]  nums , int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
