package com.education.ztu.lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int x = scan.nextInt();

        System.out.print("Enter Second Number: ");
        int y =scan.nextInt();
        scan.close();

        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.print("Ansver: "+ x );
    }
}
