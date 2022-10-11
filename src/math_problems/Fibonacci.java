package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/
    public static int fibonacci(int fibnum){
        if(fibnum <= 1){return fibnum;}
        return fibonacci(fibnum-1) + fibonacci(fibnum -2);
    }
    public static void main(String[] args) {
    for (int i = 0; i<40; i++){
        System.out.print(fibonacci(i) + ", ");
    }
    }
}
