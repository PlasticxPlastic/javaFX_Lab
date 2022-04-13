package com.example.javafx_lab;

import java.io.*;
public class Lab10_pro3_64010552 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");

        String rank = "";
        double salary;
        try (
                PrintWriter pr = new PrintWriter(file);
        ) {
            for (int i = 1; i <= 1000; i++) {
                pr.print("FirstName" + i + " LastName" + i);
                rank = getRank();
                salary = getSalary(rank);
                pr.printf(" " + rank + " %.2f\n", salary);
            }
        }
    }

    public static String getRank() {
        String[] ranks = {"assistant", "associate", "full"};
        return ranks[(int)(Math.random() * ranks.length)];
    }

    public static double getSalary(String rank) {
        if (rank.equals("assistant"))
            return  50000 + (double)(Math.random() * 30001);
        else if (rank.equals("associate"))
            return 60000 + (double)(Math.random() * 50001);
        else
            return 75000 + (double)(Math.random() * 55001);
    }
}
