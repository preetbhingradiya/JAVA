
public class Hierarchical {
    
    public static void main(String[] args) {
        
        Birds bd = new Birds();
        bd.fly();

        Fish fish = new Fish();
        fish.swim();
    }
}

class Animal {
    void eat() {
        System.out.println("eat is action of animal");
    }
}

class Fish extends Animal{
    int speed=20;
    void swim(){
        System.out.println("Fishs common swimming seep is " + speed);
    }
}

class Dogs extends Animal{
    String color;
    void run() {
        this.color = "Black";
        System.out.println("Dog is runnig and its color is " + this.color );
    }
}
 
class Birds extends Animal{
    void fly(){
        System.out.println("Birds are fly in sky");
    }
}