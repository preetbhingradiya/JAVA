public class reverse_array {
    public static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end) {
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr={2,34,546,5123,34};
        
        reverseArray(arr);
    }
}
