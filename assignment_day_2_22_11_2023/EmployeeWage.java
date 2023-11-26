package com.assignment_day_2_22_11_2023;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage program.");

        Employee emp = new Employee();
        //attendance check
        boolean isPresent = emp.checkAttendance();

        //check wage for full day
        emp.dailyWageCalculations(isPresent,Employee.wagePerHour,Employee.fullDayHour);

        // check wage for part-time
        emp.dailyWageCalculations(isPresent,Employee.wagePerHour,Employee.partTimeHour);

        //check wage for full time of a month
        emp.monthlyWageCalculations(isPresent,Employee.wagePerHour,Employee.fullDayHour,Employee.maximumWorkingDays);



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
        System.out.println("Wages are: "+(hrs*Employee.wagePerHour));

        // check wage for part-time of a month
        emp.monthlyPartTimeWageCalculations(isPresent,Employee.wagePerHour,Employee.partTimeHour,Employee.maximumWorkingDays);

        // calculate maximum monthly income
        emp.totalMonthlyIncome(Employee.wagePerHour,Employee.maximumWorkingHours,Employee.maximumWorkingDays);
    }
}
