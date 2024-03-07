
public class Constructor {
    
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.name="preet";
        System.out.println(s1.name);

        student s2 = new student(s1);
    }
}

class student{
    String name;

    // student is cronstructor of student class

    //parametrized
    // student(String name){
    //     this.name = name;
    //     System.out.println("Constructor is called");
    // }

    //non-parametrized
        student(){
        System.out.println("Constructor is called");
    }

    //Copy constructor as copy of object s1 in constructor parameter
    student(student s1){
        this.name=s1.name;
    }
}