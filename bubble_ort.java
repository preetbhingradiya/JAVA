public class bubble_ort {

    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print( array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={7,8,3,2,1};

        for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    // without third variable
                    // arr[i]=arr[i]+arr[j];
                    // arr[j]=arr[i]-arr[j];
                    // arr[i]=arr[i]-arr[j];
                }
           }
        }        
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
        printArray(arr);
    }
}
