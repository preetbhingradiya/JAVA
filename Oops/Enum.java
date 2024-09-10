
enum Leptop{
    ASUS_ZENFONE_MAX_PRO(4000),
    SAMSUNG_GALAXY_S21_ULTRA(6000),
    GOOGLE_PIXEL_5,
    IPHONE_12_PRO_MAX(10000);


    private int price;

    private Leptop(int price){
        this.price = price;
        System.out.println("Perameterized object and constucter is :" + this.name());
    }

    private Leptop() {
        price = 10;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

public class Enum {

    public static void main(String[] args) {
        Leptop lep = Leptop.ASUS_ZENFONE_MAX_PRO;
        System.out.println(lep);  //name
        System.out.println(lep.getPrice());  //price

        for(Leptop lp : Leptop.values()){
            System.out.println(lp.name() + " : " + lp.getPrice());  //name and price in one line
        }
    }
}