
import java.util.ArrayList;
import java.util.List;

public class Different_way_parenthenses {

    private static List<Integer> numbers;
    private static List<Character> operators;
    private static List<Integer>[][] dp;

    public static void main(String[] args) {
        String expression = "2*3-4*5";

        parseExpression(expression);
        int n = numbers.size();
        dp = new ArrayList[n][n];

        System.out.println( compute(0, n-1));
    }

    public static List<Integer>  compute(int left, int right){
        //check if any expression is solve so no need to solve again
        if(dp[left][right] != null) return dp[left][right];

        List<Integer> result = new ArrayList<>();

        if(left == right) result.add(numbers.get(left)); //base case
        else{
            for(int i = left; i < right; i++){
                List<Integer> leftPart = compute(left, i);  //left part
                List<Integer> rightPart = compute(i+1, right); //right part
                char op = operators.get(i);
    
                for(int l : leftPart){
                    for(int r : rightPart){
                        result.add(calcu(l, r, op));
                    }
                }
            }
        }


        //add result list in dp list
        dp[left][right] = result;
        return result;
    }

    public static int calcu(int a, int b, char op){
        if(op == '+') return a+b;
        else if(op == '-') return a-b;
        return a*b;
    }


    //use this function add DIGIT in numbers list and (+, *, -) in operators list
    public static void parseExpression(String expression){
        numbers = new ArrayList<>();
        operators = new ArrayList<>();

        int num = 0;

        for(int i=0; i<expression.length(); i++){
            char ch = expression.charAt(i);

            if(Character.isDigit(ch)) num = num * 10 + (ch - '0');
            else{
                numbers.add(num);
                operators.add(ch);

                num = 0;
            }
        }

        numbers.add(num);
    }
    
}
