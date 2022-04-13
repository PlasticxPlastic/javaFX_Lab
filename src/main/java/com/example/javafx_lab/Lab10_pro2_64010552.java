package com.example.javafx_lab;

import java.util.Scanner;

public class Lab10_pro2_64010552 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        try {
            Triangle triangle = new Triangle(side1, side2, side3);

            System.out.println(triangle.toString());
        }
        catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}