import java.util.ArrayList;

public class Diece {
    public static void main(String[] args) {
        System.out.println(dieceOfNum("", 4));
    }

    static ArrayList<String> dieceOfNum(String empStr, int target){
        ArrayList<String> list  =  new ArrayList();
        if (target==0) {
            list.add(empStr);
            return list;
        }

        for (int i = 1; i <= 4 && i <= target; i++) {
           list.addAll(dieceOfNum(empStr + i, target-i));
        }

        return list;
    }
}
