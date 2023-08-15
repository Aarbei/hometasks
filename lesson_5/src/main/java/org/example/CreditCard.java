package org.example;
import java.util.Scanner;

public class CreditCard {
    String accountNum;
    int currentAmount;

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    };

    public String getAccountNum() {
        return accountNum;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void changeCurrentAmount() {
        System.out.println("If you want to  cancel the operation ---> press 0" +
                "\nIf you want to put money on your card ---> press 1\n" +
                "If you want to withdraw money ---> press 2");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 0:

                break;
            case 1:
                System.out.println("Enter the sum to put on: ");
                int addMoney = in.nextInt();
                currentAmount += addMoney;
                System.out.println(currentAmount);

                break;
            case 2:
                System.out.println("Enter the sum to withdraw: ");
                int getMoney = in.nextInt();
                currentAmount -= getMoney;
                System.out.println(currentAmount);
                break;
        }
    }
    void printInfo(){
        System.out.println("The amount of money on the card №" + accountNum + ": " + currentAmount);
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        card1.setAccountNum("2311231");
        card1.setCurrentAmount(50);
        card1.changeCurrentAmount();
        CreditCard card2 = new CreditCard();
        card2.setAccountNum("2311232");
        card2.setCurrentAmount(0);
        CreditCard card3 = new CreditCard();
        card3.setAccountNum("2311233");
        card3.setCurrentAmount(5000);
        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}