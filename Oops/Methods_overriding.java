class Humans{
    public void eat(){
        System.out.println("eatng is the proccess of human");
    }
}

class Male extends Humans{

    public void eat(){
        System.out.println("Male is also eat the some fruit");
    }
}

public class Methods_overriding {

    public static void main(String[] args){
        Male overriading = new Male();

        overriading.eat();
    }
    
}