import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {

        if (this.age > that.age) // this means corrent age of this object AND that menas new age to compare it
            return 1;
        else
            return -1;

    }

}

public class Comprator_comrable {

    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {

            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        // Lambda Expression same as above com
        Comparator<Student> com1 = (i, j) -> i.age > j.age ? 1 : -1;

        List<Student> list = new ArrayList<>();
        list.add(new Student(12, "Navin"));
        list.add(new Student(34, "Aksher"));
        list.add(new Student(60, "Rutvik"));
        list.add(new Student(30, "Piyush"));

        // Collections.sort(list, com); use of Comparator to sort

        Collections.sort(list); // using Comparable default compareTo() method to sort
        // Collections.sort(list, Collections.reverseOrder()); // to sort in descending
        // order

        for (Student s : list) {
            System.out.println(s);
        }

        List<Integer> num = Arrays.asList(4, 3, 2, 1);

        // use of stream but strema rules only one time use of strema
        Stream<Integer> s1 = num.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (current, next) -> current + next);

        // s3.forEach(n -> System.out.println(n));
        System.out.println(result);

        // in online of stream
        int ans = num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (current, next) -> current + next);

        System.out.println(ans);
    }
}