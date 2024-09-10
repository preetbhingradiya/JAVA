
class Student<T, E> {
    T name;
    E roll;

    public Student(T name, E roll) {
        this.name = name;
        this.roll = roll;
    }

}

public class Genric<E> {
    public static void main(String[] args) {
        Student<String, Integer> navin = new Student<>("navin", 1);

        System.out.println(navin.name);
        System.out.println(navin.roll);

        Student<String, Integer> rohan = navin;

        rohan.name = "rohan";
        rohan.roll = 2;

        System.out.println(navin.name);
        System.out.println(navin.roll);

        printData("Hello World");

        printData1("ABC");
        printData1(123);
    }

    // method genric
    static <E> E printData(E data) {
        System.out.println("This is method genric : " + data);
        return data;
    }

    // boundend genric (use of method ovverloading to pass only strig and int data)
    static <E extends CharSequence> E printData1(E data) {
        System.out.println("This is method genric use of string: " + data);
        return data;
    }
    
    public static <E extends Number> E printData1(E data) {
        System.out.println("This is method genric use of number: " + data);
        return data;
    }

    // private  E data1;
    // public E getData(){
    //     return data1;
    // }

}
