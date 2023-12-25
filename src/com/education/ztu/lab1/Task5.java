package com.education.ztu.lab1;


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int numb = scan.nextInt();
        scan.close();
        int sum = 0;
        while(numb>0){
            int digit = numb % 10;
            sum += digit;
            numb /=10;
        }

        System.out.println("Summ: " + sum);
    }
}
