package com.assignment_day_1_20_11_2023;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to print power: ");
        int num = sc.nextInt();

        int temp = 2;
        while(num-- > 0){
            System.out.print(temp + " ");
            temp*=2;
        }
    }
}
