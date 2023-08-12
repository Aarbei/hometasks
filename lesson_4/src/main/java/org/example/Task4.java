package org.example;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Task №4");
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.print("The first array: ");
        for(int i = 0; i < arr1.length; i++){
        arr1[i] = (int) (Math.random() * 10);
        System.out.print(arr1[i]);

            if(i != arr1.length -1){
                System.out.print(", ");
            }

        }
        double average1 = Arrays.stream(arr1).average().orElse(Double.NaN);
        System.out.printf("\nAverage value of the first array: %.2f", average1);
        System.out.print("\nThe second array: ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = (int) (Math.random() * 10);
            System.out.print(arr2[i]);

            if(i != arr2.length -1){
                System.out.print(", ");
            }
        }
        double average2 = Arrays.stream(arr2).average().orElse(Double.NaN);
        System.out.printf("\nAverage value of the second array: %.2f", average2);
        if(average1 > average2){
            System.out.println("\nAverage value of the first array is bigger, then the second");
        }
        else if(average1 == average2){
            System.out.println("\nAverage values are the same in the both arrays");
        }
        else{
            System.out.println("\nAverage value of the second array is bigger, then the first");
        }

    }
}
