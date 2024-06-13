package binary;
public class binary_search {
    public static int binarySearch(int arr[],int key){
        int first=0;
        int last=arr.length-1;
        
        while(first<=last){
            int mid=(first+last)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args){
        int[] arr={2,4,6,7,10,12,14};
        int key = 90;

        int index=binarySearch(arr,key);
        if(index==-1){
            System.out.println("Key is not present");
        }
        else{
            System.out.println("Key is Present in array");
        }
    }
}
