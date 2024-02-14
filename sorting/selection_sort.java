package sorting;
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
        for(int i=0;i<arr.length-1;i++){
            int temp=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[temp]>arr[j]){
                    temp=j;
                }
            }
            int val=arr[temp];
            arr[temp]=arr[i];
            arr[i]=val;
        }
        printArray(arr);
    }
}
