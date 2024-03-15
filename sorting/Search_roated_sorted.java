
public class Search_roated_sorted {

    public static int searchElement(int[] arr,int target,int start,int end){

        if(start>end) return -1;

        int mid = start + (end-start)/2;

        if(arr[mid]==target) return mid;

        // if(arr[start]==target) return start;

        //left part
       if(arr[start]<=arr[mid]){
            if(arr[start] <= target && target<=arr[mid]){
               return searchElement(arr, target, start, mid-1);
            }
            else{
               return searchElement(arr, target, mid+1,end);
            }
       }


       //right part
       else{
            if(arr[mid]<=target && target<=arr[end]){
               return searchElement(arr, target, mid+1,end);
            }
            else{
                return searchElement(arr, target, start, mid-1);
            }
       }
    }

    public static void main(String[] args){
        int[] arr ={5,1,2};
        int target = 5;

        int index= searchElement(arr, target,0,arr.length-1);
        System.out.println("Index is target of :- "+ index);
    }
    
}
