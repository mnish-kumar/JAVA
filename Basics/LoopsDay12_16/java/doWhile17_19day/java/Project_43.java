package Basics.LoopsDay12_16.java.doWhile17_19day.java;

import java.util.Scanner;

public class Project_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question.43- Question 22 using Switch

        System.out.println("Enter the alphabet we answer the vowel or consonant.");
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
