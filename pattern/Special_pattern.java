public class Special_pattern {
    public static void main(String[] args) {
        int n = 4;
        n = n*2;
        for (int row = 1; row < n; row++) {
            for(int col=1;col<n;col++){
                //UperSide = row
                //LeftSide = col
                //RightSide = n-col
                //BottomSide = n-row
                int atEvertIndex = Math.min(Math.min(row, col),Math.min(n-row, n-col));
                System.out.print(atEvertIndex);
            }
            System.out.println();
        }
    }
}
