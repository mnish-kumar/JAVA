package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //26- Take a number as input and print its table
        //       5 * 1 = 5
        //       5 * 2 = 10 ... up to 10 terms

        int multiplier = 5;
        int terms = 10;
        for (int i = 1; i <= terms; i++) {
            int product = multiplier * i;
            System.out.println(multiplier + " * " + i + " = " + product);
        }

//        for (int i = 5; i <= 50; i += 5) {
//            System.out.println("5 * " + " = " + i);
//        }
        // BOTH METHOD ARE CORRECT.
        //sum=0; sum=sum+i fact=1;
    }
}
