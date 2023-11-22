package com.assignment_day_2.Array;

import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        System.out.println("Enter n elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            max = Math.max(max,arr[i]);
        }
        System.out.println("Maximum value: "+max);
    }
}
