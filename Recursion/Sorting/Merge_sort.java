import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = { 10, 8, 3, 0, 78, 11, -1 };
        arr = diviedeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] diviedeArray(int[] arr){
        if(arr.length==1) return arr;

        int mid = arr.length/2;

        int[] left = diviedeArray(Arrays.copyOfRange(arr, 0, mid));
        int[] right = diviedeArray(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int mix[] = new int[first.length + second.length];

        int i = 0; //first array intrition
        int j = 0; //seconde array intrition
        int k = 0; //mix array intrition

        while (i < first.length && j < second.length) {
            if(first[i] < second[j]){
                mix[k++] = first[i++];
            }else{
                mix[k++] = second[j++];
            }
        }

        while (i < first.length) {
            mix[k++] = first[i++];
        }

        while (j < second.length) {
            mix[k++] = second[j++];
        }

        return mix;
    }
}
