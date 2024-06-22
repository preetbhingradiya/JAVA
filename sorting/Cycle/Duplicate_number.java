import java.util.Arrays;

public class Duplicate_number {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2 };
        System.out.println(sort(arr));
    }

    static int sort(int[] arr) {
        int i = 0;

        if (arr[i] != i + 1) { // 3 != 1
            while (i < arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            }
        } else {
            i++;
        }

        return -1;
        // {
        //     while (i < arr.length) {
        //         int correct = arr[i] - 1;
        //         if (arr[i] != arr[correct]) {
        //             swap(arr, i, correct);
        //         } else {
        //             i++;
        //         }
        //     }
        //     for (int index = 0; index < arr.length; index++) {
        //         if (arr[index] != index + 1) { // 1 != 0+1 == 1 != 1 false
        //             return arr[index];
        //         }
        //     }
        //     return arr.length;
        // }

    }

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
