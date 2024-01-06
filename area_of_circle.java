import java.util.Scanner;

public class area_of_circle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        final float pi=3.14F;
        float area=pi*r*r;

        System.out.println("Area Of Circle is :" + area);
    }

}