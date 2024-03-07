
public class Inheritance {

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.eat();
        dg.run();
        System.out.println("Dog is " + dg.legs + " legs");
    }
}

class Animal {
    void eat() {
        System.out.println("eat is action of animal");
    }
}

class Mammal extends Animal{
    int legs = 4;
}

class Dog extends Mammal {

    String color;

    void run() {
        this.color = "Black";
        System.out.println("Dog is runnig and its color is " + this.color );
    }

}