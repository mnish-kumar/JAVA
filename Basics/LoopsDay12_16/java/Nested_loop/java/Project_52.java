package Basics.LoopsDay12_16.java.Nested_loop.java;

import java.util.Scanner;

public class Project_52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question. 52- V - Min Height = 3
        //		*       *
        //		 *     *
        //		  *   *
        //		   * *
        //		    *

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            //for space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Star printing
            for (int j = 1; j <= n - i; j++) {
                if (j == 1 || j == n - i) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }

            System.out.println();
        }


    }
}
