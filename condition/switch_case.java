import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int tepm = value.nextInt();

        // switch (tepm) {
        //     case 1:
        //         System.out.println("Kem Cho");
        //         break;
        //     case 2:
        //         System.out.println("Hello");
        //         break;
        //     case 3:
        //         System.out.println("नमस्ते");
        //         break;
        //     default:
        //         System.out.println("Buna ziua");
        // }

        //In New Switch Statment 
        String result = "";
        result = switch (tepm) {
            case 1 -> "Kem Cho";
            case 2 -> "Hello";
            case 3 -> "नमस्ते";   
            default -> "Buna ziua";
        };

        System.out.println(result);
    }
}
