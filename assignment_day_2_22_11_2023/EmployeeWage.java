package com.assignment_day_2_22_11_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to employee wage program.");

        System.out.print("Enter number of companies to add: ");
        int numberOfCompanies = sc.nextInt();
        EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder(numberOfCompanies);
        //adding list of companies with details
        for(int i=0;i<numberOfCompanies;i++){
            System.out.printf("Enter details of company %d.",i+1);
            System.out.println();
            System.out.print("Enter name of company: ");
            String name = sc.next();
            System.out.print("Enter wage per hour: ");
            int wagePerHour = sc.nextInt();
            System.out.print("Enter maximum working hours: ");
            int maximumWorkingHours = sc.nextInt();
            System.out.print("Enter maximum working days: ");
            int maximumWorkingDays = sc.nextInt();

            Company comp1 = new Company(name,wagePerHour,maximumWorkingHours,maximumWorkingDays);
            empWageBuilder.addCompanyDetails(comp1,i);
        }
        System.out.println("-----All details added------");

        //get monthly wages at each company
        empWageBuilder.monthlyWagesAtEachCompanies();


        // get monthly wages at each company by query
        for(int i=0;i<empWageBuilder.getCompanies().size();i++){
            Company comp = empWageBuilder.getCompanies().get(i);
            System.out.println("Total wage at " + comp.getName()+" is " +empWageBuilder.getTotalMonthlyWages(comp));
        }
    }
}
