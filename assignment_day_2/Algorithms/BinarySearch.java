package com.assignment_day_2.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter n elements sorted in asc: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to find: ");
        int find = sc.nextInt();
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (high+low)/2;
            if(arr[mid] == find){
                System.out.println("Found");
                return;
            }else if(arr[mid] > find){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println("Not found");
    }
}
