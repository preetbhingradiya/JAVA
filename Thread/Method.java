class Yield extends Thread{
    @Override()
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running ");
            Thread.yield();  //method talk to change another thread are also run
        }
    }
}

public class Method {
    public static void main(String[] args) {
        Yield t1 = new Yield();
        Yield t2 = new Yield();
        t1.start();
        t2.start();
    }
}
