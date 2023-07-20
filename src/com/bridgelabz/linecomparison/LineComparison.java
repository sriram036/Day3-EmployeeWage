package com.bridgelabz.linecomparison;
import java.util.Scanner;
public class LineComparison {
    static Scanner scanner = new Scanner(System.in);
    static float findLength() {
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
        return lineLength;
    }

    public static void main(String[] args) {

        float line1Length = findLength();
        System.out.println("The Line1 Length is " + line1Length);
        float line2Length = findLength();
        System.out.println("The Line2 Length is " + line2Length);
        if (line1Length == line2Length) {
            System.out.println("The 2 line length is equal.");
        }
        else {
            System.out.println("The 2 line length is not equal.");
        }

    }
}
