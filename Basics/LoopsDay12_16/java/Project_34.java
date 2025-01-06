package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //34- Seperate each digit of a number and print it on the new line ex - 123
        //	Output:
        //		3
        //		2
        //		1

        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        while (n != 0) {
            //remainder
            int rem = n % 10;

            //task
            System.out.println(rem);

            //reduction
            n = n / 10;
        }

    }
}
