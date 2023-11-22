package com.assignment_day_1_20_11_2023;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to get its prime factors: ");
        int num = sc.nextInt();
        while (num % 2 == 0) {
            System.out.print(2+" ");
            num = num/2;
        }

        for (int i = 3; i*i <= num; i+=2)
        {
            while (num % i == 0)
            {
                System.out.print(i+" ");
                num = num/i;
            }
        }

        if (num > 2) System.out.println(num);
    }
}
