
import java.util.Stack;



public class Index {

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(49);
        stack.push(67);
        stack.push(70);

        System.out.println(stack);

        System.err.println(stack.pop()); //Last In First One
    }
    
}