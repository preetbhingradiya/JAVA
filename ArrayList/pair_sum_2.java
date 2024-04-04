import java.util.ArrayList;

public class pair_sum_2 {

    public static boolean pairSum2(ArrayList<Integer> list,int target){
        int pivot = -1,n=list.size();
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){  // previous value is greater to the next value then larget number is pivot
                pivot = i;
                break;
            }
        }

        int Left = pivot+1;  //smallest value
        int Rigth = pivot;  //larget value

        while (Rigth!=Left) {
            if(list.get(Left)+list.get(Rigth)==target){
                System.out.println("Pair of : "+list.get(Left) + " And " + list.get(Rigth) );
                return true;
            }
            else if(list.get(Left)+list.get(Rigth)<target){
                Left = (Left+1)%n;
            }else{
                Rigth = (n+Rigth-1)%n;
            }
        }

        return false;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);list.add(15);list.add(6);list.add(8);list.add(9);list.add(10);

        int target =16;

        System.out.println(pairSum2(list, target));
    }

}
