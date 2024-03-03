public class sorteds_path {

    public static float getSortedPath(String path){
        int x=0,y=0;

        for(int i=0;i<path.length();i++){
            char OneCharacter = path.charAt(i);

            //South 
            if(OneCharacter == 'S'){
                //beacuse the south can bottom so y--
                y--;
            }
            else if(OneCharacter == 'N'){
                //beacuse the North can Top so y++;
                y++;
            }
            else if(OneCharacter == 'W'){
                //beacuse the West can Left so x--;
                x--;
            }
            else{
                //beacuse the East can Right so x++;
                x++;
            }
        }

        //after x or y is (3,4)
        int x2 =x*x;  // 9
        int y2 =y*y;   // 16 
        return (float)Math.sqrt(x2+y2);  //(9+16=25) squre 5;
    }
   
    public static void main(String[] args){

        String path ="WNEENESENNN";

        System.out.println("Sorteds Path is :- " + getSortedPath(path));
    }
}
/*4 direction   X or Y
        N

W       (0,0)         E

         S
        */