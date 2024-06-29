public class Star_pattern {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<2*n;row++){
            int IndexOfCol = row > n ? 2*n - row : row;
            
            // int totalSpace = n - IndexOfCol;
            // for(int space=0;space<totalSpace;space++){
            //     System.out.print(" ");
            // }
            
            for(int j=0;j<IndexOfCol;j++){
                System.out.print("* ");
            }   
            System.out.println();
        }
    }
}
