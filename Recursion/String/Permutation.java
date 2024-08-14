import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        // PermutationOfStr("", "abc");

        // Arrayist
        ArrayList<String> list = permutationist("", "abc");
        System.out.println(list);

        // System.out.println(permutationOfCount("", "abc"));
    }

    public static void PermutationOfStr(String empStr, String str) {
        if (str.isEmpty()) {
            System.out.println(empStr);
            return;
        }

        char ch = str.charAt(0);
        for (int i = 0; i <= empStr.length(); i++) { // length of process
            String first = empStr.substring(0, i);
            String seconde = empStr.substring(i, empStr.length());
            PermutationOfStr(first + ch + seconde, str.substring(1));
        }
    }

    static ArrayList<String> permutationist(String empStr, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(empStr);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = str.charAt(0);
        for (int i = 0; i <= empStr.length(); i++) {
            String first = empStr.substring(0, i);
            String second = empStr.substring(i, empStr.length());
            ans.addAll(permutationist(first + ch + second, str.substring(1)));
        }

        return ans;
    }

    public static int permutationOfCount(String empStr, String str) {
        if (str.isEmpty()) {
            return 1;
        }
  
        int count = 0;
        char ch = str.charAt(0);
        for (int i = 0; i <= empStr.length(); i++) { // length of process
            String first = empStr.substring(0, i);
            String seconde = empStr.substring(i, empStr.length());
            count = count + permutationOfCount(first + ch + seconde, str.substring(1));
        }
        
        return count;
    }
}
