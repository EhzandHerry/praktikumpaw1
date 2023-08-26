package com.oop;

class Manager {
    String name;

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is " + this.name); 
    }
}

class VicePresident extends Manager{

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}
