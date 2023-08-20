//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.Scanner;

public class TimeOfTheYearSwC {
    public TimeOfTheYearSwC() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of a month: ");
        int num = in.nextInt();
        switch (num) {
            case 1:
            case 2:
            case 12:
                System.out.print("It's WINTER!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("It's SPRING!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("It's SUMMER");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("It's AUTUMN!");
                break;
            default:
                System.out.print("Your input is incorrect!");
        }

    }
}
