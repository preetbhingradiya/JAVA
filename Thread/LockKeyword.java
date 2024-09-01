
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//When use of sysnchronized that time if one thread are run to rescond thread are wait for the complete of 1 thread
// here if the pay the ruppe time not comfirme how many time for withrdow so use lock is better for  synchronized

class BankAccount{
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " Atteming to withdraw" + amount);

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " Proccessing for withdraw" + amount);
                        Thread.sleep(2000); //getter time compare to set lock time
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed withdraw, proccessing balalnce : " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }finally{
                        lock.unlock();
                    }
                }else{
                    System.out.println("insufficient balance");
                }
            }else{
                System.out.println(Thread.currentThread().getClass() + " could not access lock, will try letter");
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            Thread.currentThread().interrupt();
        }
    }
}

public class LockKeyword {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable task = () -> {
            sbi.withdraw(50);
        };
        Thread t1 = new Thread(task, "Rahul");
        Thread t2 = new Thread(task, "Vinod");

        t1.start();
        t2.start();
    }
}
