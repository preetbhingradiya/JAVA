import java.util.Arrays;

class Fliping_image {

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int n = row.length;
            for (int i = 0; i < (n + 1) / 2; i++) {
                // Flip and invert simultaneously
                int temp = row[i] ^ 1; // Invert first element
                row[i] = row[n - i - 1] ^ 1; // Invert the opposite element
                row[n - i - 1] = temp; // Set the opposite element
            }
        }
        return image;
    }
}