package com.bridgelabz;


/*
@desc: Company details including name,wage per hour,maximum allowed days,maximum allowed hours
 */
public class Company {
    final private String name;
    final private int wagePerHour;
    final private int maximumWorkingDays; // maximum working days in a month
    final private int maximumWorkingHours; // maximum working hours in a month
    final public int fullDayHour = 8;
    final public int partTimeHour = 4;
    public Company(String name,int wagePerHour,int maximumWorkingHours,int maximumWorkingDays){
        this.name = name;
        this.maximumWorkingDays = maximumWorkingDays;
        this.maximumWorkingHours = maximumWorkingHours;
        this.wagePerHour = wagePerHour;
    }
    public String getName(){
        return this.name;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }
    public int getMaximumWorkingDays() {
        return maximumWorkingDays;
    }

    public int getMaximumWorkingHours() {
        return maximumWorkingHours;
    }

    /*
  To calculate daily wages of an employee
  @params: hoursWorked
  @return:
  */
    public void dailyWageCalculations(int hoursWorked){
        int fullTimeDailyWages = this.wagePerHour*hoursWorked;
        System.out.println("Daily wage of full time employee: "+ fullTimeDailyWages);
    }

    /*
    To calculate monthly wages of a full-time employee
    @params: workingDays
    @return:
    */
    public void monthlyFullTimeWageCalculations(int workingDays){
        int fullTimeDailyWages = this.wagePerHour * this.fullDayHour * workingDays;
        System.out.println("Total wage of full time employee monthly: "+fullTimeDailyWages);
    }

    /*
    To calculate monthly wages of a part-time employee
    @params: workingDays
    @return:
    */
    public void monthlyPartTimeWageCalculations(int workingDays){
        int partTimeDailyWages = this.wagePerHour*this.partTimeHour*workingDays;
        System.out.println("Total wage of part time employee monthly: "+partTimeDailyWages);
    }

    /*
    @desc:To check randomly if employee is present or absent
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
}
