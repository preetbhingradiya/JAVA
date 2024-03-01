class diagonal_sum {

    public static int daigonalSum(int matrix[][]) {
        int primaryOrder = 0,seconderyOrder=0,sum=0;

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //             primaryOrder += matrix[i][j];
        //         }
        //         if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //             seconderyOrder += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<matrix.length;i++){
            //po
            sum += matrix[i][i];

            //so
            if(i != matrix.length-i-1)
                sum += matrix[i][matrix.length-i-1];   //4-0-1 =3  matrix(0,3) =4
                                                       //4-1-1 =2  matrix(1,2) 7             
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        // System.out.println(matrix.length);

        System.out.println(daigonalSum(matrix));
    }
}