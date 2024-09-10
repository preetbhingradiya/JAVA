//thread communication use of get the data but if one data are consumer after that get another data
//so use of wait() => to wait another data
//and nofity() => to notify next thread
class SharedResources {
    private boolean hashData;

    int data;

    public synchronized void producer(int value) {
        while (hashData) { // if data is available so wait to comsumer
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        hashData = true;
        notify(); // give to change nest thread
    }

    public synchronized int consumer() {
        while (!hashData) { // if data is not available so wait
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hashData = false;
        System.out.println("Consumer: " + data);
        notify();
        return data;
    }
}

class Producer implements Runnable {
    public SharedResources resources;

    public Producer(SharedResources resources) {
        this.resources = resources;
    }

    @Override()
    public void run() {
        for (int i = 0; i <= 10; i++) {
            resources.producer(i);
        }
    }
}

class Consumer implements Runnable {
    public SharedResources resources;

    public Consumer(SharedResources resources) {
        this.resources = resources;
    }

    @Override()
    public void run() {
        for (int i = 0; i <= 10; i++) {
            resources.consumer();

        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResources resources = new SharedResources();

        // Thread t1 = new Thread(new Producer(resources), "PRODUCER");
        // Thread t2 = new Thread(new Consumer(resources), "CONSUMER");

        // use lambda expression to no use of class
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                resources.producer(i);
            }
        }, "PRODUCER");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                resources.consumer();
            }
        }, "CONSUMER");


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
