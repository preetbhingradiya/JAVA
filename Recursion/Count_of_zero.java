public class Count_of_zero {
    public static void main(String[] args) {
        int n = 30204;

        System.out.println(CountZero(n, 0));
    }

    static int CountZero(int n, int count) {
        if (n == 0) {
            return count;
        }

        if (n % 10 == 0) { // if the reminder is 0 count ++
            return CountZero(n / 10, count + 1);
        }

        return CountZero(n / 10, count);
    }
}
