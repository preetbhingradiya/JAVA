
/**
 * MinimumLengthAfterRemovingSubstring
 */
public class MinimumLengthAfterRemovingSubstring {

    public static void main(String[] args) {
        String s = "ABFCACDB";
    }

    public static int minLength(String s) {

        //covert string into str[] array
        char[] str = s.toCharArray();
        int n = str.length;
        int w = 0;

        //here traves n length
        for (int i = 0; i < n; i++) {
            if (w == 0) {
                //here store starting value like A and C bcz first time w == 0 
                str[w] = str[i];
                w++;
                continue;
            }

            //if the w value A and i value B || w value c and i value D (w--) pair match in continues
            if ((str[w - 1] == 'A' && str[i] == 'B') || (str[w - 1] == 'C' && str[i] == 'D')) {
                w--;
            } else {
                //otherwsie replace value of str
                str[w] = str[i];
                w++;
            }
        }

        return w;
    }

}
