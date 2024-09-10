
class MyExceptions extends Exception{
    public MyExceptions(String s) {
        super(s);    //this constructor is Exception class and pass message it
    }
}

public class Custom_expection {
    public static void main(String[] args) {
        int i = 20;
        
        try {
            int j = 18/i;

            if(j==0)
                throw new MyExceptions("The default output is 18");

        } catch (ArithmeticException e) {
            System.out.println("You can divide by zero");
        }
        catch(MyExceptions e){
            System.out.println(e.getMessage());
        }
    }
}
