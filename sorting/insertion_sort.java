//in this sort array divided by two pasrt sorted and unsorted
//ex = 7,8|3,1,2
//if first check unsorted element is smalest to the last sorted array that push in it.
public class insertion_sort {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };

        // for (int i = 0; i < arr.length; i++) {
        //     int current = arr[i];
        //     int j = i - 1; // sorted part last index
        //     while (j >= 0 && current < arr[j]) {
        //         arr[j + 1] = arr[j];
        //         j--;
        //     }
        //     arr[j + 1] = current;
        // }

        for (int i = 0; i < arr.length - 1; i++) { // still run only length-2
            for (int j = i + 1; j > 0; j--) { // buz the the last element is point to j
                if(arr[j] < arr[j-1]){ // check currect is samller to previous or not
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        printArray(arr);
    }
}