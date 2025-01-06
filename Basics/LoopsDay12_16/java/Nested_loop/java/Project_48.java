package Basics.LoopsDay12_16.java.Nested_loop.java;

import java.util.Scanner;

public class Project_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question. 48- Right Triangle - Alphabet
        //	A
        //	A B
        //	A B C
        //	A B C D
        //	A B C D E

        System.out.println("Enter n value as much star print.");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }
}
