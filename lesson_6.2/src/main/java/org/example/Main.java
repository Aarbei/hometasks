package org.example;

public class Main {
    public static void main(String[] args) {
        Director worker = new Director("Tom", "Black");
        worker.printTitle();

        Employee worker1 = new Employee("Jacke","Brown");
        worker1.printTitle();

        Accountant worker2 = new Accountant("Andrew", "Garfield", "13.06.1999");
        worker2.printTitle();
    }
}