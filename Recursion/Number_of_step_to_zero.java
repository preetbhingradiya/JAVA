/**
 * Number_of_step_to_zero
 */
public class Number_of_step_to_zero {
    /*
     * Step 1) 8 is even; divide by 2 and obtain 4.
     * Step 2) 4 is even; divide by 2 and obtain 2.
     * Step 3) 2 is even; divide by 2 and obtain 1.
     * Step 4) 1 is odd; subtract 1 and obtain 0.
     * 
     * if the numer is even divide by 2 or odd number substrac 1 
     */
    public static void main(String[] args) {
        int n = 8;
        System.out.println(countOfSteps(n, 0));
    }

    public static int countOfSteps(int num, int step) {
        if (num == 0)
            return step;

        boolean current = num % 2 == 0;
        if (current)
            return countOfSteps(num / 2, step + 1);
        return countOfSteps(num - 1, step + 1);
    }
}