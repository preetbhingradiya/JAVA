import java.util.Arrays;

public class Buuble_sort {
    public static void main(String[] args) {
        int[] arr = { 10, 8, 3, 0, 78, 11,-1 };
        // BubbleSort(arr, arr.length-1, 0);
        BubbleSort1(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort1(int[] arr, int i, int j) {
        if (i == arr.length-1) {
            return;
        }
  
        if(j < arr.length){  //here check every first time smallest element are take place one first after.
            if (arr[i] > arr[j]) {
             arr[i] = arr[i] + arr[j];
              arr[j] = arr[i] - arr[j];
              arr[i] = arr[i] - arr[j];
            }
              BubbleSort1(arr, i, j+1);  // here in first time arr[0] compare all the other element {0,10,23,8,78,11}
        }else{
            BubbleSort1(arr, i+1, i+2); // here i = i+1 and j = i+2
        }
    }
}
