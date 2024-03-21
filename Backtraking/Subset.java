import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static void findSubset(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0) System.out.print("null"+ " ");
            System.out.print(ans + " ");
            return;
        }

        //Yes choice (*join to pair so add character in to ans )
        findSubset(str, ans+str.charAt(i), i+1);

        //No choit (* not join to pair so not add in to ans)
        findSubset(str, ans, i+1);
    }


    public static void main(String[] args) {
        String str = "abc";
        // findSubset(str,"" , 0);


        //if The array try this logic
        int [] nums = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for(int i:nums){  //1,2,3
            int n=res.size();
            for(int j=0;j<n;j++){
                List<Integer> temp = new ArrayList<>(res.get(j));  //[]
                temp.add(i);//[1]
                res.add(temp);  //copy of temp in original res  [][1]  (Noly first elememnt)
             }
        }

        System.out.println(res);
    }
    
}
