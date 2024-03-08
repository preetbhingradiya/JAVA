class HumanBody {
    public void displayHuman() {
        System.out.println("Method defined inside HumanBody class");
    }
}

interface Male {
    public void show();
}

interface Female {
    public void show();
}

class Child extends HumanBody implements Male, Female {
    public void show() {
        System.out.println("Implementation of show() method defined in interfaces Male and Female");
    }

    public void displayChild() {
        System.out.println("Method defined inside Child class");
    }
}

public class Hiybrid {
    public static void main(String args[]) {

        Child obj = new Child();
        obj.show();
        obj.displayChild();

    }
}
