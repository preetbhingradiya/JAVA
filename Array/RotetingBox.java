/* here roated the input box to move into 90 degree
 * 1) # is the reprasent the stone
 * 2) * is reprasent the stationary obstacle(Swall diwal)
 * 3) . is reprasent the empty sspace
 * so rotated the box form 80 degree to cover tha all space and also manage if * obstacle find break 
 */

//  url = https://leetcode.com/problems/rotating-the-box/description/

public class RotetingBox {

    public static void main(String[] args) {
        char[][] box = {{'#','#','*','.','*','.'}, {'#','#','#','*','.','.'}, {'#','#','#','.','#','.'}};
         char ans[][] = (rotateTheBox(box));
        

         for (int row = 0; row < ans.length; row++) {
            for (int col = 0; col < ans[0].length; col++) {
                System.out.print(ans[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] rotateTheBox(char[][] box){
        int m = box.length;    // Number of rows
        int n = box[0].length; // Number of columns

        char[][] rotatedBox = new char[n][m]; // Rotated box

        // Process each row to apply gravity before rotation
        for (int row = 0; row < m; row++) {
            int emptyIndex = n - 1; // The position where the next stone can fall
            for (int col = n - 1; col >= 0; col--) {
                if (box[row][col] == '#') {
                    // Move the stone down to the nearest empty position
                    box[row][col] = '.';
                    box[row][emptyIndex] = '#';
                    emptyIndex--;
                } else if (box[row][col] == '*') {
                    // Obstacle resets the empty position
                    emptyIndex = col - 1;
                }
            }
        }

        // Rotate the box 90 degrees clockwise
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                rotatedBox[col][m - 1 - row] = box[row][col];
            }
        }

        return rotatedBox;
    }

}