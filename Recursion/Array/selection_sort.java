import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int [] arr = {10, 8, 3, 0, 78, 11,-1};
       SelectionSort(arr, 0);
       System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort (int[] arr, int i){
        if(i==arr.length) return;

        int maxIndex = FindMaxelement(arr, i, i);

        if(maxIndex != i){
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        SelectionSort(arr, i+1);
    } 

    static int FindMaxelement(int[]arr, int i, int max){
        if(i==arr.length) return max;

        if(arr[max] > arr[i]){
            max = i;
        }

        return FindMaxelement(arr, i+1, max);
    }
