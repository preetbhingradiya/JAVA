public class Decrement {

    public static void desendingOrder(int num){
        if(num==1){
            System.out.print(num + " ");
            return;
        }
        // System.out.print(num + " ");
        // desendingOrder(num-1);

        //increseOrder
        desendingOrder(num-1);
        System.out.print(num + " ");
    }

    public static void main(String[] args){
        int num=10;
        desendingOrder(num);
    }
    
}
