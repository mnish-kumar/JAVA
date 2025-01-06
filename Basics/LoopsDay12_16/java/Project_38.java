package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //38- Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
        //       Ex- 145 = 1! + 4! + 5! = 145

        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int temp = number;
        int sum = 0;
        while (number != 0) {
            //rem
            int rem = number % 10;

            //factorial
            int fact = 1;
            for (int i = 1; i <= rem; i++)
                fact *= i;

            // sum
            sum += fact;

            //reduction
            number = number / 10;
        }
        System.out.println(sum == temp ? "Strong" : "Weak");
    }
}
