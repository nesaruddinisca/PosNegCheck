package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Test");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number:");
        int num;
        num = input.nextInt();

        if (num >= 0) {
            System.out.println("Positiv Number.");

        } else {
            System.out.println("Nagativ Number.");
        }
    }
}
