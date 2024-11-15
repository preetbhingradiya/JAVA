/* remove minimum length subarray to make sorted array
Remove is [10,4,2] so length is 3
Return ans is 3
*/


public class RemoveShortedSubArrToMakeArrSorted {

    public static void main(String[] args){
        int[] arr = {1,2,3,10,4,2,3,5};
        int ans = findLengthOfShortestSubarray(arr);
        System.out.println(ans);
    }


    public static int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;

        // Find the longest non-decreasing prefix
        int left = 0;
        while(left < n-1 && arr[left] <= arr[left+1]) left++;

        //Array is alredy sorted
        if(left == n-1) return 0;

        // Find the longest non-decreasing suffix
        int right = n-1;
        while(right > 0 && arr[right-1] <= arr[right]) right--;
        
        // Find the minimum length to remove by comparing prefix and suffix
        int result = Math.min(n-left-1, right);

        // Use two pointers to find the smallest middle part to remove
        int i=0, j=right;
        while(i<=left && j<n){
            if(arr[i] <= arr[j]){
                result = Math.min(result, j-i-1);
                i++;
            }else{
                j++;
            }
        }

        return result;

    }
}