package com.helloworld;

public class Scope {
    static void sayHello2(String name){
        String hello = "Hello " + name;
        if (!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }
    }
}
