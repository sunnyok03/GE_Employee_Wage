package com.assignment_day_2_22_11_2023;


/*
@desc: Company details including name,wage per hour,maximum allowed days,maximum allowed hours
 */
public class Company {
    private String name;
    private int totalMonthlyIncome;
    private int wagePerHour;
    private int maximumWorkingDays; // maximum working days in a month
    private int maximumWorkingHours; // maximum working hours in a month

    public Company(String name,int wagePerHour,int maximumWorkingHours,int maximumWorkingDays){
        this.name = name;
        this.maximumWorkingDays = maximumWorkingDays;
        this.maximumWorkingHours = maximumWorkingHours;
        this.wagePerHour = wagePerHour;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setWagePerHour(int wagePerHour){
        this.wagePerHour = wagePerHour;
    }
    public int getWagePerHour() {
        return wagePerHour;
    }
    public void setMaximumWorkingDays(int maximumWorkingDays){
        this.maximumWorkingDays = maximumWorkingDays;
    }
    public int getMaximumWorkingDays() {
        return maximumWorkingDays;
    }

    public void setMaximumWorkingHours(int maximumWorkingHours){
        this.maximumWorkingHours = maximumWorkingHours;
    }
    public int getMaximumWorkingHours() {
        return maximumWorkingHours;
    }

    public int getTotalMonthlyIncome(){
        System.out.printf("Total monthly income at company %s is %d",this.name,this.totalMonthlyIncome);
        System.out.println();
        return this.totalMonthlyIncome;
    }

    public void setTotalMonthlyIncome(int totalMonthlyIncome){
        this.totalMonthlyIncome = totalMonthlyIncome;
    }
}
