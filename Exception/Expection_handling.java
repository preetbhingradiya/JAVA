public class Expection_handling {
    public static void main(String[] args) {
        // run time error

        int i = 20;
        int j = 0;

        int[] num = new int[0];
        try {
            j = 20 / i;

            System.out.println(num[1]);
            System.out.println(num[5]);
        } catch (ArithmeticException e) {
            System.out.println("Number can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit");
        }

        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("I dont want to print ZERO");
        } catch (Exception e) {
            j = 18 / 1;
            System.out.println("This is defualt output : " + j );
            System.out.println(e.getMessage());
        }

        System.out.println("Program Over");
    }
}
