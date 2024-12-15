/* Choose any two adjacent elements of matrix and multiply each of them by -1.
 * You can do the following operation any number of times
 * find the maximu sum of this
 * if the odd negative number so after count all total sum - 2*miniNegative value
 * and if even negative number so no need to any
 */

public class MaximumMatrixSum{
    public static void main(String[] args){
        int[][] matrix = {{1,2,3}, {-1,-2,-3}, {1,2,3}};
        System.err.println(maxMatrixSum(matrix));
    }


    public static long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int minAbsVal = Integer.MAX_VALUE;
        int negativeCount=0;

        for(int[] row : matrix){
            for(int val : row){
                totalSum += Math.abs(val);   //add all the value ingore - sign
                if(val < 0) negativeCount++;
                minAbsVal = Math.min(minAbsVal, Math.abs(val));
            }
        }

        //if sum is odd reduce the genatice number in 2 time becuse first time as count of totlasum and after - this value
        if(negativeCount % 2 != 0){ //if negatice is not odd
            totalSum -= 2 * minAbsVal;
        }

        return totalSum;
    }
}