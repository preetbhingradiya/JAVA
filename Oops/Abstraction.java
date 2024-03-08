abstract class Animal{
   void eat(){
    System.out.println("Animal Eats");
   }

    //Abstract methods do not specify a body
    //Subclass(child) class of Animal is required implenet to the walk method
   abstract void walk();
} 

class Horsh extends Animal{
    void walk(){
        System.out.println("Horsh on 4 legs");
    }
}

class Eagles extends Animal{
    void walk(){
        System.out.println("Eagles on 2 legs");
    }
}

public class Abstraction {
    
    public static void main(String[] args){

        Horsh h1 = new Horsh();
        h1.eat();;
        h1.walk();

        Eagles e1 = new Eagles();
        e1.walk();

    }
}
