import java.util.ArrayList;

public class Factor_num {
    public static void main(String[] args) {
        int n = 20;
        factorls(n);
    }

    static void factorls(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void factorls2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) { // here 20%2 = 10 (2*10) so wh check the 20%10 = 2 (10*2) wo stil
                                                  // check the sqrt of n
            if (n % i == 0) {
                if (n / i == i) { // manage duplicate if the nummber is 36 so not print two time 6
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");// here i asc and n/i is desc
                }
            }
        }
    }

    // now sort in asending order
    public static void factorls3(int n){
        ArrayList<Integer> list=  new  ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) { 
            if(n%i==0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " ");  
                    list.add(n/i);
                }
            }
        }

        for (int j = list.size()-1; j >= 0; j--) {
            System.out.print(list.get(j) + " ");
        }
    }
}
