import java.util.Scanner;

public class student_marks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Enter student marks :");
            System.out.println("0. Exit :");
            System.out.println("Ennter your choice (1 or 0) :");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student marks (0 to 100) ");
                    int marks = scan.nextInt();
                    studentMarks(marks);
                    break;
                case 0:
                    System.out.println("Exit the Program Good bye");
                    break;
                default:
                    System.out.println("Invalid Choice Pase Enter (0 or 1)");
                    break;
            }
        } while (choice != 0);
    }

    public static void studentMarks(int marks){
        if(marks>=90){
            System.out.println("This is Good");
        } else if (marks >= 60) {
            System.out.println("This is also Good");
        } else if (marks >= 30) {
            System.out.println("This is Good as well\nBecause marks don't matter but our effort does.");
        } else {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }
    }
}
