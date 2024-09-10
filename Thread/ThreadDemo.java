
class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("A :- Hii.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("B :- Hello.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


//Another method for implement thread use of implementation Runnable
class X implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("X :- Hii.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Y implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Y :- Hello.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        A n1 = new A();
        B n2 = new B();

        System.out.println(n1.getPriority());
        n1.setPriority(n2.MAX_PRIORITY);

        // n1.start();
        // n2.start();

        Thread t1 = new Thread(new X());
        Thread t2 = new Thread(new Y());
        t1.start();
        t2.start();
    }
}
