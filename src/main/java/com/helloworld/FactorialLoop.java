package com.helloworld;

public class FactorialLoop {
    public static void main(String[] args) {
        int num = 5;
        int factorialResult = factorial(num);
        System.out.println("Factorial of " + num + " using loop: " + factorialResult);
    }

    static int factorial(int value){
        var result = 1;
        for (int i = 1; i <= value; i++){
            result *= i;
        }
        return result;
    }
}
