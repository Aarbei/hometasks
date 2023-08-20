package org.example;

import java.util.Scanner;

public class Loops {
    public Loops() {
    }

    public static void main(String[] args) {
        int i;
        for(i = 1; i < 100; ++i) {
            System.out.print(i);
            if (i != 99) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for(i = 5; i > 0; --i) {
            System.out.print(i);
            if (i != 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = in.nextInt();
        int sum = 0;

        for(i = 1; i < num; ++i) {
            sum += i;
        }

        System.out.print(sum);
    }
}
