package Basics.controlFlow_Question;

import java.util.Scanner;

public class Project_21 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter movie rating");

        String movieStatus = " ";
        double rating = scanner.nextDouble();
        if (rating >= 0.0 && rating <= 2.0)
            System.out.println("Flop");
        else if (rating >= 2.1 && rating <= 3.4)
            System.out.println("Semi-hit");
        else if (rating >= 3.5 && rating <= 4.5)
            System.out.println("Hit");
        else if (rating >= 4.6 && rating <= 5.0)
            System.out.println("Super hit");

        System.out.println(movieStatus);
    }
}
