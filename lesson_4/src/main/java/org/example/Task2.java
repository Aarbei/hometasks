//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.Scanner;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        System.out.println("Task  №2");
        int[] Arr = new int[10];

        int i;
        for(i = 0; i < Arr.length; ++i) {
            Arr[i] = (int)(Math.random() * 10.0);
        }

        System.out.print("The massive is: ");

        for(i = 0; i < Arr.length; ++i) {
            System.out.print(Arr[i]);
            if (i != Arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("\nThe number to reduce should be unique!\nWhich number do you want to reduce: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int check = 0;

        for(i = 0; i < Arr.length; ++i) {
            if (Arr[i] == num) {
                check = i;
            }
        }

        int[] Arr2 = new int[9];

        for(i = 0; i < Arr2.length; ++i) {
            if (i < check) {
                Arr2[i] = Arr[i];
            } else if (i >= check) {
                Arr2[i] = Arr[i + 1];
            }
        }

        System.out.print("The new massive is: ");

        for(i = 0; i < Arr2.length; ++i) {
            System.out.print(Arr2[i]);
            if (i != Arr2.length - 1) {
                System.out.print(", ");
            }
        }

        if (check == 0) {
            System.out.println("\nThere is such a number in the massive!");
        } else {
            System.out.println("\nThe number was reduced!");
        }

    }
}
