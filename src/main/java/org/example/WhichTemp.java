//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.Scanner;

public class WhichTemp {
    public WhichTemp() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the temperature: ");
        int temp = in.nextInt();
        if (temp > -5) {
            System.out.print("Warm");
        } else if (temp < -5 && temp > -20) {
            System.out.print("Average");
        } else {
            System.out.print("Soo cold!");
        }

    }
}
