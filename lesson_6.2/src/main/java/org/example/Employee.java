package org.example;

public class Employee implements Title{
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public void printTitle() {
        System.out.println("The title of the worker is " + this.getClass().getSimpleName());
    }
}
