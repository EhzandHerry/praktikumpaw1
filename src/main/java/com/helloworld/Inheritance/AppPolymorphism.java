package com.helloworld.Inheritance;

public class AppPolymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Ehzand");
        employee.sayHello("Herry");

        employee = new Manager("Ehzand");
        employee.sayHello("Herry");

        employee = new VicePresident("Ehzand");
        employee.sayHello("Herry");

        sayHello(new Employee("Ehzand"));
        sayHello(new Manager("Fikri"));
        sayHello(new VicePresident("Farhan"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }

}
