package Basics.LoopsDay12_16.java;

import java.util.Locale;
import java.util.Scanner;

public class Project_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question.35- Sum of digits of a number, 936 = 18

        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            //rem
            int rem = number % 10;

            //task
            sum = sum + rem;

            //reduction
            number = number / 10;
        }
        System.out.println("Total sum = " + sum);
    }
}
