public class CustomQueue {

    protected  int[] data;

    private static final int DEFAULT_SIZE = 10;
    
    int ptrEnd = 0; // In queue data will back size use of end point
    
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public  CustomQueue(int size){
        this.data = new int[size];
    }

    public void push(int val){
        if(isFull()){
            incerementSize();
        }

        data[ptrEnd++] = val;
    }

    public void incerementSize(){
        int size = data.length * 2;
        int[] newData = new int[size];
    
        for (int i = 0; i < data.length; i++) 
            newData[i] = data[i];
        
        // Update the reference to the new array
        data = newData;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Not pop in empty queue");
        }
        int removed = data[0];  

        //shit the element in right to left because data[0] removed so 1 -> ptrEnd
        for(int i=1; i<ptrEnd; i++){
            data[i-1] = data[i];
        }
        ptrEnd--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()) throw new Exception("Queue is empty");

        return data[0];
    }

    public boolean isFull(){
        return ptrEnd == data.length;
    }

    public boolean  isEmpty(){
        return ptrEnd == 0;
    }


    @Override
    public String toString(){
        if (isEmpty()) return "Stack is empty";

        StringBuilder sb = new StringBuilder();
        sb.append("Queue: [");

        for (int i = 0; i <= ptrEnd; i++) {
            sb.append(data[i]);
            if (i < ptrEnd) sb.append(", ");
        }

        sb.append("]");
        return sb.toString();
    }


    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue();

        queue.push(20);
        queue.push(56);
        queue.push(78);
        System.err.println(queue);

        System.out.println("Remove " + queue.pop());

        System.err.println(queue);

        System.out.println("Peek " + queue.peek());
    }
}
