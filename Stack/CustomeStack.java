

public class CustomeStack {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomeStack(){
        this(DEFAULT_SIZE);        
    }

    public CustomeStack(int size){
        this.data = new int[size];
    }


    public boolean push(int val){
        if(isFull()) incerementSize();

        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop()throws StackException{
        if(isEmpty()) throw new StackException("Cannot pop from an empty stack!!");
        
        return data[ptr--];
    }


    public int peek() throws StackException{
        if(isEmpty()) throw new StackException("Cannot peek from an empty stack!!");

        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean  isEmpty(){
        return ptr == -1;
    }

    public void incerementSize(){
        int size = data.length * 2;
        int[] newData = new int[size];
    
        for (int i = 0; i < data.length; i++) 
            newData[i] = data[i];
        
        // Update the reference to the new array
        data = newData;
    }

    @Override
    public String toString(){
        if (isEmpty()) return "Stack is empty";

        StringBuilder sb = new StringBuilder();
        sb.append("Stack: [");

        for (int i = 0; i <= ptr; i++) {
            sb.append(data[i]);
            if (i < ptr) sb.append(", ");
        }

        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) throws  StackException {
        CustomeStack stack =new CustomeStack();

        stack.push(12);
        stack.push(89);

        stack.pop();

        System.err.println(stack.peek());
        System.out.println(stack);
    }
}
