class calculator{
    int a,b;
}

class sum extends calculator{

    public int sumOfNumber(int a,int b){
        return a+b;
    }

    public double sumOfNumber(double a,double b,double c){
        return a+b+c;
    }
}

public class Method_overloading {

    public static void main(String[] args){

        sum num = new sum();
        num.a=10;
        num.b=20;

        //same method name but different parameter or different data type
        System.out.println("Sum of number is " + num.sumOfNumber(num.a, num.b));
        System.out.println("Sum of number is " + num.sumOfNumber(1.2,12.3,34.5));
    }
}

