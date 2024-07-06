// Mathemic formula of Nth fibonacci is 1 / sqrt(5) * (1 + sqrt(5) / 2)power(n) - 1 / sqrt(5)* (1- sqrt(5) / 2) power(n)
//common is 1 / sqrt(5)
public class Fibonaci_series {
     /*fibonaci = 0,1,1,2,3,5,8,13....
    5th position is 5
       fibonaciNum(num - 1)  mate
     * 5
     * 4
     * 3
     * 2
     * 1  return 1  1 per(fibonaciNum(num - 2))
     * 1 +  0 = 1 give to top 
     */
    public static int fibonaciNum(int num) {

        if (num == 0 || num==1)
            return num;
        int finalNumber = fibonaciNum(num - 1) + fibonaciNum(num - 2);
        return finalNumber;
    }

    public static int fiboFormula(int n ){
        // Math.pow(((1 + Math.sqrt(5)) / 2) , n) 
        // Math.pow(((1 - Math.sqrt(5)) / 2) , n)
        // (Math.pow(((1 + Math.sqrt(5)) / 2) , n) - Math.pow(((1 - Math.sqrt(5)) / 2) , n)) 
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2) , n) - Math.pow(((1 - Math.sqrt(5)) / 2) , n)) / Math.sqrt(5));
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(num + "th of fibonnacci is :- " + fibonaciNum(num));
        for (int i = 0; i < 50; i++) {
            // System.out.print(fibonaciNum(i) + " ");
            System.out.print(fiboFormula(i) + " ");
        }
    }
}
/*
 * 5
 * 4th + 3th
 * 3th+2th + 2th+1th
 * (2th+1th)+(1th+0th) + (1th+1) + 1 //becuse 1 return 1 and 0 return 0
 * ((1th+1th)+1) + (1+0) + (1+1)
 * (2+1) + 1 + 1
 * 3 + 1 +1
 * 5
 */
