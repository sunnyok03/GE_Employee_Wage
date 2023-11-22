package com.extra_21_11_2023.Basic_Programs;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(0 + " " + 1 + " ");
        for(int i=2;i<n;i++){
            System.out.print(first+second + " ");
            int temp = first+second;
            first = second;
            second = temp;
        }

    }
}
