public class Find_position_infinit {
    // suppose the array size is infinite means arr.length is not use here
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 24}; // ...infinite // array
        int target = 7;

        int start = 0;
        int end = 1;
        int ans = -1;

        while (arr[end] < target) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2; // here the double the size of start and end
            start = newStart;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                break;
            }
        }

        System.out.println(ans);
        // System.out.println(end);
    }
}
