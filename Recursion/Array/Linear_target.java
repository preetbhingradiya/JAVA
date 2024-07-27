import java.util.ArrayList;

public class Linear_target {
    public static void main(String[] args) {
        int arr[] = { 3, 21, 0, 18, 9, 0 };
        int target = 0;
        System.out.println(findTarget(arr, target, 0));
        System.out.println(findTargetBool(arr, target, 0));
        System.out.println(multipalIndex(arr, target, 0, list));
        System.out.println(multipalIndex2(arr, target, 0));
    }

    static int findTarget(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        return findTarget(arr, target, index + 1);
    }

    static boolean findTargetBool(int[] arr, int target, int index) {
        if (index == arr.length)
            return false;
        return (arr[index] == target) || findTargetBool(arr, target, index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList multipalIndex(int[] arr, int target,int index,  ArrayList<Integer> list){
        if(index==arr.length) return list;
        if(arr[index]==target) list.add(index);
       return multipalIndex(arr, target, index+1,list);
    }

    static ArrayList<Integer> multipalIndex2(int[] arr, int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length) return list;

        //this will containe answer for that function call
        if(arr[index]==target) list.add(index);

        ArrayList<Integer> ansFromBelowCalls = multipalIndex2(arr, target, index+1);
        //in the list every time function call new list are create ans previous data are remove so store in all and in one anslist after add in list
        list.addAll(ansFromBelowCalls);

       return list;
    }
}
