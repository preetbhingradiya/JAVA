/* Haapy String made string use of a, b, c where not preated 3 time aaa is not valid
 * add charater use of largest number of a, b, c
 * here a=1, b=1, c=7  Output = ccaccbcc
 */


public class LonestHappyString {

    public static void main(String[] args) {
        System.out.print(longestDiverseString(1, 1, 7));
    }

    public static String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();

        while (a > 0 || b > 0 || c > 0) {
            if (a >= b && a >= c) {
                if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == 'a' && sb.charAt(sb.length() - 2) == 'a') {
                    if (b > 0) {
                        sb.append('b');
                        b--;
                    } else if (c > 0) {
                        sb.append('c');
                        c--;
                    } else {
                        break;
                    }
                } else {
                    sb.append('a');
                    a--;
                }
            } else if (b >= c && b >= a) {
                if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == 'b' && sb.charAt(sb.length() - 2) == 'b') {
                    if (c > 0) {
                        sb.append('c');
                        c--;
                    } else if (a > 0) {
                        sb.append('a');
                        a--;
                    } else {
                        break;
                    }
                } else {
                    sb.append('b');
                    b--;
                }
            } else {
                if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == 'c' && sb.charAt(sb.length() - 2) == 'c') {
                    if (a > 0) {
                        sb.append('a');
                        a--;
                    } else if (b > 0) {
                        sb.append('b');
                        b--;
                    } else {
                        break;
                    }
                } else {
                    sb.append('c');
                    c--;
                }
            }
        }

        return sb.toString();

    }

}
