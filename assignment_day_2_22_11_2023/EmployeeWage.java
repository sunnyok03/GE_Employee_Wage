package com.assignment_day_2_22_11_2023;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage program.");

        //attendance check
        int empChecker = (Math.random() <= 0.5) ? 0 : 1;// 0->absent and 1->present
        if(empChecker == 1) {
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is not Present");
        }

        //wage calculation
        int wagePerHour = 20,fullDayHour = 8;
        int fullTimeDailyWages = empChecker*wagePerHour*fullDayHour;
        System.out.println("Daily wage of full time employee: "+fullTimeDailyWages);
    }
}
