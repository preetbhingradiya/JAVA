import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Index {
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(54);
        queue.add(109);
        queue.add(78);

        System.out.println(queue);

        System.out.println(queue.poll()); //First In First Out

    }
    
}
