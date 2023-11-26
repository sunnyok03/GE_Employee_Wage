package com.assignment_day_2_22_11_2023;

public class Employee {
    public static final int wagePerHour = 20;
    public static final int fullDayHour = 8;
    public static final int partTimeHour = 4;
    public static final int maximumWorkingDays = 20; // maximum working days in a month
    public static final int maximumWorkingHours = 100; // maximum working hours in a month

    /*
   To check randomly if employee is present or absent
   @params:
   @return: boolean (if present->true and absent->false)
    */
    public boolean checkAttendance(){
        boolean empChecker = (Math.random() <= 0.5) ? false : true;// 0->absent and 1->present
        if(empChecker) {
            System.out.println("Employee is Present");
            return true;
        }else {
            System.out.println("Employee is not Present");
            return false;
        }
    }
    /*
    To calculate daily wages of an employee
    @params: isPresent,wagePerHour,hoursWorked
    @return:
    */
    public void dailyWageCalculations(boolean isPresent,int wagePerHour,int hoursWorked){
        int fullTimeDailyWages = 0;
        if(isPresent){
           fullTimeDailyWages = wagePerHour*hoursWorked;
        }
        System.out.println("Daily wage of full time employee: "+fullTimeDailyWages);
    }

    /*
    To calculate maximum monthly wages
    @params: wagePerHour,totalHours,totalDays
    @return:
    */
    public void totalMonthlyIncome(int wagePerHour,int totalHours,int totalDays){
        int currDay = 0;
        int currHour = 0;
        int totalWage;
        int day = 0;
        while ( currHour < totalHours && currDay < totalDays && day < 30) {
            int isPresent = (Math.random() <= 0.5) ? 0 : 1;
            int isFullTime = (Math.random() <= 0.5) ? 0 : 1; // 1->full-time,0->part-time
            day++;
            if(isPresent == 0){
                continue;
            }
            currDay+=1;
            if(isFullTime == 1){ // full-time
                currHour+=8;
            }else{ // part-time
                currHour+=4;
            }
        }
        totalWage = currHour * wagePerHour;
        System.out.println("Total working days: "+currDay);
        System.out.println("Total working Hours: "+currHour);
        System.out.println("Monthly maximum wages: "+ totalWage);
    }



    /*
    To calculate monthly wages of a full-time employee
    @params: isPresent,wagePerHour,fullDayHour
    @return:
    */
    public void monthlyWageCalculations(boolean isPresent,int wagePerHour,int fullDayHour,int workingDays){
        int fullTimeDailyWages = 0;
        if(isPresent){
            fullTimeDailyWages = wagePerHour * fullDayHour * workingDays;
        }
        System.out.println("Total wage of full time employee monthly: "+fullTimeDailyWages);
    }

    /*
    To calculate monthly wages of a part-time employee
    @params: isPresent,wagePerHour,fullDayHour
    @return:
    */
    public void monthlyPartTimeWageCalculations(boolean isPresent,int wagePerHour,int partTimeHour,int workingDays){
        int partTimeDailyWages = 0;
        if(!isPresent){
            partTimeDailyWages = wagePerHour*partTimeHour*workingDays;
        }
        System.out.println("Total wage of full time employee monthly: "+partTimeDailyWages);
    }
}