package com.helloworld;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Main", "Futsal");
    }

    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello " + firstname + " " + lastname);
}

}
