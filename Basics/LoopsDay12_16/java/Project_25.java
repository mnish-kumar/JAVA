package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question.25- Reverse for loop. Print n to 1.
        System.out.println("Enter n:");

        int n = scanner.nextInt();
        for (int i = n; i >= 1; ) {
            System.out.println(i);
            i--;
        }

    }
}
