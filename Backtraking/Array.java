
public class Array {

    public static void pushData(int [] arr,int i){
        if(i==arr.length){ 
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j] + " ");
            }
            return;
        }
        arr[i++]=i;
        pushData(arr, i);
    }

    public static void main(String[] args){
        int[] arr=new int[5];
        pushData(arr,0);
    }
}