package com.assignment_day_1;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the char: a");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'a', 'e','i','o','u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
