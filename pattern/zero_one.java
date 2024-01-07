public class zero_one {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){//even row and colum sum and divide in to 2
                    System.out.print(1+" ");
                }
                else{//odd
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    //i=1 , j=1      1
    //i=2 , j=1,2    0 1
    //i=3 , j=1,2,3  1 0 1  
}
