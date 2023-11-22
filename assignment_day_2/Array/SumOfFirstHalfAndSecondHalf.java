package com.assignment_day_2.Array;

import java.util.Scanner;

public class SumOfFirstHalfAndSecondHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an even number: ");
        int n = sc.nextInt();
        int leftHalfSum = 0,rightHalfSum = 0;
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(i < n/2){
                leftHalfSum += temp;
            }else{
                rightHalfSum += temp;
            }
        }
        if(leftHalfSum == rightHalfSum){
            System.out.println("Left half sum equals right half sum.");
        }else{
            System.out.println("Left half sum is not equal to right half sum.");
        }
    }
}
