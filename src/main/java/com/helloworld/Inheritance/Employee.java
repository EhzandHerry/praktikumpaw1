package com.helloworld.Inheritance;

public class Employee {
   
        String name;
            Employee(String name){
                this.name = name;
            }
            void sayHello(String name){
                System.out.println("Hi " + name + ", My name Is Employee " + this.name);
            }
    
    
}
