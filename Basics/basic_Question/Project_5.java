package Basics.basic_Question;

import java.util.Scanner;

public class Project_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question = Find circumference and area of circle
        System.out.println("Enter value of radius:");
        double r = scanner.nextDouble();

        double Circumference = 2 * Math.PI * r;
        double Area = Math.PI * r * r;
        System.out.println("Circumference of circle:" + Circumference + "  Area of Circle:" + Area);

    }
}
