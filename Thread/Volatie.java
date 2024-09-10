
//here with out use of Volatie keyword every thread store own base varible so read store flag false afterwrite was can make true still
//so use of volatile varible are global declarations
class SharedObj{
    private volatile boolean flag = false;

    public void setFlag(boolean flag) {
        System.out.println("Write flag " + flag);
        this.flag = flag;
    }

    public void writeFlag() {
        while(!flag) {
            
        }
        System.out.println("Write the value of flog : " + flag);
    }
}

public class Volatie {
    public static void main(String[] args) {
        SharedObj s1 = new SharedObj();

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s1.setFlag(true);
        });

        Thread t2 = new Thread(() ->{
            s1.writeFlag();
        });

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
