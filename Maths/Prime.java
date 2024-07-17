public class Prime {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int num = 2;
        while (num * num <= n) { // here check num sequre root ex 36 = 6*6 so number is 2,3,4,5,6
            if (n % num == 0) {
                return false;
            }
            num++;
        }

        return true;
    }
}
