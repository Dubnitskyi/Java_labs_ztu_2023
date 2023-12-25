package com.education.ztu.lab1;


import java.util.Scanner;

public class Task6 {
    static int[] fibonacci(int n) {
        int[] fibonacciArray = new int[n];
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;
        for(int i =2 ; i < n ; i++){
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        return fibonacciArray;
    }

    public static int[] reversfibonacci(int n){
        int[] reversfibonacciArray = new int[n];
        int[] fibonacciArray = fibonacci(n);
        for(int i = 0; i< n ; i++){
            reversfibonacciArray[i] = fibonacciArray[n - i -1];
        }
        return reversfibonacciArray;
    }


    public static void printArr(int[] array){
        for(int num:array){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scan.nextInt();
        scan.close();

        int[] fibonacciArray = fibonacci(n);
        int[] reversfibonacciArray = reversfibonacci(n);

        System.out.println("Fibonacci: ");
        printArr(fibonacciArray);

        System.out.println("Revers Fibonacii");
        printArr(reversfibonacciArray);
    }
}
