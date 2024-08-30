import java.package.Demo;

public class Index {
    public static void main(String[] args) {
        printMessage();
        Demo.demoMessage(); // Calling the static method from Demo class
    }   
    
    public static void printMessage(){
        System.out.println("This is index package");
    }
}
