public class data_type {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int sum = a + b;
        System.out.println("Before change the value :" + sum);
        a = 20;
        b = 23;
        sum = (a*b)/(b-a);
        System.out.println("After change the value :" + sum);
    }
}
