package org.example;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Task  №3");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Ваш массив: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i]);

            if(i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        int min = (int) Arrays.stream(arr).min().getAsInt();
        int max = (int) Arrays.stream(arr).max().getAsInt();
        double avarage = Arrays.stream(arr).average().orElse(Double.NaN);
        System.out.println("\nМинимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.printf("Среднее значение: %.1f", avarage);
        System.out.println(size);
    }
}
