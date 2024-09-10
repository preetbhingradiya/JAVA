
class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Galaxy S21 Ultra";
        System.out.println("Static block call only one time and it call first of all");
    }

    // Constructer
    public Mobile() {
        brand = "";
        price = 100;
        System.out.println("Constructer are called every time whene object of this class is created");
    }

    void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void staticMthod(Mobile obj) {
        System.out.println("This is a static method");

        // in static method not can use of non static verible and method so
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

class Access {
    private int age;

    public Access(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// Static verible is same for all the objeect if any of object varible is change
// is can effect all the posible class of object
// Also static varible is sommething you making class member not a object member

public class Static_Varible {
    public static void main(String[] args) {
        Mobile b1 = new Mobile();
        b1.brand = "Samsung";
        b1.price = 10000;

        Mobile b2 = new Mobile();
        b2.brand = "Apple";
        b2.price = 15000;

        Mobile.name = "iPhone 12 Pro Max";
        b1.show();
        b1.show();

        Access a1 = new Access(12);
        System.out.println("Access calss from another file : " + a1.getAge());

        Mobile.staticMthod(b1);
    }
}
