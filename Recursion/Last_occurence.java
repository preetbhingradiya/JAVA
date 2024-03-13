
public class Last_occurence {


    //start arr to reverse and print the first same value and key this is last occurrence
    
    public static int lastOccurence(int[] arr,int i){
        int key=5;
        if(i==0) return -1;
        if(key==arr[i]) return i;

        return lastOccurence(arr,i-1);
    }

    public static void main(String[] args) {
        int [] arr={8,3,6,9,5,10,2,3,4,5,2,6,2};
        System.out.println("Last occurence index is :- " + lastOccurence(arr,arr.length-1));
    }
}