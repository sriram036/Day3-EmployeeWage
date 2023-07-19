package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int isPresent = (int)(Math.random()*3-1+1)+1;
        int employeeWage = 0;
        if (isPresent == 1) {
            System.out.println("Employee is Absent");
            System.out.println("Employee Wage is " + employeeWage);
        }
        else if (isPresent == 2) {
            System.out.println("Employee is part time");
            employeeWage = 4 * 20;
            System.out.println("Employee Wage is " + employeeWage);
        }
        else {
            System.out.println("Employee is present");
            employeeWage = 8 * 20;
            System.out.println("Employee Wage is " + employeeWage);
        }
    }
}
