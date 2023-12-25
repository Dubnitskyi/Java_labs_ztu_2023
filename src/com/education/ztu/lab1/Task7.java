package com.education.ztu.lab1;

public class Task7 {
    public static void main(String[] args) {
        char[] alpha = new char[26];
        for (int i = 0; i < 26 ; i++){
            alpha [i] = (char) (i + 65);
            System.out.printf("%c ==> %d%n", alpha[i],(int)alpha[i]);
        }
    }
}