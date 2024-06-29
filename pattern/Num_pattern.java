public class Num_pattern {
    public static void main(String[] args) {
        int n = 5;
        pattern2(n);
    }

    public static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            //space

            for(int space = 0 ; space < n - row  ; space++ ){
                System.out.print(" ");
            }

            for(int col=row ; col>=1; col--){
                System.out.print(col);
            }   

            for (int k = 2; k <= row; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 0; row < 2*n; row++) {
            int IndexOfCol = row > n ? 2*n-row : row;

            //space
            for(int space = 0 ; space < n - IndexOfCol  ; space++){
                System.out.print(" ");
            }

            for(int col=IndexOfCol ; col>=1; col--){
                System.out.print(col);
            }   

            for (int k = 2; k <= IndexOfCol; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
        
    }
}
