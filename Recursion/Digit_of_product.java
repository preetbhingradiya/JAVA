public class Digit_of_Product {
    public static void main(String[] args) {
        System.out.println(product(505));
    }

    public static int product(int n){
        if(n==0) return 1;
        return (n%10) * product(n / 10);
    }
}
