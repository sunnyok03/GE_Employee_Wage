package com.assignment_day_1_20_11_2023;
import java.util.Scanner;

public class MaxAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println("Max among all: " + Math.max(A,Math.max(B,C)));
    }
}
