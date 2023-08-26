package com.helloworld;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello("Firly", "Ananda");
    }   

    String firstName = "Firly";
    String lastName = "Ananda";

    static void sayHello(){
        System.out.println("Hello " );
    }

    static void sayHello(String firstname){
        System.out.println("Hello" + firstname);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
