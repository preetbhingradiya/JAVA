import java.util.ArrayList;

public class TwoD_arraylist {

    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> Mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);list.add(2);
        Mainlist.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(10);list2.add(20);
        Mainlist.add(list2);

        for(int i=0;i<Mainlist.size();i++){
            ArrayList<Integer> current = Mainlist.get(i);
            for(int j=0;j<current.size();j++){
                System.out.print(current.get(j) + " ");
            }
            System.out.println();
        }
    }

}
