public class Mountaine_peak_ele {

    public static void main(String[] args) {
        int [] arr ={0,1,5,10,15,8,6,3,2};
        System.out.println(PeakElemnet(arr));
    }

    public static int PeakElemnet(int[] arr){
        int start = 0, end = arr.length - 1, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid] < arr[mid + 1])
                start = mid + 1;
            else
                end = mid;  //here end = mid -1 not becuse the suppose the last element is peak element is decr order
        }
        return start; // or return end both are equale becuse the start and end after the target the max peak element
    }

}
