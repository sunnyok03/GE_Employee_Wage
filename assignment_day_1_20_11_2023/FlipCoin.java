package com.assignment_day_1_20_11_2023;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // taking input of times we want to flip the coin
        System.out.print("Enter number of times to flip: ");
        int times = sc.nextInt();

        // logic to count head and tail counts
        int headCounts = 0,tailCounts = 0;
        for(int i =0;i<times;i++){
            double val = Math.random();
            if(val < 0.5){
                tailCounts++;
            }else{
                headCounts++;
            }
        }

        // logic to find the head and tail percentage
        double headPercent = (double) (headCounts * 100) /times;
        double tailPercent = (double) (tailCounts * 100) /times;

        System.out.println("Head Percent: " + headPercent);
        System.out.println("Tail Percent: " + tailPercent);
    }
}
