package com.assignment_day_1_20_11_2023;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Distance from origin: "+ Math.sqrt(x*x+y*y));
    }
}
