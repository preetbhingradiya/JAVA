public class Linear_target {
    public static void main(String[] args) {
        int arr[] = {3, 21, 1, 18, 9, 0};
        int target = 0;
        System.out.println(findTargetBool(arr, target, 0));
    }

    static int findTarget(int[] arr, int target, int index){
        if(index==arr.length) return -1;
        if(arr[index]==target) return arr[index];
        return findTarget(arr, target, index+1);
    }

    static boolean findTargetBool(int[] arr, int target, int index){
        if(index==arr.length) return false;
        return (arr[index]==target) || findTargetBool(arr, target, index+1);
    }
}
