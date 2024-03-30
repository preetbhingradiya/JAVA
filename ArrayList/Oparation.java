import java.util.ArrayList;

public class Oparation {

    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();

        //ADD add new element  (0(1))
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //GET element  (0(1))
        int getElement = list.get(2);
        System.out.println(getElement);  //index 2 

        //REMOVE element  (0(n))
        list.remove(0);
        System.out.println(list);  //index 0

        //SET replace the previous value to corrent value 4=null  (0(n))
        list.set(2,null);
        System.out.println(list);

        //CONTAINS check the element is here or not (0(n))
        System.out.println(list.contains(null)); //nullis here so retrun true

        //reverse
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.println(list.get(i));
        // }i
    }
    
}

