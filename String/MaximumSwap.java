public class MaximumSwap {
    
    public static void main(String[] args){
        System.out.print(maximumSwap(2736));
        //max is 7 and first is 3 swap 7 and 3
    }


    public static int maximumSwap(int num) {
        
        char [] digits = Integer.toString(num).toCharArray();

        int n = digits.length;

        //store the last element and last index 
        char maxElement = digits[n-1];
        int maxElementIndex = n-1;

        //only one swap is requird is max elelemt with first elemt of num
        int swapIndex1 = -1;
        int swapIndex2 = -1;

        for(int i=n-2; i>=0; i--){
            //find the maximum num of nums  and index
            if(digits[i] > maxElement){
                maxElement = digits[i];
                maxElementIndex = i;
            }else if(digits[i] < maxElement){ //if the current element is grater than max elelemt store current and max index poisible it can swap
                swapIndex1 = i;
                swapIndex2 = maxElementIndex;
            }
        }

        if(swapIndex1 != -1){
            char temp = digits[swapIndex1];
            digits[swapIndex1] = digits[swapIndex2];
            digits[swapIndex2] = temp;        
        }

        return Integer.parseInt(new String(digits));

    }

}
