public class clearBit {
    static public void main(String[] args){
        int n=5,posi=2,bitMask=1<<posi;

        int notOpration=~(bitMask);

        int clearBit=notOpration & n;

        System.out.println(clearBit);
    }    
}
