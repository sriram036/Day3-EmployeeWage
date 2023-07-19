package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int isPresent = (int)(Math.random()*10)%2;
        if (isPresent == 0) {
            System.out.println("Employee is Absent");
        }
        else {
            System.out.println("Employee is present");
        }
    }
}
