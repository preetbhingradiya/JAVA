
import java.util.Arrays;

public class Find_missing_observation {

    public static void main(String[] args) {
        int[] rolls = {1, 5, 6};
        int m = 3;
        int n = 4;
        int[] ans = missingRolls(rolls, m, n);
        //here ans length is = n;
        System.out.println(Arrays.toString(ans));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int result[] = new int[n];
        int m = rolls.length;
        int sum = mean * (n + m);
        for (int roll : rolls) {
            sum -= roll;
        }

        if (sum < n || sum > 6 * n) {
            return new int[0];
        }

        int avg = sum / n;
        int reminder = sum % n;
        for (int i = 0; i < n; i++) {
            result[i] = avg;
            if (reminder > 0) {
                result[i]++;
                reminder--;
            }
        }

        return result;
    }
}
