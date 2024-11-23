/* Count the maximum flip of pnly row to make equal row
 * 0 0 0
 * 0 0 1
 * 1 1 0
 * here in 1 row all three are 0 so no change
 * but in 2 and 3 row are reverse of alternative
 * here colum number 0, 1 change flip to queal row of both
 * (1,0) And (1,1) ^ 1 so 0 0 0
 * (2, 0) And (2,1) ^ 1 so 1 1 1
 */

//  Url = https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/description/

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FlipCloumMaxNoForqualRow {
    public static void main(String[] args) {
        int[][] matrix = {{0,0,0}, {0,0,1}, {1,1,0}};
        System.out.println(maxEqualRowsAfterFlips(matrix));
    }

    public static int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();

        for (int[] row : matrix) {
            StringBuilder str = new StringBuilder();
            if (row[0] == 0)
                for (int bit : row)
                    str.append(bit);
            else
                for (int bit : row)
                    str.append(bit ^ 1);
            map.merge(str.toString(), 1, Integer::sum);
        }

        return Collections.max(map.values());
    }
}
