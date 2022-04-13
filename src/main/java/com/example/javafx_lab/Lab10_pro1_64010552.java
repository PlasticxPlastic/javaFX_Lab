package com.example.javafx_lab;

import java.util.*;

public class Lab10_pro1_64010552 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = getArray();


        System.out.print("Enter the index of the array: ");
        try {
            System.out.println("Corresponding element value: " + array[input.nextInt()]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }

    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }
        return array;
    }
}
