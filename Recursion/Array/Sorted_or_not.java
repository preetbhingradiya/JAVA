public class Sorted_or_not {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 9, 8};
        System.out.println(SortedOrNot(arr,0));
    }    

    static boolean SortedOrNot(int[] arr,int i){
        // if(arr[0] <= arr.length-1);
        if(i+1==arr.length) return true;
        if(arr[i] <= arr[i+1]) return SortedOrNot(arr, i+1);
        return false;
    }
}
