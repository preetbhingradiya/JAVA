public class subArray {
    
    public static void subsArray(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print( "(" + arr[k]+ ")");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){

        int [] arr= {2,4,6,8,10};
        subsArray(arr);
    }
}
