package com.education.ztu.lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        scan.close();
        int sum = x+y;
        System.out.print("Summ = "+ sum );
    }
}
