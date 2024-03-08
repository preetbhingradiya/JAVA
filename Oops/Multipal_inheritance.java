interface Son{
    void Reading();
}

interface Daughter {
    void Singing(); 
}


class Father implements Son,Daughter{
    public void Reading(){
        System.out.println("Son is Reading book");
    }

    public void Singing(){
        System.out.println("Daughter is singing a song");
    }
}

public class Multipal_inheritance {
    public static void main(String[] args){
        Father f1 = new Father();   
        f1.Reading();
        f1.Singing();
    }
}
