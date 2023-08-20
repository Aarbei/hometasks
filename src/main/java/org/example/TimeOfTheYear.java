package org.example;

import java.util.Scanner;

public class TimeOfTheYear {
    public TimeOfTheYear() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of a month: ");
        int num = in.nextInt();
        if (num != 1 && num != 2 && num != 12) {
            if (num >= 3 && num <= 5) {
                System.out.print("It's SPRING!");
            } else if (num >= 6 && num <= 8) {
                System.out.print("It's SUMMER");
            } else {
                System.out.print("It's AUTUMN!");
            }
        } else {
            System.out.print("It's WINTER!");
        }

    }
}
