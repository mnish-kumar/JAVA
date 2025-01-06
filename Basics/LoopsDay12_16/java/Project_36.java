package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question.36- Accept a number and print its reverse

        System.out.println("Enter number :");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            //rem
            int rem = number % 10;

            //task
            sum = sum * 10 + rem;

            //reduction
            number = number / 10;

        }
        System.out.println("Reverse Number : " + sum);

    }
}
