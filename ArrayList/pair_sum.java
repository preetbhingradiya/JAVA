import java.util.ArrayList;

public class pair_sum {
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);

        int target = 5;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    System.out.println(i+ " " +j);
                }
            }
        }

        // int start =0 , last = list.size()-1;
        // while (start<=last) {
        //     if(list.get(start)+list.get(last)==target){
        //         System.out.println(start + " " + last);
        //     }
        //     else if(list.get(start)+list.get(last)<target){
        //         start++;
        //     }else{
        //         last--;
        //     }
        // }
    }

}
