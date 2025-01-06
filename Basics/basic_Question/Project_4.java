package Basics.basic_Question;

import java.util.Scanner;

public class Project_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of radius:");
        double r = scanner.nextDouble();

        double Area = 4 * Math.PI * r * r;
        System.out.println("Area of sphere is :" + Area);

    }
}
