package Basics.basic_Question;

import java.util.Scanner;

public class Project_2 {
    public static void main(String[] args) {
        // Accept the parameters and calculate the Compound Interest & print it on STDOUT (Use Math class methods)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal:");
        double P = scanner.nextDouble();

        System.out.println("Rate of interest:");
        double r = scanner.nextDouble();

        System.out.println("Compounded twice a year:");
        int n = scanner.nextInt();

        System.out.println("Time period:");
        int t = scanner.nextInt();

        double A = P * Math.pow(1 + r / 100, n * t);
        double CI = A - P;
        System.out.println("Compound Interest=>" + CI);


    }
}
