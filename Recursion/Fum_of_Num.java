
public class Fum_of_Num {

    public static int SumOfNumber(int num){
        if(num==1){
            return 1;
        }
        int store=num+SumOfNumber(num-1);
        return store;
    }

    public static void main(String[] args){
        int num=5;
        System.out.println("Sum of number is :- " + SumOfNumber(num));
    }
}
/*
 * 5+(4)
 * 4+(3);
 * 3+(2);
 * 2+(1);
 * 1     top to bottom 1+2+3+4+5 = 15
 */