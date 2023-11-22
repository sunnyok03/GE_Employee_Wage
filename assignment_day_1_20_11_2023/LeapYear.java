package com.assignment_day_1_20_11_2023;
import java.util.Scanner;

public class LeapYear {
    /*
        every century year divisible by 400 and every non century
        year divisible by 4 are leap years
    */
    private static boolean isLeapYear(int year){
        if(year%400 == 0){
            return true;
        }else if(year%100 ==  0){
            return false;
        }else if(year%4 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year to check if it's leap: ");
        int year = sc.nextInt();

        if(year<1000 || year>9999){
            System.out.println("Invalid Year!");
            return;
        }

        if(isLeapYear(year)){
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
