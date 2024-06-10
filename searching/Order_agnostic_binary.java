
public class Order_agnostic_binary {

    static int orderAgnostic(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean orderAgnostic = true;
        if (arr[s] > arr[e]) {
            orderAgnostic = false;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target)
                return mid;

            if (orderAgnostic) {
                if (arr[mid] < target) {
                    s = mid + 1;
                } else if (arr[mid] > target) {
                    e = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    e = mid - 1;
                } else if (arr[mid] > target) {
                    s = mid + 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        // int[] arr = { -7, -3, -1, 0, 5, 9, 11, 55, 90 };
        int[] arr = { 90, 55, 11, 5, 9, 0, -1, -3, -7 };
        int target = 55;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

}