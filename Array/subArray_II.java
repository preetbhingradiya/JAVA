public class subArray_II {

    public static void kadanes(int arr[]) {

        int maximumSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            //if any element is can be negetive that time is was convert into 0
            if (currentSum < 0) {
                currentSum = 0;
            }
            maximumSum=Math.max(currentSum, maximumSum);
        }

        System.out.print("Maximum sum is :- " + maximumSum);
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

        kadanes(arr);
    }
}
