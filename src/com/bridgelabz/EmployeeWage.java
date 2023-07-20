package com.bridgelabz;

public class EmployeeWage {

    public static final int PARTTIME = 4;
    public static final int FULLTIME = 8;
    public static void main(String[] args) {
        int employeeWage = 0;
        int monthWage = 0;
        int workingHours = 0;
        int noOfDays = 0;
        int totalWage = 0;

        while (workingHours <= 100 && noOfDays <= 20) {
            int isPresent = (int)(Math.random()*3-1+1)+1;
            switch (isPresent) {
                case 1: {
                    System.out.println("Employee is Absent");
                    System.out.println("Employee Wage is " + employeeWage);
                    System.out.println("Employee Monthly Wage is " + monthWage);
                }break;
                case 2: {
                    System.out.println("Employee is part time");
                    employeeWage = 4 * 20;
                    monthWage = employeeWage * 20;
                    System.out.println("Employee Wage is " + employeeWage);
                    System.out.println("Employee Monthly Wage is " + monthWage);
                    workingHours += PARTTIME;
                    noOfDays++;
                    totalWage += employeeWage;
                }break;
                case 3: {
                    System.out.println("Employee is present");
                    employeeWage = 8 * 20;
                    monthWage = employeeWage * 20;
                    System.out.println("Employee Wage is " + employeeWage);
                    System.out.println("Employee Monthly Wage is " + monthWage);
                    workingHours += FULLTIME;
                    noOfDays++;
                    totalWage += employeeWage;
                }break;
            }
        }
        System.out.println("The total Wage is " + totalWage);
        System.out.println("The total number of working hours is " + workingHours);
        System.out.println("The number of working days is "+ noOfDays);
    }
}
