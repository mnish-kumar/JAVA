package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question.29- Print the sum of all even & odd numbers in a range seperately.

        System.out.println("Enter numbers : ");
        int n = scanner.nextInt();
        int Even_sum = 0, Odd_sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                Even_sum += i;
            else
                Odd_sum += i;
        }
        System.out.println("Even number sum = " + Even_sum + "\nOdd number sum = " + Odd_sum);
    }
}
