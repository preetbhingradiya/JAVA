
public class Array {

    public static void pushData(int [] arr,int i){
        if(i==arr.length){ 
            perintArray(arr);
            return;
        }
        arr[i]=i+1;
        pushData(arr, i+1);
        arr[i]=arr[i]-2;  //backtracking step reverse
    }

    public static void perintArray(int[] arr) {
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr=new int[5];
        pushData(arr,0);
        perintArray(arr);
    }
}