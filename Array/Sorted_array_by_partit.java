import java.util.Arrays;

public class Sorted_array_by_partit {

    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        arr = sortArrayByParityII(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;
        int i = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = nums[i++];
                evenIndex += 2;
            } else {
                result[oddIndex] = nums[i++];
                oddIndex += 2;
            }
        }
        return result;
    }

}