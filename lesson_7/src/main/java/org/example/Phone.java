package org.example;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, "");
    }

    public Phone(String number) {
        this.number = number;
    }

    public Phone() {

    }

    public void recieveCall(String ownerName){
        System.out.println(ownerName + " calls!");
    }

    public void recieveCall(String ownerName, String phoneNumber){
        System.out.println(phoneNumber + " " + ownerName + " calls!");
    }

    public void sendMessage(String ... args){
        System.out.println("Your message will be delivered to those numbers: ");
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

    }

    public String getNumber() {
        return number;
    }
}
