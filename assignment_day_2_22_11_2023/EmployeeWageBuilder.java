package com.assignment_day_2_22_11_2023;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWageBuilder implements CompanyInterface{

    private final List<Company> companies;

    public EmployeeWageBuilder(int numberOfCompanies) {
        this.companies = new ArrayList<>();
    }

    public void monthlyWagesAtEachCompanies(){
        for(Company comp : companies){
            totalMonthlyIncome(comp);
        }
    }

    /*
     To calculate monthly wages of an employee
     @params: company object which includes company details including wagePerHour,maximumWorkingDays,maximumWorkingHours
     @return:
     */
    private void totalMonthlyIncome(Company comp){
        int currDay = 0;
        int currHour = 0;
        int totalWage;
        int day = 0;
        while (currHour < comp.getMaximumWorkingHours() && currDay < comp.getMaximumWorkingDays() && day < 30){
            boolean isPresent = (Math.random() <= 0.5) ? false : true;
            int isFullTime = (Math.random() <= 0.5) ? 0 : 1; // 1->full-time,0->part-time
            day++;
            if(!isPresent){
                continue;
            }
            currDay+=1;
            if(isFullTime == 1){ // full-time
                currHour+=8;
            }else{ // part-time
                currHour+=4;
            }
        }

        totalWage = currHour * comp.getWagePerHour();
        System.out.println("Total working days: "+currDay);
        System.out.println("Total working Hours: "+currHour);
        System.out.printf("Monthly wages at company %s: "+ totalWage,comp.getName());
        System.out.println();
    }

    /*
    @desc: add company detail to companies list
     */
    public void addCompanyDetails(Company comp,int idx){
        this.companies.add(idx,comp);
    }


}
