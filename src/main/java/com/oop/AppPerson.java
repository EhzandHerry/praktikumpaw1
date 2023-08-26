package com.oop;

public class AppPerson {
    public static void main (String[] args){
        var person = new Person("ehzand", "timika");
        person.name = "Ehzand Herry";
        person.address = "Timika";
        //person.country = "Tidak Bisa Diubah";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.sayHello("Ehzand");
    }
}
