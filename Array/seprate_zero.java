import java.util.Arrays;

public class seprate_zero {
    public static void main(String args[]){
        int[] nums={1,2,0,3,0,2};
        // System.out.println(nums.length);

        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }

        while (count<nums.length) {
            nums[count]=0;
            count++;
        }

        System.out.println(Arrays.toString(nums));

    }
}
