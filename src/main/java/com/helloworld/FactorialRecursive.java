package com.helloworld;

public class FactorialRecursive {
    public static void main(String[] args) {
        int num = 5;

        int factorial = FactorialRecursive.factorialRecursive(num);
        System.out.println("Factorial of " + num + " using recursive method: " + factorial);
    }

    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        }
        else{
        return  value * factorialRecursive(value - 1) ;
        }
    }
}
