package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question.30- Print all the factors of a number.
        // Which number is completly divided remainder is 0

        int n = 36;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }
}
