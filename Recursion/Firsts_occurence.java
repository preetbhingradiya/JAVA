public class Firsts_occurence {

    public static int fisrtOccurence(int[] arr,int i){
        int key=5;
        if(i==arr.length-1) return -1;
        if(key==arr[i]) return i;

        return fisrtOccurence(arr,i+1);
    }

    public static void main(String[] args){
        int [] arr={8,3,6,9,5,10,2,3,4,5,2,6,2};
        System.out.println("First Occurence index is :- " + fisrtOccurence(arr,0));
    }
}
