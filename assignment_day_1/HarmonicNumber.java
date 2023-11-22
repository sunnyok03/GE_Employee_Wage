package com.assignment_day_1;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to get harmonic number: ");
        int num = sc.nextInt();

        double result = 0;
        while(num > 0){
            result += (double) 1 /num;
            num--;
        }
        System.out.println("Nth harmonic number is: " + result);

    }
}
