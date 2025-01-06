package Basics.LoopsDay12_16.java.Nested_loop.java;

import java.util.Scanner;

public class Project_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question. 49- Inverted Right Triangle
        //	* * * * *
        //	* * * *
        //	* * *
        //	* *
        //	*

//        System.out.println("Enter n value as much print *.");
//        int n = scanner.nextInt();
//
//        for (int i = 1; i <=n; i++) {
//            for (int j = n; j >=i ; j--) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }


        // Try to this method print inverted right angle
        System.out.println("Enter n value as much print *.");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
