package com.assignment_day_2_22_11_2023;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage program.");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int workingDays = 20;

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

        int isFullTime = 1;
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
        //full time wage calculation
        public static void dailyWageCalculations(int isPresent,int wagePerHour,int fullDayHour){
            int fullTimeDailyWages = isPresent*wagePerHour*fullDayHour;
            System.out.println("Daily wage of full time employee: "+fullTimeDailyWages);
        }

        //part-time wage calculation
        public static void partTimeWageCalculations(int isPresent,int wagePerHour,int partTimeHour){
            int partTimeDailyWages = isPresent*wagePerHour*partTimeHour;
            System.out.println("Daily wage of full time employee: "+partTimeDailyWages);
        }

    //full time monthly wage calculation
    public static void monthlyWageCalculations(int isPresent,int wagePerHour,int fullDayHour,int workingDays){
        int fullTimeDailyWages = isPresent*wagePerHour*fullDayHour*workingDays;
        System.out.println("Daily wage of full time employee: "+fullTimeDailyWages);
    }

    //part-time monthly wage calculation
    public static void monthlyPartTimeWageCalculations(int isPresent,int wagePerHour,int partTimeHour,int workingDays){
        int partTimeDailyWages = isPresent*wagePerHour*partTimeHour*workingDays;
        System.out.println("Daily wage of full time employee: "+partTimeDailyWages);
    }


}
