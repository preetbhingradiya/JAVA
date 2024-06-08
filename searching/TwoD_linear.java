import java.util.Arrays;

public class TwoD_linear {
    public static void main(String[] args) {
        int[][] arr = { { 12, -3 }, { 1111, 95, 0, -7 }, { 47, 78, 99 } };
        int taregt = -7;
        int[] ans = twoDlinear(arr, taregt);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoDlinear(int[][] arr, int taregt) {
        if (arr.length == 0)
            return new int[] { -1, -1 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == taregt) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }
}
