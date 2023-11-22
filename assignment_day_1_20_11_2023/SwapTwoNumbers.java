package com.assignment_day_1_20_11_2023;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A and B: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        A += B;
        B = A - B;
        A -= B;
        System.out.println("New A: " + A + " New B: " + B);
    }
}
