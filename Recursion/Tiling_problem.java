/**
 * Tiling_problem
 */
public class Tiling_problem {

    public static int Tiling(int n){  // 2 * n (floor sixe)  2 is hight and n is width
        if(n==1 || n==0) return 1;
        //vertical tilies
        int verticalTilies = Tiling(n-1);
        System.out.print(verticalTilies +" ");
        //horizontal tilies
        int horizontalTilies = Tiling(n-2);
        // System.out.print(horizontalTilies + " ");

        int total = verticalTilies + horizontalTilies;

        return total;

    }

    public static void main(String[] args){
        System.out.println(Tiling(4));
    }
}

/*  tilies hight 2 and  widht 1
        
        Vertical
 * __1____________________                   
 * |    |               |
 * |    | 2             |    2 hight
 * |____|_______________|
 *      |       n-1     |      becuse 1 tilies is set so flore width is n-1
 *      n width
 * 
 *  
 *  Horizontal
 * 
 *       _____________________                   
 *       |        | 1        |
 *       |____2___|          | 
 *       |        |          |    2 hight
 *       |____2___|__1_______|
 *                |  n-2     |  beacuse 2 tilies is set so flore width is n-2
 *      n width
 * 
 */         
