package Basics.basic_Question;

import java.util.Scanner;

public class Project_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Accept the three sides of triangle and calculate the area using herons formula

        System.out.println("Enter Side a:");
        double a = scanner.nextDouble();

        System.out.println("Enter Side b:");
        double b = scanner.nextDouble();

        System.out.println("Enter Side c:");
        double c = scanner.nextDouble();

        // A = 1/2 × b × h.

        double Side = (a*b*c)/2;
        double area = Math.sqrt(Side * (Side - a) * (Side - b) * (Side - c));
        System.out.println(area);




    }
}
