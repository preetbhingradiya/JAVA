public class Patteren {
    public static void main(String[] args) {
        triange2(4, 0);
    }

    static void triange2(int row, int col){
        if(row==0){
            return;
        }

        if(col < row){ 
            triange2(row, col+1);
            System.out.print("* ");
        }else{
            triange2(row-1, 0);
            System.out.println();
        }
    }

    static void triange(int row, int col){
        if(row==0){
            return;
        }

        if(col < row){ 
            System.out.print("* ");
            triange(row, col+1);
        }else{
            System.out.println();
            triange(row-1, 0);
        }
    }
}
