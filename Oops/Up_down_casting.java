class A {
    public void show1() {
        System.out.println("A class");
    }
}

class B extends A {

    public void show2() {
        System.out.println("B class");
    }
}

public class Up_down_casting {
    public static void main(String[] args) {
        A obj = new B(); // upcasting
        obj.show1();

        // even if use of object b still can't use of show2
        B obj1 = (B) obj; // downcasting
        obj1.show2();
    }
}
