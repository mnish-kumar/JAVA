package Basics.LoopsDay12_16.java.Nested_loop.java;

import java.util.Scanner;

public class Project_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question.47- Right Triangle - Number
        //	1
        //	1 2
        //	1 2 3
        //	1 2 3 4
        //	1 2 3 4 5

        System.out.println("Enter n value as much star print.");
        int n=scanner.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println( );
        }
    }
}
