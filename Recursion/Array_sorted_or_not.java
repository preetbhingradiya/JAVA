
public class Array_sorted_or_not {

    public static boolean sortedOrNot(int[] arr,int i){
        
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1])
        {
           return false;
        }
        return sortedOrNot(arr, i+1);
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,6,5};
        int i=0;
        System.out.println(sortedOrNot(arr,i));
    }
}

/*  
    i=0
    arr[i]>arr[i+1]
    1>2 condition false so not execute 

    soredOrnot(arr,i+1) = (arr,2)

    i=2
    arr[i]>arr[i+1]
    2>3  condition false so not execute 
    soredOrnot(arr,i+1) = (arr,3)

    i=3
    arr[i]>arr[i+1]
    3>4 condition false so not execute 
    soredOrnot(arr,i+1) = (arr,4)

    i=4
    arr[i]>arr[i+1]
    4>6 condition false so not execute 
    soredOrnot(arr,i+1) = (arr,5)

    i=5
    arrr[i]>arr[i+1]
    6>5 condition true so execute becuse 6 is greter then 5 so return false
    array is not sorted
    .
    .
    .
    .
 */ 
