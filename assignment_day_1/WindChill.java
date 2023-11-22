package com.assignment_day_1;
import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter t and v: ");
        double t = sc.nextDouble();
        double v = sc.nextDouble();
        double windChill = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v,0.16);
        System.out.println("wind chill is: " + windChill);
    }
}
