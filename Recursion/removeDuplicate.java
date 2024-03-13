public class removeDuplicate {
    
    public static void duplicateStr(String str,int i,StringBuilder newstr,boolean [] map){
        if(i==str.length()) {
            System.out.println(newstr);
            return;
        };

        // 'a' - 'a'  = 0
        // 'b' - 'a'  = 1
        // 'c' - 'a'  =2
        char currchar = str.charAt(i);
        // fisrt p 
        //map['p' - 'a' = 17-1 = 16]  = map[16] == true not
        if(map[currchar-'a']==true){
            duplicateStr(str,i+1,newstr,map);
        }
        else{
            //ap['p' - 'a' = 17-1 = 16]  = map[16] = true value is change here
            map[currchar-'a']=true;
            duplicateStr(str,i+1,newstr.append(currchar),map);
        }
        
    }

    public static void main(String[] args){
        String str = "preetbhingradiya";
        duplicateStr(str,0,new StringBuilder(""),new boolean[26]);
        // a to z is 26 charac  
    }

}
