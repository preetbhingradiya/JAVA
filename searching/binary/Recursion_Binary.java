public class Recursion_Binary {
    public static void main(String[] args) {
        int[] arr = {1,5,9,11,34,90};
        int target = 90;
        System.out.println(recursionBinary(arr, target, 0, arr.length-1));
    }

    public static int recursionBinary(int[] nums , int target,int start,int end){
        if ( start > end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(nums[mid] < target){
            return recursionBinary(nums, target, mid+1, end);
        }else if(nums[mid] > target){
           return recursionBinary(nums, target, start, mid-1);
        }

        return mid;
    }
}
