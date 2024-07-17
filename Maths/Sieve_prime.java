
public class Sieve_prime {
    public static void main(String[] args) {
        int n = 20;
        boolean [] prime = new boolean[n+1];// by defoalte all the element in boolean is false
        seive(n, prime);
    }   
    
    public static void seive(int n, boolean[] prime){
        for (int i = 2; i*i <=n; i++) {  //only check the n squer here 20 = 4.47 something 4*4
            if(!prime[i]){ //is number is false it measn number is prime
                for (int j = i*2; j <=n; j+=i) {  //if the 2 is prime so all the double of 2 is not prime like 4,6,8,10,12..
                    prime[j] = true; //its not prime
                }
            }
        }


        for (int i = 2; i <=n ; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
