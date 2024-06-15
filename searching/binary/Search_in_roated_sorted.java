public class Search_in_roated_sorted {

    public static int binarySearch(int nums[],int key , int start , int end){
        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==key){
                return mid;
            }
            else if(nums[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int max = nums[0]; // find the max element in the array
        int pivot = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max <= nums[i]) {
                max = nums[i];
                pivot = i;
            }
        }

        int leftPart = binarySearch(nums, target, 0, pivot);
        if (leftPart != -1) System.out.println( leftPart); // it means the left part is target find other wise chack rigth side
        else{
          System.out.println(binarySearch(nums, target, pivot + 1, nums.length - 1));  
        }  // rigth part
    }
}
