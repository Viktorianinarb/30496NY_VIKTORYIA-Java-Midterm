package math_problems;

import java.sql.SQLOutput;

public class Factorial {

    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static int FactorialRecursive(int num){
        if (num == 1){return 1;}
        return num * FactorialRecursive(num -1);
    }

    public static int FactorialIterative(int num){
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
    System.out.println(FactorialRecursive(5));
    System.out.println(FactorialIterative(5));
    }

}
