
public class Quick_sort {

    public static int partition(int []arr,int start , int end){
        int pivot = arr[end];  //last element;
        int i =start-1; //to make place for element

        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //after this loop over then
       //i                  i
       //3,6,9,8,2,5  ->  3,2,9,8,6,5
        i++;
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;

        //after this 
        // 3,2,5,9,8,6,5    pivot 5 is correct middle
        return i;
    }

    public static void quickSort(int []arr,int start , int end) {
        // int pivot = end;
        if(start>=end) return;

       int pivotIndex =  partition(arr,start,end);
       quickSort(arr, start, pivotIndex-1); //leftt part
       quickSort(arr, pivotIndex+1, end); //right part
    }

    public static void main(String[] args){
        int [] arr= {6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}
