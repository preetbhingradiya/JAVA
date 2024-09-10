import java.util.LinkedList;

class Counter{
    int count;
    public synchronized void increment(){ //use of synchronized bucuse of any of case t1 and t2 thread are same time hite count so only one change are made so
        count++;
    }
}


public class ThreadCount {

    public static void main(String[] args) throws InterruptedException {
        // int num[] = new int[7];
        Counter c  = new Counter();

        Runnable obj1 = () -> {
            for(int i=0; i<10000; i++){
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i=0; i<10000; i++){
                c.increment();
            }
        };
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);


        t1.start();
        t2.start();

        t1.join();  //here after all thread and interation are complete join thread
        t2.join();


        System.out.println(c.count);
    }
    
}
