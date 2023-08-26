package com.oop;

public class AppMAnager {
    public static void main (String[] args){
        var manager = new Manager();
        manager.name = "Ehzand";
        manager.sayHello("Eko");

        var VicePresident = new VicePresident();
        VicePresident.name = "Fikri";
        VicePresident.sayHello("Budi");
    }
}
