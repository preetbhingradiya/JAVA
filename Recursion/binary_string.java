public class binary_string {

    public static void binaryString(int n,int lastindex,String newStr){
        if(n==0) {
            System.out.println(newStr);
            return;
        }


        if(lastindex==0){
            //if lasindex of n is 0 so set 0 and 1 both
            //here lastindex is 0
            binaryString(n-1, 0, newStr+"0");
            //here lasindex is change of 1
            binaryString(n-1,   1, newStr+"1");
        }
        else{
            binaryString(n-1, 0, newStr+"0");
        }

        // binaryString(n-1, 0, newStr+"0");
        // if(lastindex==0){
        //     binaryString(n-1,   1, newStr+"1");
        // }

    }
    
    public static void main(String[] args){
        binaryString(3, 0,"");
    }
    //simple last index is 0 so set 0 and 1  AND lastindex is 1 so set onlu 0
    //000  001  010 100 101 
    //in problem 011 is not correct becuse if 1 next is not 1 is 0

}
