package Basics.LoopsDay12_16.java.doWhile17_19day.java;

import java.util.Scanner;

public class Project_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //40- Print hello until user gives wrong input using do while

        int n = 5;
        int input = 0;
        do {
            System.out.println("Enter value less than 10.");
            System.out.println("Hello");
            input = scanner.nextInt();
        } while (input < 10);

    }
}
