public class Factorial {

    public static int factorialNumber(int num){
        if(num>=1){
                return num*factorialNumber(num-1);
        }
        return 1;
    }

    public static void main(String[] a){
        int num=5;
        System.out.println(factorialNumber(num)); 
    }

}
/*
 * 5*(5-1);
 * 4*(4-1);
 * 3*(3-1);
 * 2*(2-1);
 * 1   = bottom to top 1*2*3*4*5
 */