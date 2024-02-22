
public class counting_sort {

    public static void countingSort(int arr[]){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }

        //frequency
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            for(int k=0;k<count[i];k++){
                arr[j++]=i;
            }
        }

    }
    
    public static void main(String[] args){
        int [] arr={5,1,1,2,0,0};
        
        countingSort(arr);      
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
/*
 * explanation 5,1,1,2,0,0
 * max number is 5 so range is 0 to 5
 * count the arr element
 * 0    1  2
 * 1    1  2
 * 2       1
 * 3       0
 * 4       0
 * 5       1
 * 
 * count array is 2,2,1,0,0,1
 *        index = 0,1,2,3,4,5
 * travese in array
 * 0 is 2 time
 * 1 is 2 time
 * 2 is 1 time
 * 3 is 0 time so not count
 * 4 is 0 time so not count
 * 5 is 1 time 
 * 
 * output
 * 0,0,1,1,2,5
 */
