import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // 3 - 1 = 2 index
            if (arr[i] != arr[correct]) { // 3 != 2
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
