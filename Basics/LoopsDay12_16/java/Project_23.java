package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question.23- Accept an integer and Print hello world n times

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n;) {
            System.out.println("Hello World");
            i++;
        }

    }
}
