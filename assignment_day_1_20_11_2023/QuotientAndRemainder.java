package com.assignment_day_1_20_11_2023;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A and B to find A/B and A%B: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Quotient: " + A/B + " and Remainder: " + A%B);
    }
}
