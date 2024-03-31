public class trapping_water {
    public static int trappedWater(int hight[]) {
        int n = hight.length;
        // calculate left max Boundery
        int[] leftMax = new int[n];
        leftMax[0] = hight[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(hight[i], leftMax[i - 1]);
        }

        // calculate right max boundery
        int rightMax[] = new int[n];
        // it will be start last element of right side
        rightMax[n - 1] = hight[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(hight[i], rightMax[i + 1]);
        }

        // loop
        int trappeWater=0;
        for(int i=0;i<n;i++){
            // waterlevel = min(maxleft boundery , maxright boundery)
            int waterLevel=Math.min(rightMax[i], leftMax[i]);

            // trapped water = waterlevel - hight * width All time with is 1
            trappeWater += waterLevel - hight[i];
        }
        return trappeWater;
    }

    public static void main(String[] args) {
        int[] hight = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("maximu store water :- " + trappedWater(hight));
    }
}

// trapper water = (water level - height) * width //(width=1)
// water level = minimum(maximumRight boundary, maximumLeft boundary)