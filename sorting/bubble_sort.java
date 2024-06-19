package sorting;
// in this sort check the current element is largest then next element swap two number
public class bubble_sort {

    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print( array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={7,8,3,2,1};
        boolean swapped ; //if the array is sorted this time

        for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swapped = true;

                    // without third variable
                    // arr[i]=arr[i]+arr[j];
                    // arr[j]=arr[i]-arr[j];
                    // arr[i]=arr[i]-arr[j];
                }
           }

           if(!swapped) break; //it menas swapped is false so no any first time swapp any value so it can swapp
        }        
        printArray(arr);
        
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //          if(arr[j]>arr[j+1]){
        //              //swap
        //              int temp=arr[j];
        //              arr[j]=arr[j+1];
        //              arr[j+1]=temp;
        //          }
        //     }
        //  }
    }
}
