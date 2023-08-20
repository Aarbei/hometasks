package org.example;

public class Accountant implements  Title{
    private String name;
    private String surname;
    private String dateOfBirth;

    public Accountant(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public void printTitle() {
        System.out.println("The title of the worker is " + this.getClass().getSimpleName());
    }
}
