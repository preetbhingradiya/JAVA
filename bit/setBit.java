public class setBit {
    public static void main(String[] args){
        int n=5;
        int posi=1;
        int bitMask=1<<posi;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }    
}
