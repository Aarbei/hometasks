//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.Scanner;

public class Task1 {
    public Task1() {
    }

    public static void main(String[] args) {
        System.out.println("Task  №1");
        int[] Arr = new int[10];

        for(int i = 0; i < Arr.length; ++i) {
            Arr[i] = (int)(Math.random() * 10.0);
        }

        System.out.print("Enter the number to check in a massive: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("The massive is: ");

        for(int i = 0; i < Arr.length; ++i) {
            System.out.print(Arr[i]);
            if (i != Arr.length - 1) {
                System.out.print(", ");
            }
        }

        boolean check = false;

        for(int i = 0; i < Arr.length; ++i) {
            if (Arr[i] == num) {
                check = true;
            }
        }

        if (check) {
            System.out.println("\nThere is such a number in the massive!");
        } else {
            System.out.println("\nThere is no such number!");
        }

    }
}
