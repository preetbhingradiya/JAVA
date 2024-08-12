
public class Permutation {
    public static void main(String[] args) {
        PermutationOfStr("", "abc");
    }   

    public static void PermutationOfStr(String empStr, String str){
        if (str.isEmpty()) {
            System.out.println(empStr);
            return;
        }

        char ch = str.charAt(0);    
        for (int i = 0; i <= empStr.length(); i++) { //length of process
            String first = empStr.substring(0,i);
            String seconde = empStr.substring(i, empStr.length());
            PermutationOfStr(first + ch + seconde, str.substring(1));
        }
    }
}
