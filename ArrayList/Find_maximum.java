import java.util.ArrayList;
import java.util.Collections;

public class Find_maximum {
        
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(200);
        list.add(300);
        list.add(200);
        list.add(3800);
        list.add(900);
        list.add(100);

        int max  = Integer.MIN_VALUE;

        for(int i=0;i<list.size()-1;i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }

        System.out.println(max);


        System.out.println(list);
        //swap 3800 and 200
        int index1 = 2 , index2 = 3;
        int temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2, temp);
        System.out.println(list);
    }
    
}
