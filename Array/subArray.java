public class subArray {
    
    public static void subsArray(int[] arr){
        int Total=0,maximumSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                Total=0;
                for(int k=i;k<=j;k++){
                    System.out.print( "(" + arr[k]+ ")");
                    Total  += arr[k];
                }

                if(maximumSum<Total){
                    maximumSum=Total;
                }
                System.err.print("Total sum of pairs is :- " +Total);
                System.out.println();
            }
        }
        System.out.print("Maximum sum Of pair is :- " + maximumSum);
    }
    public static void main(String[] args){

        int [] arr= {2,4,6,8,10};
        subsArray(arr);
    }
}
