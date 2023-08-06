package org.example;

import java.util.Scanner;

public class EvenOddNums {
    public EvenOddNums() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int test = num % 2;
        if (test == 0) {
            System.out.print("Your number is even(chotnoe)");
        } else {
            System.out.print("Your number is odd(nechotnoe)");
        }

    }
}
