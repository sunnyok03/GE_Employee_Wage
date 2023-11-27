package com.assignment_day_2_22_11_2023;

import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to employee wage program.");

        Employee emp = new Employee();
        //attendance check
        boolean isPresent = emp.checkAttendance();

        System.out.print("Enter wagePerHour, maximumWorkingHours and maximumWorkingDays respectively: ");
        int wagePerHour = sc.nextInt();
        int maximumWorkingHours = sc.nextInt();
        int maximumWorkingDays = sc.nextInt();

        //check wage for full day
        emp.dailyWageCalculations(wagePerHour,Employee.fullDayHour);

        // check wage for part-time
        emp.dailyWageCalculations(wagePerHour,Employee.partTimeHour);

        //check wage for full time of a month
        emp.monthlyWageCalculations(wagePerHour,Employee.fullDayHour,maximumWorkingDays);

        int isFullTime = (Math.random() <= 0.5) ? 0 : 1;//1->full-time,0->part-time
        int hrs;
        switch(isFullTime){
            case 1: // full time
                hrs = 8;
                break;
            case 0: // part-time
                hrs = 4;
                break;
            default:
                hrs = 0;
        }
        System.out.println("Wages are: "+(hrs*wagePerHour));

        // check wage for part-time of a month
        emp.monthlyPartTimeWageCalculations(wagePerHour,Employee.partTimeHour,maximumWorkingDays);

        //creating new companies
        Company comp1 = new Company("A",wagePerHour,maximumWorkingHours,maximumWorkingDays);
        Company comp2 = new Company("B",wagePerHour,maximumWorkingHours,maximumWorkingDays);

        // calculate maximum monthly income of a company
        emp.totalMonthlyIncome(comp1);
        emp.totalMonthlyIncome(comp2);

    }
}
