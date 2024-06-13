package linear;
import java.util.Arrays;

public class Even_number_of_digit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(numberofDigit(nums));
    }

    static int numberofDigit(int[] nums){
        int count = 0;
        // for(int element : nums){
        //     String s = Integer.toString(element);
        //     int elementLength = s.length();
        //     if(elementLength % 2 ==0){
        //         count++;
        //     }
        // }

        for(int element : nums){
            if(even(element)){
                count++;
            }
        }

        return count;
    }

    static boolean even(int num){
        int numberofDigit = chechEven(num);
        return numberofDigit % 2 ==0;
    }

    static int chechEven(int num){
        int count =0;
        while(num > 0){
            count++;
            num = num / 10;
        }

        return count;
    }
}
