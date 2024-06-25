import java.util.ArrayList;

public class Operator {

    public static void main(String[] args) {
        System.out.println('a' + 'b');  //covert char to asic value
        System.out.println("a" + "b");  //concet to string
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1); //int covert into string and concet "a" + "1"

        System.out.println("name" + new ArrayList<>()); //return arraylist is emapty array

        // System.out.println(new Integer(68) + new ArrayList<>());

        //it give e error buz whenver use of + operater combanie two thing atlis one string are require other wise other complexs data type not combine

        System.out.println(new Integer(68) + " " + new ArrayList<>());
    }
}
