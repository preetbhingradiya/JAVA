public class Power {

    public static int PowerN(int x,int n){
        if(n==1) return x;         //  x*x
                                  //    2   * 2   * 2   * 2   * 2   * 2    * 2   * 2 *2  
        return x*PowerN(x, n-1);  // (2,9),(2,8),(2,7),(2,6),(2,5),(2,4),(2,3),(2,2),(2,1)

        //optimized
        // if(n==0) return 1;
        //                 // 10/2 = 5    * 10/2 =5
        // int halfPowerSq= PowerN(x, n/2) * PowerN(x, n/2);

        // //n is odd   // x*PowerN(x, n/2) * PowerN(x, n/2);
        // if(n%2 != 0) return halfPowerSq = x*halfPowerSq;

        // return halfPowerSq;
    }

    public static void main(String[] args){
        int x=2,n=10;
        System.out.println(x + " to the power " + n + " :- " +PowerN(x,n));
    }

}
