package com.assignment_day_2.Array;

import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int secondMax = max;
        System.out.println("Enter n elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] >= max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println("Second maximum value: " + secondMax);
    }
}
