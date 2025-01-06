package Basics.LoopsDay12_16.java.Nested_loop.java;

import java.util.Scanner;

public class Project_46 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Question.46- Right Triangle - Star
        //	*
        //	* *
        //	* * *
        //	* * * *
        //	* * * * *

        System.out.println("Enter n value as much print *.");
        int n =scanner.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
