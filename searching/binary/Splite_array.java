/*
 * start = 10 (max)
 * end = 32 (sum)
 * mid = 10 + 32 /2 = 21
 * array = [7,2,5,10,8]
 * sub array is [7,2,5] = 14  AND [8,10] = 18 both are less or equal to mid 21
 * here count is 2  becuse two new sub array is create
 * 
 * couut (2) > k (2) ? start = mid+1(increse the value of mid) : end = mid(decrese the value of mid)
 * 
 * here start = 10 , end = 21
 * mid = 15
 * sub array is [7,2,5] = 14  AND [8]=8  AND [10] = 10 three are less or equal to mid 15
 * here count is 3 becuse three new sub array is create
 * 
 * count > 2 so start = mid+1
 * 
 * 
 * here start = 16 , end = 21
 * mid = 18
 * sub array is [7,2,5] = 14  AND [8,10] = 18 both are less or equal to mid 18
 * here count is 2 becuse two new sub array is create
 * 
 * end = mid
 * 
 * here start = 16 , end = 21
 * mid = 18
 * sub array is [7,2,5] = 14  AND [8,10] = 18 three are less or equal to mid 18
 * here count is 2 becuse two new sub array is create
 * 
 * end = mid
 * 
 * here start = 16 , end = 18
 * mid = 17
 * sub array is [7,2,5] = 14  AND [8] AND [10] = 10 three are less or equal to mid 15
 * here count is 3 becuse three new sub array is create
 * 
 *  count > 3 so start = mid+1
 * 
 * start = 18 ,end = 18   mid is also = 18 So no any change to divede it
 */


 public class Splite_array {

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k =2;
        System.out.println(splitArray(nums, k));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0; //maxElement
        int end = 0; //sum

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start , nums[i]); //here find the MAX element
            end += nums[i]; // store the array sum
        }

        while (start < end) {
            int mid = start + (end - start)/2;

            //calculate how many count you can divide this in with this max sum
            int sum = 0;
            int count = 1;
            for (int num : nums) { // supose the mid is 21 so the array sum is [7,2,5] = 14 AND no add next element is 8 otherwise sum is 22
                if(sum + num > mid){
                    //you can't add  this in this subarray , make new subarray 
                    //now the new sum is current sum value 
                    sum = num;
                    count ++; //buz here make new subarray
                }else{
                    sum += num;
                }
            }

            //here check how many subArray is create if the subarray count is less to the K then increse start otherwise decrese end
            if(count > k) {  //indivisuol count of array sum is greater to k 
                start = mid +1;
            }else{
                end = mid;
            }

        }

        return start; // or end buz the after the end start and end are equale
    }

}