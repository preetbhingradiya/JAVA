
class A {
    public A() {
        System.out.println("construct of A ");
    }

    public A(int i) {
        System.out.println("construct of A with int : " + i);
    }
}

class B extends A {
    public B() {
        super(); // here super call first A class constructor
        System.out.println("construct of B ");
    }

    // Parameters of constructor
    public B(int i) {
        super(i); // here super call first A class constructor with int parameter
        System.out.println("construct of B with int : " + i);
    }

    public B(float f){
        this();  // here this call own class first so call B() and under the b constructor super call so A class constructor run
        System.out.println("construct of B with float : " + f);
    }
}

public class This_super {
    public static void main(String[] args) {
       new B(3.2f);
    }

}
