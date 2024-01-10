public class pascal_triangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }

            int c=1;
            for(int j=1;j<=i;j++){
                System.out.print(c + " ");
                c=c*(i-j)/j;    //1*(1-1)/1
            }
            System.out.println();
        }
    }
}
