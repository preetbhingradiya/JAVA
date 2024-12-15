import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> stack1 = new Stack<>();

    Stack<Integer> stack2 = new Stack<>();

    public void enQueue(int val){  
        //in insert time all value can transfer from stack1 to stack2 beacuse follow FIFO flow
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack1.push(val);

        //after add val in stack1 add other val from stack1
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int deQueue(){
        if(stack1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        return stack1.pop();
    }

    public int peek() {
        if(stack1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        return stack1.peek();
    }

    public static void main(String[] args){

        QueueUsingStack queue = new QueueUsingStack();

        queue.enQueue(12);
        queue.enQueue(99);
        queue.enQueue(0);

        System.out.println("Peek is "+  queue.peek());
        System.out.println("Pop is " + queue.deQueue());
        System.out.println("Peek is "+  queue.peek());

        queue.enQueue(8);
        System.out.println("Pop is " + queue.deQueue());
        System.out.println("Peek is "+  queue.peek());


    }
}
