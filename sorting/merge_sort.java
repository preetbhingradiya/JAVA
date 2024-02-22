public class merge_sort {

    public static void conquer(int[] arr,int start,int mid,int end){
        int[] marge=new int[end-start+1];
        int index1=start;
        int index2 = mid+1;
        int x =0;
        while (index1<=mid && index2<=end) {
            if(arr[index1]<=arr[index2]){
                marge[x++]=arr[index1++];  
            }else{
                marge[x++]=arr[index2++];
            }
        }
        while (index1<=mid) {
            marge[x++]=arr[index1++];  
        }
        while (index2<=end) {
            marge[x++]=arr[index2++];
        }
        for(int i=0,j=start;i<marge.length;i++,j++){
            arr[j]=marge[i];
        }
    }

    public static void divided(int [] arr,int start,int end){
        if(start>=end){
            return;
        }
      int mid = (start+end)/2;
      divided(arr, start, mid);
      divided(arr, mid+1, end);
      conquer(arr,start,mid,end);
    }

    public static void main(String[] args){
        int [] arr={12, 11, 13, 5, 6, 7};
        int n=arr.length;
        divided(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/