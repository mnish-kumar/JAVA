package Basics.LoopsDay12_16.java.Nested_loop.java;

import java.util.Scanner;

public class Project_50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Question.50- Mirrored Right Triangle
            *
          * *
        * * *
      * * * *
    * * * * *    */

        System.out.println("Enter n value as much print *.");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
