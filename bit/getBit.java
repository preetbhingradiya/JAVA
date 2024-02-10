public class getBit {

    public static void main(String[] args){
        int n=5;
        int posi=2;
        int bitMask=1<<posi;

        if((bitMask & n)==0){
            System.out.println("Bit is Zero(0)");
        }
        else{
            System.out.println("Bit is One(1)");
        }
    }
    
}