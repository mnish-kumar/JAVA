package Basics.controlFlow_Question;

import java.util.Scanner;

public class Project_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                /* Question = 16.Accept name and age from the user. Check if the user is a valid voter or not.
        Valid - Hello Shery, You are a valid voter.
        Invalid - Sorry Shery, you can't vote.
        Part 2 - Print after how many years the user will be eligible */

        System.out.println("Enter Your name:");
        String name = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Valid - Hello ," + name + " You are a valid voter.");
        } else if (age < 18) {
            System.out.println("Invalid - " + name + " you can't vote.");
        } else {
            System.out.println("Eligible for vote minimum 18 years.");
        }
    }
}
