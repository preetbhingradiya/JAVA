import java.util.Arrays;

public class Largest_num {
    public static void main(String[] args){
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums){
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a,b)-> (b+a).compareTo(a+b));

        StringBuilder newStr = new StringBuilder();
        for(String str : arr){
            newStr.append(str);
        }

        return newStr.toString();
    }
}
