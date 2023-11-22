package com.assignment_day_2_22_11_2023;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage program.");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;

        //attendance check
       checkAttendance();

        //check wage for full day
        dailyWageCalculations(1,wagePerHour,fullDayHour);

        // check wage for part-time
        partTimeWageCalculations(1,wagePerHour,partTimeHour);
    }

    public static void checkAttendance(){
        int empChecker = (Math.random() <= 0.5) ? 0 : 1;// 0->absent and 1->present
        if(empChecker == 1) {
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is not Present");
        }
    }
        //full time wage calculation
        public static void dailyWageCalculations(int isPresent,int wagePerHour,int fullDayHour){
            int fullTimeDailyWages = isPresent*wagePerHour*fullDayHour;
            System.out.println("Daily wage of full time employee: "+fullTimeDailyWages);
        }

        //part time wage calculation
        public static void partTimeWageCalculations(int isPresent,int wagePerHour,int partTimeHour){
            int partTimeDailyWages = isPresent*wagePerHour*partTimeHour;
            System.out.println("Daily wage of full time employee: "+partTimeDailyWages);
        }
}
