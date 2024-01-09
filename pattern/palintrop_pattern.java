public class palintrop_pattern {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){

            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int p=2;p<=i;p++){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
