package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int isPresent = (int)(Math.random()*10)%2;
        int employeeWage = 0;
        if (isPresent == 0) {
            System.out.println("Employee is Absent");
            System.out.println("Employee Wage is " + employeeWage);
        }
        else {
            System.out.println("Employee is present");
            employeeWage = 8 * 20;
            System.out.println("Employee Wage is " + employeeWage);
        }
    }
}
