package org.example;

public class Director implements Title{
    private String name;
    private String surname;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void printTitle() {
        System.out.println("The title of the worker is " + this.getClass().getSimpleName());
    }
}
