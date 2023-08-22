package org.example;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+491755367503", "Iphone SE", "100g");
        Phone phone1 = new Phone("+491652535360", "Iphone 13", "150g");
        Phone phone2 = new Phone("+490501930098", "Samsung S21", "120g");
        phone1.recieveCall("Erik");
        phone2.recieveCall("Anna");
        phone.recieveCall("Lui");
        System.out.println(phone.getNumber());
        System.out.println(phone2.getNumber());
        Phone phone3 = new Phone("+49564003056", "Samsung A70");
        System.out.println(phone3.getNumber());
        phone3.recieveCall("Aliona", "+49564003056");
        Phone phone4 = new Phone();
        phone4.getNumber();
        phone4.sendMessage("+49564003056", "+49564003090", "+49564003786");
        Phone phone5 = new Phone("+40585940303", "Iphone 12 Pro");
    }
}