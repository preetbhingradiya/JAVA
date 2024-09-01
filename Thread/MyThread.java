
public class MyThread extends Thread {

    @Override()
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);  //this is thread is run() method thread so every etteration 2s are wait
                System.out.println("Hello");
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); //NEW state means thread are declare
        t1.start();  //  RUNNEBLE state menas thread run read to run or thread is alredy running

        // t1.interrupt();  // use when you can not wait for thread

        
        try {
            t1.join(); // wating for the thread 
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread is END");
    }
}
