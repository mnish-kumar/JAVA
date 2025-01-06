package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question.31- Print the sum of all factors of a number, 50 -> 1 + 2 + 5 + 10 + 25 = 43

        int number = 50;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Factor of 50 sum = " + sum);
    }
}
