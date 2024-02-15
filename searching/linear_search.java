public class linear_search {

    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return arr[i];
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr={2,4,6,8,10,12,14,16};
        int target=12;
        int index=linearSearch(arr, target);
        if(index==-1){
            System.out.println("Key is not present");
        }
        else{
            System.out.println("Key is Present in array");
        }
    }    
}
