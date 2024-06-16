public class Find_count_of_sorted_roated {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6, 8 };
        int count = 0;

        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[0] <= arr[arr.length - 1]) {
                break;
            }

            if (arr[mid] == arr[0]) {
                count = e;
                break;
            }

            if (arr[mid] == arr[arr.length - 1]) {
                count = e;
                break;
            }

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                count = mid;
                break;
            }

            if (arr[mid] < arr[mid - 1]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        System.out.print(count == 0 ? count  : count+1);
    }
}
