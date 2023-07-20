package com.bridgelabz.linecomparison;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 value:");
        int x1 = scanner.nextInt();
        System.out.println("Enter x2 value:");
        int x2 = scanner.nextInt();
        System.out.println("Enter y1 value:");
        int y1 = scanner.nextInt();
        System.out.println("Enter y2 value:");
        int y2 = scanner.nextInt();
        int x = (x2 - x1) * (x2 - x1);
        int y = (y2 - y1) * (y2 - y1);
        float lineLength = (float) (Math.sqrt(x + y));
        System.out.println("The Line Length is " + lineLength);
    }
}
