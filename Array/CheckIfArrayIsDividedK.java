public class CheckIfArrayIsDividedK {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,6,7,8,9};
        int k = 5;

        System.out.print(canArrange(arr,k));
    }
    
    public static boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];

        for(int num : arr){
            int rem = num % k;
            if(rem < 0){  //if rem is nagative so add k to positive
                rem = rem + k;
            }

            freq[rem]++;
        }

        //here only one pairs is same bcz rem = 0 menas k is than num is 5 = 0
        //k is 5 than num is 10 = 0 (5,10)
        if(freq[0] % 2 != 0) return false;

        for(int i=1; i<=k/2; i++){
            if(freq[i] != freq[k-i]) return false;
        }

        return true;
    }
}
