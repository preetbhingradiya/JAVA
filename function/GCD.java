public class GCD {

    public static int gcd(int a,int b){

        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;   
    }
    public static void main(String[] args){
        int a=98,b=56;
        System.out.println("GCD of " + a + " And "+ b + " is "+ gcd(a,b));

        //98-56 = 42  
        //56%42 is not 0 then
        //56-42 = 14
        //42%12 = 0 then anser is 14
    }
}
