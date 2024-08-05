import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int [] arr = {10, 8, 3, 0, 78, 11,-1};
        QuickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }   
    
    static void QuickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int start = low ;
        int end = high;
        int mid = start + (end - start)/ 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {  //here check every time pivot is greate to all left element so start++
                start++;
            }

            while (arr[end] > pivot) { //here check every time pivot is smaller to all right element so end--
                end--;
            }

            //so here pivot is right position 
            if(start <=  end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            //After one travel high and low are same ike 0 and 6
            //but start is -- 1 and end is -- 5
        }

        //After the pivot is set is one correct postion
        //[-1,0,3,8,78,11,10] 0 was pivot so it set correct postion
        QuickSort(arr, low, end);  // pass the (arr,0,0=pivot) 0 -> pivot  it callled left part
        QuickSort(arr, start, high); // it called right part and check pivot is correct all other element
    }
}
