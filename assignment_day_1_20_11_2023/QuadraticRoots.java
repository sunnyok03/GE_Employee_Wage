package com.assignment_day_1_20_11_2023;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a,b and c of ax^2+bx+c=0: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double delta = Math.sqrt(b*b - 4*a*c);
        System.out.println("Roots are: "+(delta-b)/2*a +" and " + (-delta-b)/2*a);
    }
}
