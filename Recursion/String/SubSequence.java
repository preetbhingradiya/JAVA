import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        // subSeq("", "abc");

        System.out.println(subSeqArrayList("", "abc"));
    }

    static void subSeq(String emptStr, String str) {
        if (str.isEmpty()) {
            System.out.println(emptStr);
            return;
        }
        char ch = str.charAt(0);
        // substring(1) menas all time last char are ignore of string
        subSeq(emptStr + ch, str.substring(1)); // add "a"in empStr = "a" and str = "bc"
        subSeq(emptStr, str.substring(1)); // ignore "c"in empStr = "ab" and str = "c"
    }

    // return statement creat Arrayslist incide the function
    static ArrayList<String> subSeqArrayList(String emptStr, String str) {
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(emptStr);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> left = subSeqArrayList(emptStr + ch, str.substring(1));
        ArrayList<String> right = subSeqArrayList(emptStr, str.substring(1));
        // After every left and right part are complete add in list in first round left is "abc" and right is "bc"
        left.addAll(right); //left = "abc" + right = "bc" in 1 round
        return left;
    }
}
