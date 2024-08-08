import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};

        List<List<Integer>> ans = subSetOfArray(arr);
        System.err.println(ans);

        int[] dupicat = {2,1,2};
        System.out.println(subSetOfDuplicat(dupicat));
    }

    static List<List<Integer>> subSetOfArray(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // add new empty list

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                // System.out.print(inner + " ");
                outer.add(inner);
            }
        }

        return outer;
    }

    // ignore duplicate
    static List<List<Integer>> subSetOfDuplicat(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // add new empty list
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // skip duplicate
            if (i > 0 && arr[i] == arr[i - 1]) {  //arr[2] = 2 & arr[1] =2
                start = end + 1;
            }
            end = arr.length - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }

}
