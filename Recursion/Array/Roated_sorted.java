public class Roated_sorted {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };
        int taregt = 7;
        System.out.println(RoatedSortedArray(arr, taregt, 0, arr.length-1));

    }

    public static int RoatedSortedArray(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int mid = s + (e - s) / 2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[s] <= arr[mid]){
            if(arr[s] <= target && target <= arr[mid]){  // left part max element of mid
                return RoatedSortedArray(arr, target, s, mid-1);
            }else{ // right part max element of mid
                return RoatedSortedArray(arr, target, mid+1, e);
            }
        }

        if(target >= arr[mid] && target <= arr[mid]){
            return RoatedSortedArray(arr, target, mid+1, e);
        }

        return RoatedSortedArray(arr, target, s, mid-1);
    }
}
