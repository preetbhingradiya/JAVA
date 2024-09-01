
class Counter {

    int counter = 0;

    //use of synchronized bcz if any time one thread increse value same time 2 thread are ewait for compelete 1 thread
    public synchronized void increment() {
        counter++;
    }

    public int getCount() {
        return counter;
    }

}

class MyNewThread extends Thread {

    private final Counter counter;

    public MyNewThread(Counter counter) {
        this.counter = counter;
    }

    @Override()
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Synchronized {

    public static void main(String[] args) {
        Counter counter = new Counter();
        MyNewThread t1 = new MyNewThread(counter);
        MyNewThread t2 = new MyNewThread(counter);

        t1.start();
        t2.start();

        try {
            //wait both thread to complete
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }

        System.out.println(counter.getCount());
    }
}