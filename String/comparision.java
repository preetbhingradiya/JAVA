public class comparision {
    public static void main(String[] args) {
        String name = "java";
        String language = "java";

        //if the check two difference refrence varible poin to same object check ==
        System.out.println(name == language);  //true

        String person1 = new String("Ayush");
        String person2 = new String("Ayush");

        System.out.println(person1 == person2); //false

        //if the olu check the object value use .equal method
        System.out.println(person1.equals(person2));
    }
}
