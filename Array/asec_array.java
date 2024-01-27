import java.util.Scanner;

public class asec_array {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array length :- ");
        int value = sc.nextInt();

        int nums[] = new int[value];

        for (int i = 0; i < value; i++) {
            nums[i] = sc.nextInt();
        }

        boolean ascendingOrder=false;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]<nums[i+1]){
                ascendingOrder=true;
            }
        }

        if(ascendingOrder){
            System.out.println("This array sorting in asceding order");
        }
        else{
            System.out.println("This array is not sorted in asceding oerder");
        }
    }
}
