import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//Url = https://geeksforgeeks.org/problems/next-larger-element-1587115620/1
//NGF = next greater element 

public class NextGreaterElement {

    public static void main(String[] args){
        int [] arr = {1, 3, 2, 4};
        System.out.println(nextLargerElement(arr));
    }

        public static ArrayList<Integer> nextLargerElement(int[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>(n);
        
        //start from last so every last position is -1
        for(int i=n-1; i>=0; i--){
            //while stack is not empty && current value is greater to peek still pop 
            while(!stack.isEmpty() && stack.peek() <= arr[i]) stack.pop();
            if(stack.isEmpty()) list.add(-1);  //1) stack is empty add -1
            else list.add(stack.peek());  //2) otherwise add stack peek
            stack.push(arr[i]);
        }

        //corrent ans = reverse the list
        ArrayList<Integer> result = new ArrayList<>(n);
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        
        return result;
    }


}
