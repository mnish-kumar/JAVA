package Basics.LoopsDay12_16.java.doWhile17_19day.java;

import java.util.Scanner;

public class Project_44 {
    public static void main(String[] args) {

        int guess = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);

        // Question.Project - Guess Game
        //Write a program that generates a random number and asks the user to guess what the number is.
        //If the user's guess is higher than the random number, the program should display "Too high, try again."
        //If the user's guess is lower than the random number, the program should display "Too low, try again."
        //The program should use a loop that repeats until the user correctly guesses the random number.

        System.out.println("Guess the number between 1--100.");

        do {
            System.out.println("Enter number");
            int user_guess = scanner.nextInt();
            if (user_guess == guess) {
                System.out.println("Winner winner winner chicken dinner");
                break;
            }
            if (user_guess < guess)
                System.out.println("bada_socho");
            else
                System.out.println("chhota_socho");

        } while (true);

    }
}
