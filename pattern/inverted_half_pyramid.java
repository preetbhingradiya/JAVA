public class inverted_half_pyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
        //space
        for(int k=n-i;k>=1;k--){
        System.out.print(" ");
        }

        //print *
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }

        System.out.println();
        }

        //REVERSE
        // for (int i = n; i >= 1; i--) {
        //     // space
        //     for (int k = n-1; k >= i; k--) {
        //         System.out.print(" ");
        //     }
        //     // print *
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}