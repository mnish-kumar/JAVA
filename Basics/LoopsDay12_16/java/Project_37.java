package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //37- Accept a number and check if it is a palindromic number (If number and its reverse are equal)
        //       Ex - 12321 - Reverse - 12321

        System.out.println("Enter number :");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = number;
        while (number != 0) {
            //rem
            int rem = number % 10;
            //task
            sum = sum * 10 + rem;
            //reduction
            number = number / 10;
        }
        System.out.println(sum == temp ? "Palindrome" : "Not palindrome");
    }
}
