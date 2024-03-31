import java.util.ArrayList;

public class Containes_water {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);list.add(8);list.add(6);list.add(2);list.add(5);
        list.add(4);list.add(8);list.add(3);list.add(7);

        int Maxwater = 0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height = Math.min(list.get(i),list.get(j));  //check the both 2 line trun minimum
                int width = j-i;   //index can mines
                int water = height * width;

                Maxwater = Math.max(Maxwater, water);
            }
        }

        
        // int [] height = {1,8,6,2,5,4,8,3,7};
        // int maxWater = 0;
        
        // int leftLines = 0;
        // int rightLines = height.length-1;
        
        // while(leftLines<=rightLines){
        //     int lines = Math.min(height[leftLines],height[rightLines]);
        //     int width = rightLines-leftLines;
        //     int water = lines*width;
            
        //     maxWater = Math.max(maxWater,water);
            
        //     if(height[leftLines]<height[rightLines]){
        //         leftLines++;
        //     }else{
        //         rightLines--;
        //     }
        // }
        System.err.println(Maxwater);
    }

}
