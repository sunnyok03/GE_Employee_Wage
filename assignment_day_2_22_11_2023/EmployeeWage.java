package com.assignment_day_2_22_11_2023;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage program.");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int workingDays = 20;
        int workingHours = 100;

        //attendance check
        boolean isPresent = checkAttendance();

        //check wage for full day
        dailyWageCalculations(1,wagePerHour,fullDayHour);

        // check wage for part-time
        partTimeWageCalculations(1,wagePerHour,partTimeHour);

        //check wage for full time of a month
        monthlyWageCalculations(1,wagePerHour,fullDayHour,workingDays);

        // check wage for part-time of a month
        monthlyPartTimeWageCalculations(1,wagePerHour,partTimeHour,workingDays);

        // calculate maximum monthly income
        totalMonthlyIncome(wagePerHour,workingDays,workingHours);

        int isFullTime = 1; // can change to 2 for part-time
        int hrs = 0;
        switch(isFullTime){
            case 1: // full time
                hrs =8;
                break;
            case 2: // part-time
                hrs = 4;
                break;
            default:
                hrs = 0;
        }
        System.out.println("Wages are: "+(hrs*wagePerHour));
    }
/*
To check randomly if employee is present or absent
@params:
@return: boolean (if present->true and absent->false
 */
    public static boolean checkAttendance(){
        int empChecker = (Math.random() <= 0.5) ? 0 : 1;// 0->absent and 1->present
        if(empChecker == 1) {
            System.out.println("Employee is Present");
            return true;
        }else {
            System.out.println("Employee is not Present");
            return false;
        }
    }
    /*
    To calculate full time wages of an employee
    @params: isPresent,wagePerHour,fullDayHour
    @return:
     */
        public static void dailyWageCalculations(int isPresent,int wagePerHour,int fullDayHour){
            int fullTimeDailyWages = isPresent*wagePerHour*fullDayHour;
            System.out.println("Daily wage of full time employee: "+fullTimeDailyWages);
        }
        /*
        To calculate part-time wages of an employee
        @params: isPresent,wagePerHour,fullDayHour
        @return:
         */
        public static void partTimeWageCalculations(int isPresent,int wagePerHour,int partTimeHour){
            int partTimeDailyWages = isPresent*wagePerHour*partTimeHour;
            System.out.println("Daily wage of full time employee: "+partTimeDailyWages);
        }
    /*
     To calculate monthly wages of a full-time employee
     @params: isPresent,wagePerHour,fullDayHour
     @return:
     */
    public static void monthlyWageCalculations(int isPresent,int wagePerHour,int fullDayHour,int workingDays){
        int fullTimeDailyWages = isPresent*wagePerHour*fullDayHour*workingDays;
        System.out.println("Total wage of full time employee monthly: "+fullTimeDailyWages);
    }
    /*
     To calculate monthly wages of a part-time employee
     @params: isPresent,wagePerHour,fullDayHour
     @return:
     */
    public static void monthlyPartTimeWageCalculations(int isPresent,int wagePerHour,int partTimeHour,int workingDays){
        int partTimeDailyWages = isPresent*wagePerHour*partTimeHour*workingDays;
        System.out.println("Total wage of full time employee monthly: "+partTimeDailyWages);
    }
    /*
    To calculate maximum monthly wages
    @params: wagePerHour,totalHours,totalDays
    @return:
     */
    public static void totalMonthlyIncome(int wagePerHour,int totalHours,int totalDays){
            int currDay = 0;
            int currHour = 0;
            int totalWage = 0;
            int day = 0;
            while ( currHour < totalHours && currDay < totalDays && day < 30) {
                int isPresent = (Math.random() <= 0.5) ? 0 : 1;
                int isFullTime = (Math.random() <= 0.5) ? 0 : 1; // 1->full-time,0->part-time
                day++;
                if(isPresent == 0){
                    continue;
                }
                if ( isFullTime == 1) { // full-time
                    currDay+=1;
                    currHour+=8;
                }else{ // part-time
                    currHour+=4;
                }

            }
            totalWage = currHour * wagePerHour;
            System.out.println("Monthly maximum wages: "+ totalWage);
    }
}
