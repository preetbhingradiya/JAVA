public class Insert_position_binary {

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end - start) /2;

            if(nums[mid]<target){
                start = mid + 1;
            }else if(nums[mid]>target){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return start;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};  //finde the smallest number it can largest or qual to 2
        //here 3 , 4 , 5
        int taregt = 2;
        System.out.println(searchInsert(nums, taregt));
    }   
}
