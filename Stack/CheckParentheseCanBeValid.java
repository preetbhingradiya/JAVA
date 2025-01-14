import java.util.Stack;

public class CheckParentheseCanBeValid {

    public static void main(String[] args){
        String s = "))()))";
        String locaked = "010100";     

        
        // System.out.println(canBeValid(s, locaked));
        System.out.println(canBeValidStack(s, locaked));

    }

    public static boolean canBeValid(String s, String locaked){
        int n = s.length();

        if(n % 2 != 0) return false;

        int balanced = 0;
        int removeBalanced = 0;

        for(int i=0; i<n; i++){
            //left to right balance
            if(locaked.charAt(i) == '0' || s.charAt(i) == '(')
                balanced++;
            else 
                balanced--;

            //right to left balance
            if(locaked.charAt(locaked.length() - 1 - i) == '0' || s.charAt(s.length() -1 - i) == ')')
                removeBalanced++;
            else 
                removeBalanced--;

            // If at any point balance count or reverse balance count goes negative, return false
            if(balanced < 0 || removeBalanced < 0) return false;
        }   

        return true;
    }

    public static boolean canBeValidStack(String s, String locked){
        int n = s.length();

        if(n % 2 != 0) return false;

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();

        for(int i=0; i < n; i++){
            char ch = s.charAt(i);
            char state = locked.charAt(i);

            if(state == '0') //if the 0 in locaked string insert blind in unlocked
                unlocked.push(i);
            else if (ch == '(') // if the ( brackets found insert blind in stack
                stack.push(i);
            else{ //here not ( bracket and not 0 found so eother ) bracket or 1 found 
                if(!stack.isEmpty())
                    stack.pop();
                else{
                    if(!unlocked.isEmpty())
                        unlocked.pop();
                    else 
                        return false;
                }
            }
        }

        // if the stack and unlocked bot are not empty and stack peek menas ( bracketsindex is less for unlocked ) index menas both are valid just pop both
        while (!stack.isEmpty() && !unlocked.isEmpty() && stack.peek() < unlocked.peek()) {
            stack.pop();
            unlocked.pop();
        }
 
        return stack.isEmpty();
    }
}