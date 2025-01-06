package Basics.controlFlow_Question;

import java.util.Scanner;

public class Project_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Question = 17. Accept a day number between 1-7 and print the corresponding dayname

        System.out.println("Enter the number :");
        int day = scanner.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 2) {
            System.out.println("Thursday");
        } else if (day == 2) {
            System.out.println("Friday");
        } else if (day == 2) {
            System.out.println("Saturday");
        } else if (day == 2) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid.");
        }

    }
}
