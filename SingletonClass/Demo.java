
public class Demo {
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance(); //method is static so use class to access 

        SingletonClass s2 = SingletonClass.getInstance();

        System.out.println(s1);
        System.out.println(s2); //both ans as same bcz both refer as same object not create different object
    }    
}
