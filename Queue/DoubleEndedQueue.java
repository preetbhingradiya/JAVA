public class DoubleEndedQueue {

    private int[] doubleEndedQueue;
    private static final int DEFAULT_SIZE = 10;  // Default size for the queue
    
    private int front;  // Points to the front of the queue
    private int end;  // Points to the end of the queue
    private int size;  

    // Default constructor, initializes the queue with a default size
    public DoubleEndedQueue() {
        doubleEndedQueue = new int[DEFAULT_SIZE];
        front = 0;
        end = doubleEndedQueue.length - 1;
        size = 0;
    }

    // Constructor with custom size
    public DoubleEndedQueue(int size) {
        doubleEndedQueue = new int[size];
        front = 0;
        end = size - 1;
        this.size = size;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == doubleEndedQueue.length;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }


    public void insertFirst(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        // Move the front pointer to the previous position in the circular queue
        front = (front - 1 + doubleEndedQueue.length) % doubleEndedQueue.length;
        doubleEndedQueue[front] = val;
        size++;
    }


    public void insertLast(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        // Move the end pointer to the next position in the circular queue
        end = (end + 1) % doubleEndedQueue.length;
        doubleEndedQueue[end] = val;
        size++;
    }


    public int peekFirst() {
        if (isEmpty()) {
            System.err.println("Queue is empty");
            return -1;
        }
        return doubleEndedQueue[front];
    }


    public int peekLast() {
        if (isEmpty()) {
            System.err.println("Queue is empty");
            return -1;
        }
        return doubleEndedQueue[end];
    }


    public int deleteFirst() {
        if (isEmpty()) {
            System.err.println("Queue is empty");
            return -1;
        }
        int val = doubleEndedQueue[front];
        // Move the front pointer to the next position
        front = (front + 1) % doubleEndedQueue.length;
        size--;
        return val;
    }

    // Delete and return the last element
    public int deleteLast() {
        if (isEmpty()) {
            System.err.println("Queue is empty");
            return -1;
        }
        int val = doubleEndedQueue[end];
        // Move the end pointer to the previous position
        end = (end - 1 + doubleEndedQueue.length) % doubleEndedQueue.length;
        size--;
        return val;
    }
    
    // Print the current elements in the queue for debugging
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(doubleEndedQueue[i] + " ");
            i = (i + 1) % doubleEndedQueue.length;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // Creating a new Double-Ended Queue with the default size
        DoubleEndedQueue deque = new DoubleEndedQueue();

        // Dummy input: inserting values at the front and back
        System.out.println("Inserting elements at the front and back:");
        deque.insertFirst(10);  
        deque.insertFirst(20);  
        deque.insertLast(30);   
        deque.insertLast(40);   

        // Printing the queue after insertions
        deque.printQueue();  // Expected output: Queue: 20 10 30 40

        System.out.println("\nPeeking at the first and last elements:");
        System.out.println("First element: " + deque.peekFirst());  
        System.out.println("Last element: " + deque.peekLast());   

        System.out.println("\nDeleting elements from the front and back:");
        System.out.println("Deleted from front: " + deque.deleteFirst());  
        System.out.println("Deleted from last: " + deque.deleteLast());  

        
        deque.printQueue(); 

        System.out.println("\nInserting more elements:");
        deque.insertFirst(50);  
        deque.insertLast(60);   

        deque.printQueue();  

        // Dummy input: deleting all elements from the front
        System.out.println("\nDeleting all elements from the front:");
        System.out.println("Deleted from front: " + deque.deleteFirst()); 
        System.out.println("Deleted from front: " + deque.deleteFirst()); 


        deque.printQueue();  // Expected output: Queue: 30 60 
    }
}
