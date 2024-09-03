
public class SingletonClass {
    int num = 0;

    //here private constructer so any other file can't access this class oject
    private SingletonClass(){

    }

    //instance varible as satatic or signletonclass so no matter how may object create use of instance refer all only one
    private static SingletonClass instance;
     
    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }

        return instance;
    }
}
