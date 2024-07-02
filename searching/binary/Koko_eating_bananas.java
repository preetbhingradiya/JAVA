/*here minum hours are return to eat all bananas
supose 1 bananas eating time is 1 hours
1) find maximum number
2) use this 1 to maximum find mid check this mid is true for the eating banans and they all hours sum is equal to original hours
3) check all bananas eating sum is samller to original hours means ans is left part mid-1
4) otherwise ans is right part mid+1

ex = max =11 , h =8
1,2,3,4,5,6,7,8,9,10,11
mid = 6
1 banana = 1hours
[3,6,7,11] = HOURS[1,1,2,2] = sum is(6 is samller to 8) mid-1;
1,2,3,4,5
mid = 3
[3,6,7,11] = HOURS [1,2,3,4] = sum is(10 is greter to 8) mid+1;
4,5
mid  = 4
[3,6,7,11] = Hours[1,2,2,3] = sum is (8 is greater then or equal to 8) return 4; 
*/

public class Koko_eating_bananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h =8;        
        int maxPiles = piles[0];
        for(int pile:piles){
            maxPiles = Math.max(pile,maxPiles);
        }
        System.out.println( findMinimumK(piles,h,1,maxPiles));
    }

    public static int findMinimumK(int[] piles,int h,int low,int high){

        while(low<=high){
            int mid = low + (high-low)/2;
            long totalhours = calculatTotalHors(piles , mid);

            if(totalhours <= h) {
                high=mid-1;
            }else{
                low = mid+1;
            } 
        } 

        return low;
    }

    public static long calculatTotalHors(int[] piles , int hourly){
        long totalH=0;
        for(int i=0;i<piles.length;i++){
            totalH += (piles[i] + hourly - 1) / hourly;
            // totalH += (long) Math.ceil((double) piles[i] / hourly);
        }
        return totalH;
    }
}
