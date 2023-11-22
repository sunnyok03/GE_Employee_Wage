package com.assignment_day_2.Algorithms;

import java.util.Collections;
import java.util.Scanner;

public class Sorting {
    /*
    After every iteration of second for loop we get maxm element to last
    */
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j] = arr[j]+arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] = arr[j]-arr[j+1];
                }
            }
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    /*
    With every iteration get the smallest one index and swap with ith element
    */
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minIdx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    /*
       With every loop in ith get it to correct position till ith element
    */
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }

        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)arr[i] = sc.nextInt();


//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
    }
}
