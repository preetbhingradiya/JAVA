
import java.util.Arrays;

public class Demo {
    
    public static void main(String[] args) throws CloneNotSupportedException{
        Human navin = new Human(13, "navin");
        // Human kalpesh = new Human(navin);  
        Human kalpesh = (Human)navin.clone(); //with out use of new keyword

        if (navin.compareTo(kalpesh) < 0) {
            System.out.println(navin.name + " is younger than " + kalpesh.name);
        } else if (navin.compareTo(kalpesh) > 0) {
            System.out.println(navin.name + " is older than " + kalpesh.name);
        } else {
            System.out.println( "Both age are the same age");
        }

        System.out.println(Arrays.toString(navin.arr));

        navin.arr[0] = 100;

        //navin arr will change 
        System.out.println(Arrays.toString(navin.arr));

        //kalpesh arr is not change
        System.out.println(Arrays.toString(kalpesh.arr));
    }
}
