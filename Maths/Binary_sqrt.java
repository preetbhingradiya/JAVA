/**
 * Binary_sqrt
 */
public class Binary_sqrt {

    public static void main(String[] args) {
        int n = 40;
        int p = 3; // howmany number be count for decimal

        System.out.println(sqrt(n, p));
    }

    public static double sqrt(int n, int p) {
        int start = 0;
        int end = n;

        double root = 0.0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n)
                return mid;
            else if (mid * mid > n)
                end = mid - 1;
            else
                start = mid + 1;
        }

        double incr = 0.1;
        for (int index = 0; index < p; index++) {
            while (root * root <=n ) {
                root += incr;  //every time 0.1 is increse <= 40  so 6.39 * 6.39 >=40
                //every time 0.01 is increse 6.29+0.01 = 6.309 -> 6.329*6.329 >=40
            }

            root -= incr;  // here decrese one 0.1 so 6.39-0.1 = 6.29  // decrse one 0.01
            incr /= 10; // now new value of incris 0.01  // 2time new value is 0.001
        }

        return root;
    }

}