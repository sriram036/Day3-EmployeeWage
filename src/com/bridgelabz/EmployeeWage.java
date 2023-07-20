package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int isPresent = (int)(Math.random()*3-1+1)+1;
        int employeeWage = 0;
        int monthWage = 0;
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
            }break;
            case 3: {
                System.out.println("Employee is present");
                employeeWage = 8 * 20;
                monthWage = employeeWage * 20;
                System.out.println("Employee Wage is " + employeeWage);
                System.out.println("Employee Monthly Wage is " + monthWage);
            }break;
        }
    }
}
