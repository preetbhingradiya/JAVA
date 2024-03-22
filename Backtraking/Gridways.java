public class Gridways {

    public static int uniquePath(int i,int j,int m,int n){

        if(i==m-1 && j==n-1){  ////finish line of element  
            return 1;
        }
        else if(i==m || j==n){  //boundery crose
            return 0;
        }
        //right way
        int wa1 = uniquePath(i, j+1, m, n);   //row as it's col+1 becuse move right side

        //bottom wat
        int wa2 = uniquePath(i+1, j, m, n); //row + 1 and col as it's becuse move bottom side

        return wa1+wa2;
    }

    public static void main(String[] args){
        int m=3,n=3;  //(m is row and is run m) or (n is col and j is run n)
        System.out.println(uniquePath(0, 0, m, n));
    }
    
}
