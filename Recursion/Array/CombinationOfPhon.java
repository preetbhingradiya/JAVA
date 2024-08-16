import java.util.ArrayList;

public class CombinationOfPhon {
    public static void main(String[] args) {
        System.out.println(letterCombinations("", "23"));
    }

    private static String[] MAPPING = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };

    public static ArrayList<String> letterCombinations(String empStr, String str){
        ArrayList<String> list = new ArrayList<>();
        if(str.isEmpty()){
            if(!empStr.isEmpty()){
                list.add(empStr);
            }
            return list;
        }

        char digit = str.charAt(0);
        String letters = MAPPING[digit - '0'];

        for(char letter : letters.toCharArray()){
            list.addAll(letterCombinations(empStr + letter, str.substring(1)));
        }

        return list;
    }
}
