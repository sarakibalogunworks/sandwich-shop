package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sandwichshop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Select the sandwich size you want:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.print("Enter 1 or 2: ");
        int size = myScanner.nextInt();


        double basePrice;
        if (size == 1) {
            basePrice = 5.45;
        } else {
            basePrice = 8.95;
        }


        System.out.print("Enter your age: ");
        int age = myScanner.nextInt();


        double discount = 0;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }


        double totalCost = basePrice * (1 - discount);


        System.out.println("Cost of sandwich: $" + totalCost);



    }
}
