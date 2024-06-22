// in this sort store the samallest number in every time after the swap smallest and largest elemst every time that formula work ann end of sorted array given 

public class selection_sort {
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print( array[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        int[] arr={7,8,1,3,2};
        // for(int i=0;i<arr.length-1;i++){
        //     int minposi=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[minposi]>arr[j]){
        //             minposi=j;
        //         }
        //     }
        //     int val=arr[minposi];
        //     arr[minposi]=arr[i];
        //     arr[i]=val;
        // }
        selection(arr);
        printArray(arr);
    }

    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){

            int last = arr.length-i-1;
            int maxIndex = getFindMaxIndex(arr,0,last);
            swap(arr, maxIndex , last); //swap every time max element int to last
        }
    }

    public static void swap(int[] arr , int start ,int end){
        if(start==end) return;  
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
    }

    public static int getFindMaxIndex(int[] arr , int start ,int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
